package com.example.demo.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.storeMember;

@Repository
public interface storeMemberDao extends JpaRepository<storeMember,Integer>{

	public boolean existsByAccount(String account);
	public boolean existsByEmail(String email);
	public boolean existsByStoreName(String name);
	public boolean existsByMobile(String mobile);
	public storeMember findByAccountAndPassword(String account,String password);
	storeMember findStoreMemberByAccount(String account);
	storeMember findStoreMemberByEmail(String email);
}

