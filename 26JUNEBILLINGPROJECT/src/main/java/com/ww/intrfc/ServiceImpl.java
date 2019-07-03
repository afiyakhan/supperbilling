package com.ww.intrfc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ww.model.User;
import com.ww.repository.HomeReposisory;

@Service
public class ServiceImpl  implements Serviceintrface{

	@Autowired HomeReposisory hr;
	@Override
	public User savedata(User u) {
		
		User u1=hr.save(u);
		return u1;
	}

	@Override
	public List<User> getalldata() {
	List<User>l	= (List<User>) hr.findAll();
		return l;
	}

}
