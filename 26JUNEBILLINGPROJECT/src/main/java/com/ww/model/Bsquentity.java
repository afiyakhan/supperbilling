package com.ww.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Bsquentity {
	@Id
	private int bid;
	private String bquentity;
	public int getBid() {
		return bid;
	}
	public void setBid(int bid) {
		this.bid = bid;
	}
	public String getBquentity() {
		return bquentity;
	}
	public void setBquentity(String bquentity) {
		this.bquentity = bquentity;
	}
	

}
