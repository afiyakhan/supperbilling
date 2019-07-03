package com.example.demo.reprository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Customer;

@Repository
public interface HomeRepository extends CrudRepository<Customer, Integer> {
	

}
