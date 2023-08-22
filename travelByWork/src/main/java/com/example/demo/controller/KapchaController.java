package com.example.demo.controller;

import com.example.demo.dto.VerifyCodeText;
import com.google.code.kaptcha.impl.DefaultKaptcha;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.imageio.ImageIO;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;

@Controller
public class KapchaController {
    @Autowired
    private DefaultKaptcha defaultKaptcha;

    @GetMapping("/loginconfirm")
    public void setDefaultKaptcha(HttpServletRequest request, HttpServletResponse response) throws  Exception{
        byte[] kapchaStream=null;
        ByteArrayOutputStream imgOutputStream=new ByteArrayOutputStream();
        try{
            String verifyCode=defaultKaptcha.createText();
            request.getSession().setAttribute("verifyCode",verifyCode);
            BufferedImage image=defaultKaptcha.createImage(verifyCode);
            ImageIO.write(image,"jpg",imgOutputStream);
        }catch (IllegalArgumentException e){
            e.printStackTrace();
            return;
        }
        kapchaStream=imgOutputStream.toByteArray();
        response.setContentType("image/jpeg");
        ServletOutputStream servletOutputStream=response.getOutputStream();
        servletOutputStream.write(kapchaStream);
        servletOutputStream.flush();
        servletOutputStream.close();
    }
    @ResponseBody
    @PostMapping("/klogin")
    public String loginByImage(@RequestBody VerifyCodeText verifyCode, HttpSession session){
        String kapcha=session.getAttribute("verifyCode").toString();
        if((verifyCode.getVerifyCode()).equals(kapcha)){
            return "success";
        }
        return "failure";
    }
}
