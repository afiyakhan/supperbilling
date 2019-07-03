package com.ww.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class State {
	@Id
	private int sid;
	private String sname;
	
	//private Country country;
	
	/*public Country getCountry() {
		return country;
	}
	public void setCountry(Country country) {
		this.country = country;
	}*/
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	
	
	

}
