package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.ContactUs;

public interface ContactUsDao extends JpaRepository<ContactUs, Integer> {

}
