package com.example.demo.controller;

import com.example.demo.dao.HelperMemberRepository;
import com.example.demo.dto.EmailDto;
import com.example.demo.model.HelperMember;
import com.example.demo.service.Gmailer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

@RestController
public class GmailVerifyController {
    @Autowired
    private HelperMemberRepository helperMemberRepository;

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
        if (verify.equals(lastVerifyCode)) {
            HelperMember helperMember = (HelperMember) session.getAttribute("sign");
            helperMemberRepository.save(helperMember);
            return ResponseEntity.status(HttpStatus.OK).body(true);
        } else {
            return ResponseEntity.status(HttpStatus.OK).body(false);
        }

    }

}
