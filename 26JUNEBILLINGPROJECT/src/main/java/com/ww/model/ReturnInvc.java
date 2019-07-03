package com.ww.model;

import java.util.HashMap;
import java.util.Map;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class ReturnInvc {
	@Id
	private int id;
	@OneToMany(cascade=CascadeType.ALL)
	private Map<String, Rquentity> map=new HashMap<>();
	private String date;
	private String invoiceno;
	private String status;
	private float returnammount;

	private String returnby;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Map<String, Rquentity> getMap() {
		return map;
	}

	public void setMap(Map<String, Rquentity> map) {
		this.map = map;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getInvoiceno() {
		return invoiceno;
	}

	public void setInvoiceno(String invoiceno) {
		this.invoiceno = invoiceno;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public float getReturnammount() {
		return returnammount;
	}

	public void setReturnammount(float returnammount) {
		this.returnammount = returnammount;
	}

	public String getReturnby() {
		return returnby;
	}

	public void setReturnby(String returnby) {
		this.returnby = returnby;
	}

	

}
