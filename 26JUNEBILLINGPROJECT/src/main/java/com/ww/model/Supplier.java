package com.ww.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Supplier {
	@Id
	private int sid;
	private String sname;
	private String scompanyname;
	private String saddress;
	@OneToOne(cascade=CascadeType.ALL)
    private District distrinct;
	@OneToOne(cascade=CascadeType.ALL)
    private State state;
	@OneToOne(cascade=CascadeType.ALL)
    private Country country;
	private String date;
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
	public String getScompanyname() {
		return scompanyname;
	}
	public void setScompanyname(String scompanyname) {
		this.scompanyname = scompanyname;
	}
	public String getSaddress() {
		return saddress;
	}
	public void setSaddress(String saddress) {
		this.saddress = saddress;
	}
	public District getDistrinct() {
		return distrinct;
	}
	public void setDistrinct(District distrinct) {
		this.distrinct = distrinct;
	}
	public State getState() {
		return state;
	}
	public void setState(State state) {
		this.state = state;
	}
	public Country getCountry() {
		return country;
	}
	public void setCountry(Country country) {
		this.country = country;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	
	
	
	

}
