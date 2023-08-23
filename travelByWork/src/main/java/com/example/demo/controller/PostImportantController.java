package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.model.PostImportant;
import com.example.demo.service.PostImportantService;

@Controller
@RequestMapping("/posts")
public class PostImportantController {
	@Autowired
	private final PostImportantService postImportantService;

	public PostImportantController(PostImportantService postImportantService) {
		this.postImportantService = postImportantService;
	}

	// 顯示所有文章列表
	@GetMapping 
	public String listPosts(Model model) {
		model.addAttribute("posts", postImportantService.getAllPosts());
		return "post-list"; // 返回文章列表的視圖模板名稱
	}

	// 查看單篇文章的詳細資訊
	@GetMapping("/{id}")
	public String viewPost(@PathVariable Integer id, Model model) {
		PostImportant post = postImportantService.getPostById(id);
		model.addAttribute("post", post);
		return "post-details"; // 返回文章詳情的視圖模板名稱
	}

	// 顯示創建文章的表單
	@GetMapping("/create")
	public String createPostForm(Model model) {
		model.addAttribute("post", new PostImportant());
		return "post-form"; // 返回創建文章的視圖模板名稱
	}

	// 處理創建文章的提交
	@PostMapping("/create")
	public String createPost(@ModelAttribute PostImportant post) {
		postImportantService.savePost(post);
		return "redirect:/posts"; // 重定向到文章列表頁面
	}

	// 處理刪除文章的請求
	@GetMapping("/{id}/delete")
	public String deletePost(@PathVariable Integer id) {
		postImportantService.deletePost(id);
		return "redirect:/posts"; // 重定向到文章列表頁面
	}
}
