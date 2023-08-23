package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.helperShare;

@Repository
//public interface helperShareDao extends JpaRepository<helperShare, Integer>
public interface helperShareDao extends JpaRepository<helperShare, String> {
	public helperShare save(helperShare helper);
}
