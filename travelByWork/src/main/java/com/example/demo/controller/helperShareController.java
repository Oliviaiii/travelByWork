package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.dao.helperShareDao;
import com.example.demo.dao.helpercvDao;
import com.example.demo.model.helperShare;
import com.example.demo.model.helpercv;
import com.example.demo.service.helperShareService;

import java.util.List;

@RestController
public class helperShareController {

	@Autowired
    private helperShareDao helperShareDao;
    @Autowired
    private helpercvDao helpercvdao;
    @Autowired
    private helperShareService service;

    //取得全部心得分享
    @GetMapping("/getShares")
    public List<helperShare> getShares() {
        return helperShareDao.findAll();
    }
    //新增心得分享
    @PostMapping("/addshare")
    public ResponseEntity<String> addHelperShare(@RequestBody helperShare helper) {
    	 return service.addShare(helper);
    }
    //刪除心得分享
	@DeleteMapping("/deleteHelperShare/{id}")
    public String deleteHelperShare(@PathVariable int id) {
		helperShareDao.deleteById(id);
    	return "刪除成功";
    }
    
    //更新or新增履歷、大頭貼
	@PostMapping("/updatehelpercv")
	public String updateHelpercv(@RequestBody helpercv cv) {
		System.out.println(cv.toString());
		helpercvdao.save(cv);
		return "成功";
	}
    //刪除helpercv
	@DeleteMapping("/deleteHelpercv/{id}")
    public String deleteHelperCV(@PathVariable int id) {
		helpercvdao.deleteById(id);
    	return "刪除成功";
    }
}