package com.ww.model;

import java.util.HashMap;
import java.util.Map;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class PurchaseOrder {
	@Id
	private int id;
	private String purchaseorder;
	private String date;
	@OneToOne(cascade=CascadeType.ALL)
	private Supplier supplier;
	
	public Supplier getSupplier() {
		return supplier;
		
	}
	public void setSupplier(Supplier supplier) {
		this.supplier = supplier;
	}
	@OneToMany(cascade=CascadeType.ALL)

	private Map<String, Pquentity> map=new HashMap<>();
	
//	private Status orederstatus;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPurchaseorder() {
		return purchaseorder;
	}
	public void setPurchaseorder(String purchaseorder) {
		this.purchaseorder = purchaseorder;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public Map<String, Pquentity> getMap() {
		return map;
	}
	public void setMap(Map<String, Pquentity> map) {
		this.map = map;
	}
	/*public Status getOrederstatus() {
		return orederstatus;
	}
	public void setOrederstatus(Status orederstatus) {
		this.orederstatus = orederstatus;
	}
	

*/}
