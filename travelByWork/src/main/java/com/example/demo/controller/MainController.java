package com.example.demo.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;


@RestController
@RequestMapping("/")
public class MainController {
   
	@RequestMapping("homePage")
	public void homePage(HttpServletResponse response) throws IOException
	{
		response.sendRedirect("homePage.html");
		
	}
	@RequestMapping("what")
    public void what(HttpServletResponse response) throws IOException {
        response.sendRedirect("what.html");
    }

    @RequestMapping("helperLogin")
    public void helpLogin(HttpServletResponse response) throws IOException {
        response.sendRedirect("helperLogin.html");
    }

    @RequestMapping("storeLogin")
    public void storeLogin(HttpServletResponse response) throws IOException {
        response.sendRedirect("storeLogin.html");
    }

    @RequestMapping("postJob")
    public void postJob(HttpServletResponse response) throws IOException {
        response.sendRedirect("postJob.html");
    }

    @RequestMapping("share")
    public void share(HttpServletResponse response) throws IOException {
        response.sendRedirect("share.html");
    }

    @RequestMapping("helperSignUp")
    public void helperSignUp(HttpServletResponse response) throws IOException {
        response.sendRedirect("helperSignUp.html");
    }

    @RequestMapping("storeSignUp")
    public void storeSignUp(HttpServletResponse response) throws IOException {
        response.sendRedirect("storeSignUp.html");
    }

    @RequestMapping("contactUs")
    public void contactUs(HttpServletResponse response) throws IOException {
        response.sendRedirect("contactUs.html");
    }

    @RequestMapping("emailProof")
    public void emailProof(HttpServletResponse response) throws IOException {
        response.sendRedirect("emailProof.html");
    }
    @RequestMapping(value = "emailProof2")
    public ModelAndView emailProof2() throws IOException {
    	ModelAndView model=new ModelAndView("emailProof2.html");
    	return model;
    }
    
    @RequestMapping("emailSuccess")
    public void emailSuccess(HttpServletResponse response) throws IOException {
        response.sendRedirect("emailSuccess.html");
    }
    @RequestMapping(value = "emailSuccess2")
    public ModelAndView emailSuccess2() throws IOException {
    	ModelAndView model=new ModelAndView("emailSuccess2.html");
    	return model;
    }
    
    @RequestMapping("forgetPassword")
    public void forgetPassword(HttpServletResponse response) throws IOException {
        response.sendRedirect("forgetPassword.html");
    }

    @RequestMapping("forgetPasswordSuccess")
    public void forgetPasswordSuccess(HttpServletResponse response) throws IOException {
        response.sendRedirect("forgetPasswordSuccess.html");
    }

    @RequestMapping(value = "helperAccount")
    public void helperAccount(HttpServletResponse response) throws IOException {
        response.sendRedirect("helperAccount.html"); 
    }
    
    @RequestMapping(value = "storeAccount")
    public void storeAccount(HttpServletResponse response) throws IOException {
        response.sendRedirect("storeAccount.html"); 
    }

    @RequestMapping(value = "adminAccount")
    public void adminAccount(HttpServletResponse response) throws IOException {
        response.sendRedirect("adminAccount.html"); 
    }
    
    @RequestMapping(value = "storeAccount2")
    public ModelAndView storeAccount2(HttpServletResponse response) throws IOException {
    	ModelAndView model=new ModelAndView("storeAccount2.html");
    	return model;
    }

}