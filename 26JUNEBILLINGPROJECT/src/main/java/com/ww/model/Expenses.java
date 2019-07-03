package com.ww.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Expenses {
	@Id
	private int id;
//	private Ledger ledger;
	private  String paymentto;
	
	private  float amount;
	private   byte[] document;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
/*	public Ledger getLedger() {
		return ledger;
	}
	public void setLedger(Ledger ledger) {
		this.ledger = ledger;
	}*/
	public String getPaymentto() {
		return paymentto;
	}
	public void setPaymentto(String paymentto) {
		this.paymentto = paymentto;
	}
	public float getAmount() {
		return amount;
	}
	public void setAmount(float amount) {
		this.amount = amount;
	}
	public byte[] getDocument() {
		return document;
	}
	public void setDocument(byte[] document) {
		this.document = document;
	}
	


}
