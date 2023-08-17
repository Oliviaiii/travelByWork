package com.example.demo.service.Impl;

import com.example.demo.dao.HelperMemberDao;
import com.example.demo.dto.UpdateConfig;
import com.example.demo.model.HelperMember;
import com.example.demo.service.HelperMemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

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
    public HelperMember getHelperMemberByAccount(String account,String password) {
        HelperMember helperMember=helperMemberDao.getHelperMemberByAccount(account);
        if(helperMember.getPassword().equals(password)){
            return helperMember;
        }else{
            return null;
        }
    }
}
