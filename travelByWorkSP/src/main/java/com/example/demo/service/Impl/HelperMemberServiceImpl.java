//package com.example.demo.service.Impl;
//
//import com.example.demo.dao.HelperMemberDao;
//import com.example.demo.model.HelperMember;
//import com.example.demo.service.HelperMemberService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.stereotype.Component;
//import org.springframework.web.server.ResponseStatusException;
//
//import java.util.List;
//@Component
//public class HelperMemberServiceImpl implements HelperMemberService {
//
//    @Autowired
//    private HelperMemberDao helperMemberDao;
//    @Override
//    public List<HelperMember> getHelperMember() {
//        return helperMemberDao.getHelperMember();
//    }
//
//    @Override
//    public Integer createHelperMember(HelperMember helperMember) {
//        return helperMemberDao.createHelperMember(helperMember);
//    }
//
//    @Override
//    public Object updateHelperMember(HelperMember helperMember, Integer id) {
//        return helperMemberDao.updateHelperMember(helperMember,id);
//    }
//
//    @Override
//    public Integer deleteHelperMember(Integer id) {
//        return helperMemberDao.deleteHelperMember(id);
//    }
//
//    @Override
//    public HelperMember getHelperMemberById(Integer id) {
//        HelperMember helperMember=helperMemberDao.getHelperMemberById(id);
//        if(helperMember!=null){
//            return helperMember;
//        }else{
//            throw new ResponseStatusException(HttpStatus.BAD_REQUEST);
//        }
//    }
//}
