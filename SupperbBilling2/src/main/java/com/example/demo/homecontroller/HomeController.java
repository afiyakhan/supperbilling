package com.example.demo.homecontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.intrfc.CServcie;
import com.example.demo.model.Customer;



@CrossOrigin("*")
@RestController
@RequestMapping(value="Customer")
public class HomeController {
	
	@Autowired CServcie cs;
	
	
	
	
	
	
	
	
	@RequestMapping(value="/saveData",method=RequestMethod.POST,consumes="application/json")
	public void savedata(@RequestBody Customer c)
	
	
	{
		System.out.println("hlw111");
		cs.savedata(c);
	
	}
	
	@RequestMapping(value="/getalldata",method=RequestMethod.GET)
	public List<Customer> m1(@ModelAttribute Customer cus,Model m){
		
		List<Customer> l=cs.getalldata(cus);
		return l;
		 
		
	}

}
