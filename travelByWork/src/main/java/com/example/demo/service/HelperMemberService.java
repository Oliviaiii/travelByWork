package com.example.demo.service;

import com.example.demo.dto.UpdateConfig;
import com.example.demo.model.HelperMember;

public interface HelperMemberService {


    Integer createHelperMember(HelperMember helperMember);

    Object updateHelperMember(UpdateConfig updateConfig);

    HelperMember getHelperMemberByAccount(String account,String password);
}
