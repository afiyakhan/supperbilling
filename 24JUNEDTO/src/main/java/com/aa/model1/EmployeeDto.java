package com.aa.model1;



public class EmployeeDto {
	private String empname;
	private String deptname;
	
	public EmployeeDto(String empname,String deptname)
	{
		 this.empname =empname ;  this.deptname=deptname;
	}

	public String getEmpname() {
		return empname;
	}

	public void setEmpname(String empname) {
		this.empname = empname;
	}

	public String getDeptname() {
		return deptname;
	}

	public void setDeptname(String deptname) {
		this.deptname = deptname;
	}
	

	
}
