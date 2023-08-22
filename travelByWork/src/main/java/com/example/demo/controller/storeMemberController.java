package com.example.demo.controller;

import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.model.helperShare;
import com.example.demo.model.storeMember;
import com.example.demo.dao.storeMemberDao;
import com.example.demo.service.storeMemberService;

@RestController
public class storeMemberController {
	
	@Autowired
	private storeMemberDao dao;	
	@Autowired
	private storeMemberService service;
	
	
	//註冊資料加入資料庫
	@PostMapping("/storesignup")			
	public String signup(@RequestBody storeMember member,HttpServletRequest request) {
		HttpSession session = request.getSession();
		return service.addmember(member,session);
	}
	//登入
	@GetMapping("/storelogin")
	public String loginQuery(HttpServletRequest request,@RequestParam(value="account") String account,@RequestParam(value="password") String password) {
		HttpSession session = request.getSession();
		return service.getByAccountAndPassword(session, account, password);
	}
	//更新會員資料
	@PostMapping("/storeupdata")			
	public String updateData(@RequestBody storeMember member,HttpSession session) {
		session.setAttribute("storeMember", member);
		return service.UpdateStoreData(member);
	}

	@GetMapping("/getStoreMember")
	public List<storeMember> findAllStoreMembers() {
        return dao.findAll();
    }
	
}
