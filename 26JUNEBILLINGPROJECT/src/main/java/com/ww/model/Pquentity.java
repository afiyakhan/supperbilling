package com.ww.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Pquentity {
	@Id
	private int id;
	private int quentity;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getQuentity() {
		return quentity;
	}
	public void setQuentity(int quentity) {
		this.quentity = quentity;
	}
	

}
