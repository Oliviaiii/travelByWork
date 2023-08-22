package com.example.demo.controller;

import com.example.demo.dao.HelperMemberDao;
import com.example.demo.dto.AccountConfig;
import com.example.demo.dto.UpdateConfig;
import com.example.demo.model.HelperMember;
import com.example.demo.service.HelperMemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.server.Session;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.context.SecurityContextImpl;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

import javax.servlet.http.HttpSession;

@RestController
public class HelperMemberController {
    @Autowired
    private PasswordEncoder passwordEncoder;
    @Autowired
    private HelperMemberService helperMemberService;

    @PostMapping("/gethelpermember")
    public void getHelperMember(@RequestBody AccountConfig accountConfig) {

    }
    @PostMapping("/createsession")
    public ResponseEntity<String> createsession(@RequestBody HelperMember helperMember,HttpSession session) {
        HelperMember h1=helperMemberService.getHelperMemberByAccount(helperMember.getAccount());
        HelperMember h2=helperMemberService.getHelperMemberByUsername(helperMember.getUsername());
        HelperMember h3=helperMemberService.getHelperMemberByEmail(helperMember.getEmail());
        if(h1!=null) {
            return  ResponseEntity.status(HttpStatus.OK).body("account");
        }
       else if(h2!=null) {
            return  ResponseEntity.status(HttpStatus.OK).body("username");
        }
        else if(h3!=null) {
            return  ResponseEntity.status(HttpStatus.OK).body("email");
        }else{
            String pwd = passwordEncoder.encode(helperMember.getPassword());
            helperMember.setPassword(pwd);
            session.setAttribute("sign", helperMember);
            Object o = session.getAttribute("sign");
            System.out.println(o);
            return ResponseEntity.status(HttpStatus.OK).build();
        }
    }

    @PostMapping("/createhelpermember")
    public ResponseEntity<Integer> createHelperMember(@RequestBody HelperMember helperMember) {
        String pwd = passwordEncoder.encode(helperMember.getPassword());
        helperMember.setPassword(pwd);
        Integer createdId = helperMemberService.createHelperMember(helperMember);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdId);
    }

    @PutMapping("/updatehelpermember")
    public ResponseEntity<Object> updateHelperMember(@RequestBody UpdateConfig updateConfig) {
        Object member = helperMemberService.updateHelperMember(updateConfig);
        if (member.getClass().equals(String.class)) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("查無資料");
        } else {
            return ResponseEntity.status(HttpStatus.OK).body("更新成功");
        }
    }

    @GetMapping("/getSession")
    public ResponseEntity<Object> getSession(HttpSession session) {
        String securityContext = SecurityContextHolder.getContext().getAuthentication().getName();
        HelperMember helperMember=helperMemberService.getHelperMemberByAccount(securityContext);
        return ResponseEntity.status(HttpStatus.OK).body(helperMember);
    }

    @GetMapping("/getCreateSession")
    public ResponseEntity<Object> getCreateSession(HttpSession session) {
        Object helperMember=session.getAttribute("sign");
        return ResponseEntity.status(HttpStatus.OK).body(helperMember);
    }
    
    //oli
    @GetMapping("/getHelperMembers")
    public List<HelperMember> getHelperMembers() {
        return helperMemberService.findAll();
    }
}
