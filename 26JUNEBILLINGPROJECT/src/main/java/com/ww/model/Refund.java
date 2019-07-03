package com.ww.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Refund {
	@Id
	private int id;
	private float returnamount;
	private String invoiceno;
	private String date;
	private String paymenttype;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public float getReturnamount() {
		return returnamount;
	}
	public void setReturnamount(float returnamount) {
		this.returnamount = returnamount;
	}
	public String getInvoiceno() {
		return invoiceno;
	}
	public void setInvoiceno(String invoiceno) {
		this.invoiceno = invoiceno;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getPaymenttype() {
		return paymenttype;
	}
	public void setPaymenttype(String paymenttype) {
		this.paymenttype = paymenttype;
	}
	

}
