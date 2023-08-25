package com.example.demo.controller;

import com.example.demo.dao.HelperMemberRepository;
import com.example.demo.dao.storeMemberDao;
import com.example.demo.dto.EmailDto;
import com.example.demo.dto.ForgetPassword;
import com.example.demo.model.HelperMember;
import com.example.demo.model.StoreMember;
import com.example.demo.service.Gmailer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

@RestController
public class GmailVerifyController {
    @Autowired
    private HelperMemberRepository helperMemberRepository;
    @Autowired
    private storeMemberDao dao;
    @Autowired
    private PasswordEncoder passwordEncoder;
    
    String lastVerifyCode = "";

    @PostMapping("mailverify")
    public void mailVerify(@RequestBody EmailDto toEmail) throws Exception {
        String to = toEmail.getToEmail();
        String title = "TravelByWork 註冊確認驗證碼";
        String verifyCode = "";
        for (int i = 0; i < 6; i++) {
            verifyCode += Math.round(Math.random() * 9);
        }
        String subject = "請在網頁輸入驗證碼,您的驗證碼為:" + verifyCode;
        lastVerifyCode = verifyCode;
        new Gmailer().sendMail(to, title, subject);
    }

    @PostMapping("confirmMail")
    public ResponseEntity<Boolean> confirm(@RequestBody String verify, HttpSession session) {
        StoreMember storeMember = (StoreMember) session.getAttribute("storesign");
        HelperMember helperMember = (HelperMember) session.getAttribute("sign");
        if (verify.equals(lastVerifyCode)) {
            if (helperMember != null) {
                helperMemberRepository.save(helperMember);
                session.removeAttribute("sign");
                return ResponseEntity.status(HttpStatus.OK).body(true);
            } else if (storeMember != null) {
                dao.save(storeMember);
                session.removeAttribute("storesign");
                return ResponseEntity.status(HttpStatus.OK).body(true);
            }
        }
        return ResponseEntity.status(HttpStatus.OK).body(false);

    }
    @PostMapping("/changemailverify")
    public Boolean mailVerify(@RequestBody ForgetPassword forgetPassword) throws Exception {
        HelperMember helperMember = helperMemberRepository.findHelperMemberByAccount(forgetPassword.getAccount());
        StoreMember member = dao.findStoreMemberByAccount(forgetPassword.getAccount());
        if (helperMember != null) {
            if (helperMember.getEmail().equals(forgetPassword.getEmail())) {
                String title = "TravelByWork 註冊確認驗證碼";
                String verifyCode = "";
                for (int i = 0; i < 6; i++) {
                    verifyCode += Math.round(Math.random() * 9);
                }
                String subject = "請在網頁輸入驗證碼,您的驗證碼為:" + verifyCode;
                lastVerifyCode = verifyCode;
                new Gmailer().sendMail(forgetPassword.getEmail(), title, subject);
                return true;
            } else {
                return false;
            }
        } else if (member != null) {
            if (member.getEmail().equals(forgetPassword.getEmail())) {
                String title = "TravelByWork 註冊確認驗證碼";
                String verifyCode = "";
                for (int i = 0; i < 6; i++) {
                    verifyCode += Math.round(Math.random() * 9);
                }
                String subject = "請在網頁輸入驗證碼,您的驗證碼為:" + verifyCode;
                lastVerifyCode = verifyCode;
                new Gmailer().sendMail(forgetPassword.getEmail(), title, subject);
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }
    @PostMapping("/changepassword")
    public ResponseEntity<Boolean> changePassword(@RequestBody ForgetPassword verify, HttpSession session) {
        HelperMember helperMember = helperMemberRepository.findHelperMemberByAccount(verify.getAccount());
        StoreMember member = dao.findStoreMemberByAccount(verify.getAccount());
        if (helperMember != null) {
            if (verify.getVerify().equals(lastVerifyCode)) {
                String pwd = passwordEncoder.encode(verify.getPassword());
                helperMember.setPassword(pwd);
                helperMemberRepository.save(helperMember);
                return ResponseEntity.status(HttpStatus.OK).body(true);
            }
        } else if (member != null) {
            String pwd = passwordEncoder.encode(verify.getPassword());
            member.setPassword(pwd);
            dao.save(member);
            return ResponseEntity.status(HttpStatus.OK).body(true);
        }
        return ResponseEntity.status(HttpStatus.OK).body(false);

}

}
