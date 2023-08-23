package com.example.demo.service;


import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;
import com.example.demo.dao.adminMemberDao;
import com.example.demo.model.adminMember;
import com.example.demo.model.storeworkList;

@Service
public class adminMemberService {

	@Autowired
	private adminMemberDao dao;
	
	//判斷資料有無重複
	public Boolean queryDataExisted(adminMember member) {	
		boolean accountExist=dao.existsByAccount(member.getAccount());
		boolean mobileExist=dao.existsByMobile(member.getMobile());
		if(accountExist || mobileExist) {
			return true;
		}
		return false;	
	}
	//註冊管理員資料加入資料庫
	public String addmember(adminMember member) {
		boolean b=queryDataExisted(member);
		if(b){ 
			return "管理員資料重複，新增失敗";
		}else {
			dao.save(member);
			return "資料新增成功";
		}
	}
	
	//判斷登入的帳號密碼
	/*public ModelAndView getByAccountAndPassword(HttpSession session,String account,String password) {
		adminMember member=dao.findByAccountAndPassword(account, password);
		if(member!=null) {
			ModelAndView model=new ModelAndView("adminAccount");
			model.addObject("adminmember", member);
			session.setAttribute("adminMember", member);
			return model;
		}
		ModelAndView model=new ModelAndView("adminLogin");
		model.addObject("adminmember", "查無此管理員");
		return model;
	}*/
	public String getByAccountAndPassword(HttpSession session,String account,String password) {
		adminMember member=dao.findByAccountAndPassword(account, password);
		if(member!=null) {	
			session.setAttribute("adminMember", member);
			return "登入成功";
		}
		return "查無此員工";
	}

	//更新資料
	public String UpdateAdminData(adminMember member) {
			System.out.println(member.toString());
			dao.save(member);
			return "密碼修改成功";
	}
	
	//findall
	public List<adminMember> getAllAdminMember() {
		return dao.findAll();
	}
	
}

