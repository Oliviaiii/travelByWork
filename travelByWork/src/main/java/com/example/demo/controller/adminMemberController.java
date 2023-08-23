package com.example.demo.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.adminMemberDao;
import com.example.demo.model.adminMember;
import com.example.demo.model.storeworkList;
import com.example.demo.service.adminMemberService;



@RestController
public class adminMemberController {

	@Autowired
	private adminMemberDao dao;
	@Autowired
	private adminMemberService service;
	
	//註冊資料加入資料庫
	@PostMapping("/adminsignup")
	public String signup(@RequestBody adminMember member) {
	    return service.addmember(member);
	}

	
	//登入
	/*@GetMapping("/adminlogin")
	public ModelAndView loginQuery(HttpSession session,@RequestParam(value="account") String account,@RequestParam(value="password") String password) {
		return service.getByAccountAndPassword(session, account, password);
	}*/
	@GetMapping("/adminlogin")
	public String loginQuery(HttpServletRequest request,@RequestParam(value="account") String account,@RequestParam(value="password") String password) {
		HttpSession session = request.getSession();
		return service.getByAccountAndPassword(session, account, password);
	}

	//更新員工資料
	@PostMapping("/adminupdate")			
	public String updateData(@RequestBody adminMember member,HttpSession session) {
		session.setAttribute("adminMember", member);
		return service.UpdateAdminData(member);
	}
	
	@GetMapping("/getAdmin")
	public List<adminMember> getAdmin() {
		return service.getAllAdminMember();
	}

	
}
