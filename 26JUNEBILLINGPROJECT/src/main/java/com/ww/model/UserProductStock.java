package com.ww.model;

import java.util.HashMap;
import java.util.Map;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
public class UserProductStock {
	@Id
	private int id;
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@OneToMany(cascade=CascadeType.ALL)
	private Map<String,Psquentity> map=new HashMap<>();

	public Map<String, Psquentity> getMap() {
		return map;
	}

	public void setMap(Map<String, Psquentity> map) {
		this.map = map;
	}
	

}
