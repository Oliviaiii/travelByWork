//package com.example.demo.controller;
//
//import com.example.demo.model.HelperMember;
//import com.example.demo.service.HelperMemberService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//
//import javax.persistence.criteria.CriteriaBuilder;
//import java.util.List;
//
//@RestController
//public class HelperMemberController {
//
//    @Autowired
//    private HelperMemberService helperMemberService;
//
//    @GetMapping("/gethelpermember")
//    public ResponseEntity<List<HelperMember>> getHelperMember() {
//        List<HelperMember> helperMemberList = helperMemberService.getHelperMember();
//        return ResponseEntity.status(HttpStatus.OK).body(helperMemberList);
//    }
//
//    @GetMapping("/gethelpermember/{id}")
//    public ResponseEntity<HelperMember> getHelperMemberById(@PathVariable Integer id){
//        HelperMember helperMember=helperMemberService.getHelperMemberById(id);
//        return ResponseEntity.status(HttpStatus.OK).body(helperMember);
//    }
//
//
//    @PostMapping("/createhelpermember")
//    public ResponseEntity<Integer> createHelperMember(@RequestBody HelperMember helperMember) {
//        Integer createdId = helperMemberService.createHelperMember(helperMember);
//        return ResponseEntity.status(HttpStatus.CREATED).body(createdId);
//    }
//
//    @PutMapping("/updatehelpermember/{id}")
//    public ResponseEntity<Object> updateHelperMember(@RequestBody HelperMember helperMember, @PathVariable Integer id) {
//        Object member = helperMemberService.updateHelperMember(helperMember, id);
//        if (member.getClass().equals(String.class)) {
//            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(member);
//        } else {
//            return ResponseEntity.status(HttpStatus.OK).body(member);
//        }
//    }
//
//    @DeleteMapping("/deletehelpermember/{id}")
//    public ResponseEntity<String> deleteHelperMember(@PathVariable Integer id){
//        helperMemberService.deleteHelperMember(id);
//        return ResponseEntity.status(HttpStatus.OK).body("成功");
//    }
//
//}
