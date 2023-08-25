package com.example.demo.controller;

import com.example.demo.model.ContactUs;
import com.example.demo.service.ContactUsService;
import com.example.demo.service.Gmailer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ContactUsController {
    @Autowired
    private ContactUsService contactUsService;

    @PostMapping("/createcontactus")
    public  void createContactUs(@RequestBody ContactUs contactUs){
        contactUsService.createContactUs(contactUs);
    }

    @PostMapping("sendContactUsCopy")
    public ResponseEntity<String> sendCopy(@RequestBody ContactUs contactUs) throws Exception {
        String title="已收到您的來信"+contactUs.getContactType();
        String subject="寄件者姓名:"+contactUs.getName()+"\n"+
                    "寄件者信箱:"+contactUs.getEmail()+"\n"+
                    "類型:"+contactUs.getContactType()+"\n"+
                    "日期:"+contactUs.getContactDate()+"\n"+
                    "內容:"+contactUs.getMessage();
        String toMail=contactUs.getEmail();
        new Gmailer().sendMail(toMail,title,subject);
        return  ResponseEntity.status(HttpStatus.OK).body("已成功記副本至"+contactUs.getEmail());
    }

}