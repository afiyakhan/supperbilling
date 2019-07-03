package com.aa.impl;

import java.util.List;

import com.aa.model.User;

public interface Service {
	public User getdata(int id);
	
	public List<User> getlistdata();

}
