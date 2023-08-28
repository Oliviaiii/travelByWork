package com.example.demo.controller;

import com.example.demo.dao.HelperMemberDao;
import com.example.demo.dao.helpercvDao;
import com.example.demo.dto.AccountConfig;
import com.example.demo.dto.UpdateConfig;
import com.example.demo.model.HelperMember;
import com.example.demo.model.StoreMember;
import com.example.demo.model.helpercv;
import com.example.demo.service.HelperMemberService;
import com.example.demo.service.storeMemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class HelperMemberController {
    @Autowired
    private PasswordEncoder passwordEncoder;
    @Autowired
    private HelperMemberService helperMemberService;
    @Autowired
    private storeMemberService service;
    @Autowired
	private helpercvDao helpercvdao;
    
    @Autowired
    private HelperMemberDao dao;
    @PostMapping("/gethelpermember")
    public void getHelperMember(@RequestBody AccountConfig accountConfig) {

    }
    
    @GetMapping("/clearSession")
    public void clearSession(){

    }
    
    @PostMapping("/createsession")
    public ResponseEntity<String> createsession(@RequestBody HelperMember helperMember,HttpSession session) {
        HelperMember h1=helperMemberService.getHelperMemberByAccount(helperMember.getAccount());
        HelperMember h2=helperMemberService.getHelperMemberByUsername(helperMember.getUsername());
        HelperMember h3=helperMemberService.getHelperMemberByEmail(helperMember.getEmail());
        StoreMember s1=service.findStoreMemberByAccount(helperMember.getAccount());
        if(h1!=null) {
            return  ResponseEntity.status(HttpStatus.OK).body("account");
        }
       else if(h2!=null) {
            return  ResponseEntity.status(HttpStatus.OK).body("username");
        }
        else if(h3!=null) {
            return  ResponseEntity.status(HttpStatus.OK).body("email");
        }else if(s1!=null){
            return  ResponseEntity.status(HttpStatus.OK).body("account");
        }
        else{
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
        helpercv helpercv=helpercvdao.findByAccount(securityContext);
        Map<String, Object> userMap = new HashMap<>();
        userMap.put("helpercv", helpercv);
        userMap.put("helperMember", helperMember);
        return ResponseEntity.status(HttpStatus.OK).body(userMap);
    }

    @GetMapping("/getCreateSession")
    public ResponseEntity<Object> getCreateSession(HttpSession session) {
        Object helperMember=session.getAttribute("sign");
        Object storeMember=session.getAttribute("storesign");
        if(helperMember!=null) {
            return ResponseEntity.status(HttpStatus.OK).body(helperMember);
        } else if (storeMember!=null) {
            return ResponseEntity.status(HttpStatus.OK).body(storeMember);
        }else{
            return ResponseEntity.status(HttpStatus.ACCEPTED).body(false);
        }
    }
    
    //oli
    @GetMapping("/getHelperMembers")
    public List<HelperMember> getHelperMembers() {
        return helperMemberService.findAll();
    }
    @PostMapping("/googleLogin")
    public String googlelogin(@RequestBody HelperMember helperMember,HttpSession session) {

    	HelperMember member=helperMemberService.getHelperMemberByEmail(helperMember.getEmail());
    	if(member==null) {
    		helperMemberService.createHelperMember(helperMember);
    		HelperMember newMember=helperMemberService.getHelperMemberByAccount(helperMember.getAccount());
    		Map<String, Object> userMap = new HashMap<>();
            userMap.put("helperMember", newMember);
    		session.setAttribute("user",userMap);
            session.setMaxInactiveInterval(60);
        	return "成功";
    	}else {
    		helpercv helpercv=helpercvdao.findByAccount(helperMember.getAccount());
            Map<String, Object> userMap = new HashMap<>();
            userMap.put("helpercv", helpercv);
            userMap.put("helperMember", member);
    		session.setAttribute("user",userMap);
            session.setMaxInactiveInterval(60);
    		return "成功";
    	}
    }
    @GetMapping("/getGoogleSession")
    public ResponseEntity<Object> getGoogleSession(HttpSession session) {
        return ResponseEntity.status(HttpStatus.OK).body(session.getAttribute("user"));
    }

    //刪除helperMember
    @DeleteMapping("/deleteHelperMemebr/{id}")
    public String deleteHelperMemebr(@PathVariable int id) {
    	dao.deleteById(id);
    	return "刪除成功";
    }

    @GetMapping("/getLoginSession")
    public ResponseEntity<Object> getLoginSession(HttpSession session) {
        String securityContext = SecurityContextHolder.getContext().getAuthentication().getName();
        HelperMember helperMember = helperMemberService.getHelperMemberByAccount(securityContext);
        StoreMember member = service.findStoreMemberByAccount(securityContext);
        if (helperMember != null) {
            return ResponseEntity.status(HttpStatus.OK).body(helperMember);
        } else if (member != null) {
            return ResponseEntity.status(HttpStatus.OK).body(member);
        } else {
            return ResponseEntity.status(HttpStatus.OK).body("無此會員");
        }
    }
}