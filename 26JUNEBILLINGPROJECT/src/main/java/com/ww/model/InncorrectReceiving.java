package com.ww.model;

import java.util.HashMap;
import java.util.Map;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class InncorrectReceiving {
	@Id
	private int icrid;
	@OneToMany(cascade=CascadeType.ALL)
	private Map<String, Icrquentity> map=new HashMap<>();
	private String date;
	public int getIcrid() {
		return icrid;
	}
	public void setIcrid(int icrid) {
		this.icrid = icrid;
	}
	public Map<String, Icrquentity> getMap() {
		return map;
	}
	public void setMap(Map<String, Icrquentity> map) {
		this.map = map;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	
	


}
