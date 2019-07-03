package com.ww.intrfc;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ww.model.User;




public interface Serviceintrface {
	
	public User savedata(User u);
	
	public List<User> getalldata();

}
