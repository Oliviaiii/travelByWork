package com.example.demo.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.dao.HelperMemberDao;
import com.example.demo.dto.UpdateConfig;
import com.example.demo.model.HelperMember;
import com.example.demo.service.HelperMemberService;

@Component
public class HelperMemberServiceImpl implements HelperMemberService {

	@Autowired
	private HelperMemberDao helperMemberDao;

	@Override
	public Integer createHelperMember(HelperMember helperMember) {
		return helperMemberDao.createHelperMember(helperMember);
	}

	@Override
	public Object updateHelperMember(UpdateConfig updateConfig) {
		return helperMemberDao.updateHelperMember(updateConfig);
	}

	@Override
	public HelperMember getHelperMemberByAccount(String account) {
		return helperMemberDao.getHelperMemberByAccount(account);

	}

	@Override
	public HelperMember getHelperMemberByUsername(String username) {
		return helperMemberDao.getHelperMemberByUsername(username);
	}

	@Override
	public HelperMember getHelperMemberByEmail(String email) {
		return helperMemberDao.getHelperMemberByEmail(email);
	}

	// oli
	public List<HelperMember> findAll() {
		return helperMemberDao.findAll();
	}
}
