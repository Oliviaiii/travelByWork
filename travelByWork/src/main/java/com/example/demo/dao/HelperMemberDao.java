package com.example.demo.dao;

import com.example.demo.dto.UpdateConfig;
import com.example.demo.model.HelperMember;

import java.util.List;

public interface HelperMemberDao {

    Integer createHelperMember(HelperMember helperMember);

    Object updateHelperMember(UpdateConfig updateConfig);

    HelperMember getHelperMemberByAccount(String account);

    HelperMember getHelperMemberByUsername(String username);

    HelperMember getHelperMemberByEmail(String email);

    
    //oli
	List<HelperMember> findAll();
}
