package com.example.demo.service;

import com.example.demo.model.helperShare;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.helperShareDao;
import com.example.demo.model.HelperMember;


@Service
public class helperShareService {
	
	@Autowired
	private helperShareDao dao;

	public String addShare(helperShare helper) {

			dao.save(helper);
			return "心得新增成功";
		}
	
	
	
}
