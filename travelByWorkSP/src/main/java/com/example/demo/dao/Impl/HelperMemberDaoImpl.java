//package com.example.demo.dao.Impl;
//
//import com.example.demo.HelperMemberRepository;
//import com.example.demo.dao.HelperMemberDao;
//import com.example.demo.model.HelperMember;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Component;
//
//import java.util.List;
//
//@Component
//public class HelperMemberDaoImpl implements HelperMemberDao {
//    @Autowired
//    private HelperMemberRepository helperMemberRepository;
//
//    @Override
//    public List<HelperMember> getHelperMember() {
//        List<HelperMember> helperMemberList=helperMemberRepository.findAll();
//        return helperMemberList;
//    }
//
//    @Override
//    public Integer createHelperMember(HelperMember helperMember) {
//        Integer createdId=helperMemberRepository.save(helperMember).getId();
//        return createdId;
//    }
//
//    @Override
//    public Object updateHelperMember(HelperMember helperMember, Integer id) {
//        HelperMember member=helperMemberRepository.findById(id).orElse(null);
//        if(member!=null){
//            helperMember.setId(id);
//            HelperMember mem=helperMemberRepository.save(helperMember);
//            return mem;
//        }else{
//            return "執行失敗,資料不存在";
//        }
//
//    }
//
//    @Override
//    public Integer deleteHelperMember(Integer id) {
//        helperMemberRepository.deleteById(id);
//        return id;
//    }
//
//    @Override
//    public HelperMember getHelperMemberById(Integer id) {
//        HelperMember helperMember=helperMemberRepository.findById(id).orElse(null);
//        return helperMember;
//    }
//}
