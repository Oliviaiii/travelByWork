package com.example.demo.dto;

public class UpdateConfig {
    private Integer helpermemberid;
    private String password;
    private String username;
    private String mobile;

    public UpdateConfig(Integer helpermemberid, String password, String username, String mobile) {
        this.helpermemberid = helpermemberid;
        this.password = password;
        this.username = username;
        this.mobile = mobile;
    }

    public UpdateConfig() {
    }

    public Integer getHelpermemberid() {
        return helpermemberid;
    }

    public void setHelpermemberid(Integer helpermemberid) {
        this.helpermemberid = helpermemberid;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    @Override
    public String toString() {
        return "updateConfig{" +
                "helpermemberid=" + helpermemberid +
                ", password='" + password + '\'' +
                ", username='" + username + '\'' +
                ", mobile='" + mobile + '\'' +
                '}';
    }
}
