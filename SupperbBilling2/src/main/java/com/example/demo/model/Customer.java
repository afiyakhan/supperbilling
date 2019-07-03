package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Customer {
	@Id
	private int id;
	private String name;
	private String username;
	private String password;
	private String address;
	
	private String selectcity;
	private String selectgender;
	private String checkme;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getSelectcity() {
		return selectcity;
	}
	public void setSelectcity(String selectcity) {
		this.selectcity = selectcity;
	}
	public String getSelectgender() {
		return selectgender;
	}
	public void setSelectgender(String selectgender) {
		this.selectgender = selectgender;
	}
	public String getCheckme() {
		return checkme;
	}
	public void setCheckme(String checkme) {
		this.checkme = checkme;
	}
	
	
	
}