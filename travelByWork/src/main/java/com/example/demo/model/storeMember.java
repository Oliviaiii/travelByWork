package com.example.demo.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="storemember")
public class storeMember {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer storememberid;
	@Column(name="storename")
	private String storeName;
	@Column(name="ownername")
	private String ownerName;
	private String account;
	private String password;
	private String email;
	private String mobile;
	private String phone;
	private String address;
	@Column(name="createtime")
	private String createTime;
	

	public storeMember() {}
	public storeMember(String storeName, String ownerName, String account, String password, String email, String mobile,
			String phone, String address,String createTime) {
		super();
		this.storeName = storeName;
		this.ownerName = ownerName;
		this.account = account;
		this.password = password;
		this.email = email;
		this.mobile = mobile;
		this.phone = phone;
		this.address = address;
		this.createTime=createTime;
	}
	
	public String getCreateTime() {
		return createTime;
	}
	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}
	public Integer getStorememberid() {
		return storememberid;
	}
	public void setStorememberid(Integer storememberid) {
		this.storememberid = storememberid;
	}
	public String getStoreName() {
		return storeName;
	}
	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}
	public String getOwnerName() {
		return ownerName;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "storeMember [storememberid=" + storememberid + ", storeName=" + storeName + ", ownerName=" + ownerName + ", account="
				+ account + ", password=" + password + ", email=" + email + ", mobile=" + mobile + ", phone=" + phone
				+ ", address=" + address + ", createTime=" + createTime + "]";
	}
	
}
