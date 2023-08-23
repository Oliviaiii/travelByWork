package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.adminMember;


@Repository
public interface adminMemberDao extends JpaRepository<adminMember,Integer> {

	public boolean existsByAccount(String account);
	public boolean existsByMobile(String mobile);
	public adminMember findByAccountAndPassword(String account,String password);
}
