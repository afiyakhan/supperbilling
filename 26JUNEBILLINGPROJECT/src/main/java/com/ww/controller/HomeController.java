package com.ww.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ww.intrfc.Serviceintrface;
import com.ww.model.User;
@RestController
public class HomeController {
	
	@Autowired
	Serviceintrface si;
	
	@RequestMapping(value="/user/savedata",method=RequestMethod.POST,produces="application/json")
	public User savedata(@RequestBody User u)
	{
		
		System.out.println("hlw");
		User u1=si.savedata(u);
		return u1;
	}
	@RequestMapping(value="/user/getalldata",method=RequestMethod.GET,produces="application/json")
	public List<User> getalldata()
	{
		List<User> l=si.getalldata();
		return l;
	}

}



