package com.example.demo.dao.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.dao.HelperMemberDao;
import com.example.demo.dao.HelperMemberRepository;
import com.example.demo.dto.UpdateConfig;
import com.example.demo.model.HelperMember;

@Component
public class HelperMemberDaoImpl implements HelperMemberDao {
	@Autowired
	private HelperMemberRepository helperMemberRepository;

	@Override
	public Integer createHelperMember(HelperMember helperMember) {
		Integer createdId = helperMemberRepository.save(helperMember).getHelpermemberid();
		return createdId;
	}

	@Override
	public Object updateHelperMember(UpdateConfig updateConfig) {
		HelperMember member = helperMemberRepository.findById(updateConfig.getHelpermemberid()).orElse(null);
		if (member != null) {
			member.setHelpermemberid(updateConfig.getHelpermemberid());
			member.setPassword(updateConfig.getPassword());
			member.setUsername(updateConfig.getUsername());
			member.setMobile(updateConfig.getMobile());
			HelperMember mem = helperMemberRepository.save(member);
			return mem;
		} else {
			return "執行失敗,資料不存在";
		}

	}

	@Override
	public HelperMember getHelperMemberByAccount(String account) {
		HelperMember helperMember = helperMemberRepository.findHelperMemberByAccount(account);
		if (helperMember != null) {
			return helperMember;
		} else {
			return null;
		}
	}

	@Override
	public HelperMember getHelperMemberByUsername(String username) {
		HelperMember helperMember = helperMemberRepository.findHelperMemberByUsername(username);
		if (helperMember != null) {
			return helperMember;
		} else {
			return null;
		}
	}

	@Override
	public HelperMember getHelperMemberByEmail(String email) {
		HelperMember helperMember = helperMemberRepository.findHelperMemberByEmail(email);
		if (helperMember != null) {
			return helperMember;
		} else {
			return null;
		}
	}

	// oli
	public List<HelperMember> findAll() {
		return helperMemberRepository.findAll();
	}
}
