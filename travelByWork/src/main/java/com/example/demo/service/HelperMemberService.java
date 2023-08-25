package com.example.demo.service;

import com.example.demo.dao.HelperMemberDao;
import com.example.demo.dto.UpdateConfig;
import com.example.demo.model.HelperMember;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class HelperMemberService {
    @Autowired
    private HelperMemberDao helperMemberDao;


    public Integer createHelperMember(HelperMember helperMember) {
        Integer createdId = helperMemberDao.save(helperMember).getHelpermemberid();
        return createdId;
    }


    public Object updateHelperMember(UpdateConfig updateConfig) {
        HelperMember member = helperMemberDao.findById(updateConfig.getHelpermemberid()).orElse(null);
        if (member != null) {
            member.setHelpermemberid(updateConfig.getHelpermemberid());
            member.setPassword(updateConfig.getPassword());
            member.setUsername(updateConfig.getUsername());
            member.setMobile(updateConfig.getMobile());
            HelperMember mem = helperMemberDao.save(member);
            return mem;
        } else {
            return "執行失敗,資料不存在";
        }

    }


    public HelperMember getHelperMemberByAccount(String account) {
        HelperMember helperMember = helperMemberDao.findHelperMemberByAccount(account);
        if (helperMember != null) {
            return helperMember;
        } else {
            return null;
        }
    }


    public HelperMember getHelperMemberByUsername(String username) {
        HelperMember helperMember = helperMemberDao.findHelperMemberByUsername(username);
        if (helperMember != null) {
            return helperMember;
        } else {
            return null;
        }
    }


    public HelperMember getHelperMemberByEmail(String email) {
        HelperMember helperMember = helperMemberDao.findHelperMemberByEmail(email);
        if (helperMember != null) {
            return helperMember;
        } else {
            return null;
        }
    }


    public List<HelperMember> findAll() {

        return helperMemberDao.findAll();
    }
}
