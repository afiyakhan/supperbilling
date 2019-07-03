package com.aa.impl;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;



import org.springframework.stereotype.Service;

import com.aa.model.User;
import com.aa.repository.HomeRpository;




public class ServiceImpl implements com.aa.impl.Service  {
	@Autowired HomeRpository er;

	@Override
	public User getdata(int id) {
		User  u=er.findById(id).get();
		return u;
		
		
		
	}

	@Override
	public List<User> getlistdata() {
		
		
		   return  (List<User>) er.findAll();
	}

	
		
}

	

	