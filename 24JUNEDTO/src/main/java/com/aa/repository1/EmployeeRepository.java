package com.aa.repository1;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.aa.model1.Employee;
import com.aa.model1.EmployeeDto;



@Repository
public interface EmployeeRepository  extends PagingAndSortingRepository<Employee, Integer>{
	
	@Query("select new com.aa.model1.EmployeeDto(e.empname, d.deptname)" + " from Employee e INNER JOIN e.department d")
	
	List<EmployeeDto> fetchdata();
	
		
	

}
