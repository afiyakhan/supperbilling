package com.ww.model;

import java.util.HashMap;
import java.util.Map;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class BreakageStock {
	@Id
	private int bsid;
	@OneToMany(cascade=CascadeType.ALL)
	private Map<String, Bsquentity> map=new HashMap<>();
	
	private String date;

	public int getBsid() {
		return bsid;
	}

	public void setBsid(int bsid) {
		this.bsid = bsid;
	}

	public Map<String, Bsquentity> getMap() {
		return map;
	}

	public void setMap(Map<String, Bsquentity> map) {
		this.map = map;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}
	



}
