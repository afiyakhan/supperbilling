package com.ww.model;

import java.util.HashMap;
import java.util.Map;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;



@Entity
public class OverShipmentStock {
	@Id
	private int osid;
	@OneToMany(cascade=CascadeType.ALL)
	private Map<String,Ospquentity> map=new HashMap<>();
	private String date;
	public int getOsid() {
		return osid;
	}
	public void setOsid(int osid) {
		this.osid = osid;
	}
	public Map<String, Ospquentity> getMap() {
		return map;
	}
	public void setMap(Map<String, Ospquentity> map) {
		this.map = map;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	
	

}
