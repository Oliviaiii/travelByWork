package com.example.demo.controller;

import com.example.demo.dto.AccountConfig;
import com.example.demo.dto.UpdateConfig;
import com.example.demo.model.HelperMember;
import com.example.demo.service.HelperMemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;

@RestController
public class HelperMemberController {

    @Autowired
    private HelperMemberService helperMemberService;

    @PostMapping("/gethelpermember")
    public ResponseEntity<Object> getHelperMember(@RequestBody AccountConfig config, HttpSession session) {
        HelperMember helperMember = helperMemberService.getHelperMemberByAccount(config.getAccount(),config.getPassword());
        if(helperMember!=null) {
            session.setAttribute("user",helperMember);
            session.setMaxInactiveInterval(60);
            return ResponseEntity.status(HttpStatus.OK).body(true);
        }else{
            return ResponseEntity.status(HttpStatus.OK).body(false);
        }
    }

    @PostMapping("/createhelpermember")
    public ResponseEntity<Integer> createHelperMember(@RequestBody HelperMember helperMember) {
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
        Object s = session.getAttribute("user");
        return  ResponseEntity.status(HttpStatus.OK).body(s);
    }

}
