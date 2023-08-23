package com.example.demo.service;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.storeMemberDao;
import com.example.demo.dto.StoreUpdateConfig;
import com.example.demo.model.storeMember;

@Service
public class storeMemberService {

	@Autowired
	private storeMemberDao dao;

	// 判斷資料有無重複
	public Boolean queryDataExisted(storeMember member) {
		boolean accountExist = dao.existsByAccount(member.getAccount());
		boolean nameExist = dao.existsByStoreName(member.getStoreName());
		boolean emailExist = dao.existsByEmail(member.getEmail());
		boolean mobileExist = dao.existsByMobile(member.getMobile());
		if (accountExist || nameExist || emailExist || mobileExist) {
			return true;
		}
		return false;
	}

	// 註冊店家資料加入資料庫
	public String addmember(storeMember member, HttpSession session) {
		boolean b = queryDataExisted(member);
		if (b) {
			return "新增失敗，資料重複";
		} else {
			session.setAttribute("newMember", member);
			dao.save(member);
			return "新增成功";
		}
	}

	// 判斷登入的帳號密碼
	public String getByAccountAndPassword(HttpSession session, String account, String password) {
		storeMember member = dao.findByAccountAndPassword(account, password);
		if (member != null) {
			session.setAttribute("storeMember", member);
			return "登入成功";
		}
		return "查無此會員";
	}

	// 更新資料
	public String UpdateStoreData(storeMember member) {
		System.out.println(member.toString());
		dao.save(member);
		return "修改成功";
	}

	// oli
	public List<storeMember> findAllStoreMembers() {
		return dao.findAll();
	}
	public storeMember findStoreMemberByEmail(String email) {
        storeMember member = dao.findStoreMemberByEmail(email);
        if (member != null) {
            return member;
        } else {
            return null;
        }
    }
	public storeMember findStoreMemberByAccount(String account) {
        storeMember member = dao.findStoreMemberByAccount(account);
        if (member != null) {
            return member;
        } else {
            return null;
        }
    }
	public Object updateStoreMember(StoreUpdateConfig updateConfig){
        storeMember member = dao.findById(updateConfig.getStorememberid()).orElse(null);
        if (member != null) {
            member.setOwnerName(updateConfig.getOwnername());
            member.setAddress(updateConfig.getAddress());
            member.setPhone(updateConfig.getPhone());
            member.setMobile(updateConfig.getMobile());
            storeMember mem = dao.save(member);
            return mem;
        } else {
            return "執行失敗,資料不存在";
        }
    }
	
}
