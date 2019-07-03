package com.aa.controller1;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.aa.intrfc1.ServiceImpl;
import com.aa.model1.EmployeeDto;



@RestController
public class EmployeeController {
	@Autowired ServiceImpl si;
	
	@RequestMapping(value="/getdata",method=RequestMethod.GET,consumes="application/json")
	public List<EmployeeDto> getlist()
	{
		 List<EmployeeDto> list=si.getdata();
		 return list;
	}

}
