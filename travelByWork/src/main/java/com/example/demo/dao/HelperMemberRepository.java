package com.example.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.HelperMember;

public interface HelperMemberRepository extends JpaRepository<HelperMember,Integer> {
    HelperMember findHelperMemberByAccount(String account);

    HelperMember findHelperMemberByUsername(String username);

    HelperMember findHelperMemberByEmail(String email);

    public boolean existsByAccount(String account);
    public HelperMember findByAccount(String account);
    List<HelperMember> findAll();
}
