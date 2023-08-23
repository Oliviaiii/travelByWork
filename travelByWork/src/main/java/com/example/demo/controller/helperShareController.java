package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.helperShareDao;
import com.example.demo.model.helperShare;
import com.example.demo.service.helperShareService;

@RestController
public class helperShareController {

	@Autowired
	private helperShareDao helperShareDao;

	@Autowired
	private helperShareService service;

	@GetMapping("/getShares")
	public List<helperShare> getShares() {
		return helperShareDao.findAll();
	}

	@PostMapping("/addshare")
	public ResponseEntity<String> addHelperShare(@RequestBody helperShare helper) {
		// 使用 helperShareRepository 將新的 helperShare 物件存入資料庫
		helperShare savedHelper = helperShareDao.save(helper);

		if (savedHelper != null) {
			return ResponseEntity.ok("心得新增成功");
		} else {
			return ResponseEntity.badRequest().body("心得新增失敗");
		}
	}
}
