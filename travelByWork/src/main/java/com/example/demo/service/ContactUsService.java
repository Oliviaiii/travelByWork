package com.example.demo.service;

import com.example.demo.dao.ContactUsDao;
import com.example.demo.model.ContactUs;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ContactUsService {
    @Autowired
    private ContactUsDao contactUsDao;

    public void createContactUs(ContactUs contactUs){
        contactUsDao.save(contactUs);
    }


}

