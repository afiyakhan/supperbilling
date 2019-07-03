package com.ww.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Country {
	@Id
	private int cid;
	private String cname;
	
	//private City city;
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
/*	public City getCity() {
		return city;
	}
	public void setCity(City city) {
		this.city = city;
	}*/
	
}
	