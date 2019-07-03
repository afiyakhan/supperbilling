package com.ww.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Customer {
	@Id
	private int id;
	private String citytype;
	private String cname;
	private long mobileno;
	private String email;
	private String doorno;
	private String streetname;
	private String lanename;
	private String area;
	private int zipcode;
	@OneToOne(cascade=CascadeType.ALL)
    private State state;
	@OneToOne(cascade=CascadeType.ALL)
    private City city;
	@OneToOne(cascade=CascadeType.ALL)
    private Country country;
	private String PAN;
	private String GSTIN;
	private String date;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCitytype() {
		return citytype;
	}
	public void setCitytype(String citytype) {
		this.citytype = citytype;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public long getMobileno() {
		return mobileno;
	}
	public void setMobileno(long mobileno) {
		this.mobileno = mobileno;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDoorno() {
		return doorno;
	}
	public void setDoorno(String doorno) {
		this.doorno = doorno;
	}
	public String getStreetname() {
		return streetname;
	}
	public void setStreetname(String streetname) {
		this.streetname = streetname;
	}
	public String getLanename() {
		return lanename;
	}
	public void setLanename(String lanename) {
		this.lanename = lanename;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public int getZipcode() {
		return zipcode;
	}
	public void setZipcode(int zipcode) {
		this.zipcode = zipcode;
	}
	public State getState() {
		return state;
	}
	public void setState(State state) {
		this.state = state;
	}
	public City getCity() {
		return city;
	}
	public void setCity(City city) {
		this.city = city;
	}
	public Country getCountry() {
		return country;
	}
	public void setCountry(Country country) {
		this.country = country;
	}
	public String getPAN() {
		return PAN;
	}
	public void setPAN(String pAN) {
		PAN = pAN;
	}
	public String getGSTIN() {
		return GSTIN;
	}
	public void setGSTIN(String gSTIN) {
		GSTIN = gSTIN;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	

	

}
