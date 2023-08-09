package com.springformmvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class testController {

	@GetMapping("/homePage")
	public String homePage() {
		return "homePage";
	}
	@RequestMapping("/what")
	public String what() {
		return "what";
	}
	@RequestMapping("/helperLogin")
	public String helpLogin() {
		return "helperLogin";
	}
	@RequestMapping("/storeLogin")
	public String storeLogin() {
		return "storeLogin";
	}
	@RequestMapping("/postJob")
	public String postJob() {
		return "postJob";
	}
	@RequestMapping("/share")
	public String share() {
		return "share";
	}
	@RequestMapping("/helperSignUp")
	public String helperSignUp() {
		return "helperSignUp";
	}
	@RequestMapping("/storeSignUp")
	public String storeSignUp() {
		return "storeSignUp";
	}
	@RequestMapping("/contactUs")
	public String contactUs() {
		return "contactUs";
	}
	@RequestMapping("/emailSuccess")
	public String emailSuccess() {
		return "emailSuccess";
	}
	@RequestMapping("/forgetPassword")
	public String forgetPassword() {
		return "forgetPassword";
	}
}
