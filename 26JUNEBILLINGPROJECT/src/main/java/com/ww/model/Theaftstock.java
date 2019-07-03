package com.ww.model;

import java.util.HashMap;
import java.util.Map;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Theaftstock {
	@Id
	private int id;
	@OneToMany(cascade=CascadeType.ALL)
	private Map<String, Asquentity> map=new HashMap<>();
	private String date;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Map<String, Asquentity> getMap() {
		return map;
	}
	public void setMap(Map<String, Asquentity> map) {
		this.map = map;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	

}
