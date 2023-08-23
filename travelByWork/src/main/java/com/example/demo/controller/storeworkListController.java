package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.storeworkList;
import com.example.demo.service.storeworkListService;

@RestController // oli
public class storeworkListController {
	@Autowired
	private storeworkListService slservice;

	@GetMapping("/getPostJobs")
	public List<storeworkList> getPostJobs() {
		return slservice.getAllStoreworkList();
	}

	@PostMapping(value = "/createStoreWork")
	public String addsl(@RequestBody storeworkList sl) {
		return slservice.addsl(sl);
	}

}
