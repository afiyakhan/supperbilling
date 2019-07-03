package com.aa.controller;



import java.util.List;

import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import com.aa.impl.ServiceImpl;
import com.aa.model.User;
import com.aa.model.UserDto;






public class HomeController {
	
	@Autowired ServiceImpl si;

	/*@RequestMapping("/getdata/{id}")
	
     public UserDto m2(@PathVariable int id)
	{
		  User user= si.getdata( id);
			  
			  ModelMapper mapper=new ModelMapper();
			  
			  UserDto userdto=new UserDto();
			  
			  UserDto udto =mapper.map(user, UserDto.class);
			  return udto;
		  }*/
		



        @RequestMapping("/getlistdata")

       public List<UserDto> getlistdata()
        {
	      List<User> list=   si.getlistdata();
		  
		  ModelMapper mapper=new ModelMapper();
		  
		 List<UserDto> list1=mapper.map(list, new TypeToken<List<UserDto>>() {}.getType());
		 System.out.println(list1);
		 return list1;
	
        }
}
	