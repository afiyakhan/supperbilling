package com.example.demo.intrfc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Customer;
import com.example.demo.reprository.HomeRepository;

@Service
public class CServcie  implements Interface{

	@Autowired HomeRepository hr;

	@Override
	public Customer savedata(Customer c) {
		
	 return 	hr.save( c);
		
	}

	@Override
	public List<Customer> getalldata(Customer c) {
		
		 List<Customer>list=  (List<Customer>) hr.findAll();
		   
		  for(Customer s:list) 
		  {
			  System.out.println(s);
		  }
		return list;
		
		
	}
	

}
