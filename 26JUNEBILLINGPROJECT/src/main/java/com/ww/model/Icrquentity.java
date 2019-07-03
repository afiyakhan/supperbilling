package com.ww.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Icrquentity {
	@Id
	private int id;
	private int cquentity;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getCquentity() {
		return cquentity;
	}
	public void setCquentity(int cquentity) {
		this.cquentity = cquentity;
	}
	

}
