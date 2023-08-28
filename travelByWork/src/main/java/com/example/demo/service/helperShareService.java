package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.demo.dao.helperShareDao;
import com.example.demo.model.helperShare;

@Service
public class helperShareService {

	@Autowired
	private helperShareDao dao;

	// 使用 helperShareRepository 將新的 helperShare 物件存入資料庫
	public ResponseEntity<String> addShare(helperShare helper) {
		helperShare savedHelper = dao.save(helper);
		if (savedHelper != null) {
			return ResponseEntity.ok("心得新增成功");
		} else {
			return ResponseEntity.badRequest().body("心得新增失敗");
		}
	}

}
