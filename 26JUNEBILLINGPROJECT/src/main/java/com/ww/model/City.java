package com.ww.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class City {
	@Id
	private int cityid;
	private String cityname;
	private String areaname;
	public int getCityid() {
		return cityid;
	}
	public void setCityid(int cityid) {
		this.cityid = cityid;
	}
	public String getCityname() {
		return cityname;
	}
	public void setCityname(String cityname) {
		this.cityname = cityname;
	}
	public String getAreaname() {
		return areaname;
	}
	public void setAreaname(String areaname) {
		this.areaname = areaname;
	}
	

}
