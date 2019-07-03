package com.ww.model;

import java.util.HashMap;
import java.util.Map;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Inovice {
	@Id
	private int id;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@OneToOne(cascade=CascadeType.ALL)
	private Customer customer;
	private String invoiceno;
	private String date;
	
	@OneToMany(cascade=CascadeType.ALL)
	private Map<String, Iquentity> map=new HashMap<>();
	
	@OneToMany(cascade=CascadeType.ALL)
	private Map<String, Discount> dmap=new HashMap<>();
	
	private float totalamount;
	private float totaldiscountamount;
	
	private float paybleamount;
	private String invoicegeneratedby;
	
	
	
	private float totaltaxamount;
	private float servicecharge;
	private int deleverycharge;
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
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
	public Map<String, Iquentity> getMap() {
		return map;
	}
	public void setMap(Map<String, Iquentity> map) {
		this.map = map;
	}
	public Map<String, Discount> getDmap() {
		return dmap;
	}
	public void setDmap(Map<String, Discount> dmap) {
		this.dmap = dmap;
	}
	public float getTotalamount() {
		return totalamount;
	}
	public void setTotalamount(float totalamount) {
		this.totalamount = totalamount;
	}
	public float getTotaldiscountamount() {
		return totaldiscountamount;
	}
	public void setTotaldiscountamount(float totaldiscountamount) {
		this.totaldiscountamount = totaldiscountamount;
	}
	public float getPaybleamount() {
		return paybleamount;
	}
	public void setPaybleamount(float paybleamount) {
		this.paybleamount = paybleamount;
	}
	public String getInvoicegeneratedby() {
		return invoicegeneratedby;
	}
	public void setInvoicegeneratedby(String invoicegeneratedby) {
		this.invoicegeneratedby = invoicegeneratedby;
	}
	public float getTotaltaxamount() {
		return totaltaxamount;
	}
	public void setTotaltaxamount(float totaltaxamount) {
		this.totaltaxamount = totaltaxamount;
	}
	public float getServicecharge() {
		return servicecharge;
	}
	public void setServicecharge(float servicecharge) {
		this.servicecharge = servicecharge;
	}
	public int getDeleverycharge() {
		return deleverycharge;
	}
	public void setDeleverycharge(int deleverycharge) {
		this.deleverycharge = deleverycharge;
	}
	
}
	
	