package com.ww.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SuppliesInvoice {
	@Id
	private int id;
	private String SuppliesInvoiceno;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSuppliesInvoiceno() {
		return SuppliesInvoiceno;
	}
	public void setSuppliesInvoiceno(String suppliesInvoiceno) {
		SuppliesInvoiceno = suppliesInvoiceno;
	}
	

}
