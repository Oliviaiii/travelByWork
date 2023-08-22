package com.example.demo.service;

import java.util.List;


import com.example.demo.dto.UpdateConfig;
import com.example.demo.model.HelperMember;

import com.example.demo.dao.HelperMemberDao;

public interface HelperMemberService {
	
	

    Integer createHelperMember(HelperMember helperMember);

    Object updateHelperMember(UpdateConfig updateConfig);

    HelperMember getHelperMemberByAccount(String account);
    
    HelperMember getHelperMemberByUsername(String username);
    
    HelperMember getHelperMemberByEmail(String email);
    
    List<HelperMember> findAll();
}

	
  
