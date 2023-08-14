//package com.example.demo.model;
//
//import com.sun.jdi.event.StepEvent;
//
//import javax.persistence.*;
//
//@Entity
//@Table(name = "helpermember")
//public class HelperMember {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Integer id;
//    private String account;
//    private String password;
//    private String username;
//    private String name;
//    private String mobile;
//    private String email;
//
//    public HelperMember() {
//    }
//
//    public HelperMember(Integer id, String account, String password, String username, String name, String mobile, String email) {
//        this.id = id;
//        this.account = account;
//        this.password = password;
//        this.username = username;
//        this.name = name;
//        this.mobile = mobile;
//        this.email = email;
//    }
//
//    public Integer getId() {
//        return id;
//    }
//
//    public void setId(Integer id) {
//        this.id = id;
//    }
//
//    public String getAccount() {
//        return account;
//    }
//
//    public void setAcount(String account) {
//        this.account = account;
//    }
//
//    public String getPassword() {
//        return password;
//    }
//
//    public void setPassword(String password) {
//        this.password = password;
//    }
//
//    public String getUsername() {
//        return username;
//    }
//
//    public void setUsername(String username) {
//        this.username = username;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getMobile() {
//        return mobile;
//    }
//
//    public void setMobile(String mobile) {
//        this.mobile = mobile;
//    }
//
//    public String getEmail() {
//        return email;
//    }
//
//    public void setEmail(String email) {
//        this.email = email;
//    }
//
//    @Override
//    public String toString() {
//        return "HelperMember{" +
//                "id=" + id +
//                ", account='" + account + '\'' +
//                ", password='" + password + '\'' +
//                ", username='" + username + '\'' +
//                ", name='" + name + '\'' +
//                ", mobile='" + mobile + '\'' +
//                ", email='" + email + '\'' +
//                '}';
//    }
//}
