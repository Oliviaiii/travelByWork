package com.example.demo.controller;

import java.sql.SQLException;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.dao.storeworkListDao;
import com.example.demo.model.helperShare;
import com.example.demo.model.storeMember;
import com.example.demo.model.storeworkList;
import com.example.demo.service.storeworkListService;

@RestController //oli
public class storeworkListController {
    @Autowired
    private storeworkListService slservice;

    @GetMapping("/getPostJobs")
    public List<storeworkList> getPostJobs() {
        return slservice.getAllStoreworkList();
    }

    @PostMapping(value = "/storeAccount2")
    public String addsl(@RequestBody storeworkList sl) {
        return slservice.addsl(sl);
    }
}

