package com.aa.intrfc1;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aa.model1.Employee;
import com.aa.model1.EmployeeDto;
import com.aa.repository1.EmployeeRepository;


@Service
public class ServiceImpl implements Aserviceinterface {

	@Autowired  EmployeeRepository empr;
	@Override 
	public List<EmployeeDto> getdata() {
		
		
		return empr.fetchdata();
	}
	

}
