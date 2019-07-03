package com.ww.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Payment {
	@Id
	private String paymentmode;
	private String invoiceno;
	private float paymentamount;
	
//	private Status paymentfstatus;
	private String payementallexeptedby;
	public String getPaymentmode() {
		return paymentmode;
	}
	public void setPaymentmode(String paymentmode) {
		this.paymentmode = paymentmode;
	}
	public String getInvoiceno() {
		return invoiceno;
	}
	public void setInvoiceno(String invoiceno) {
		this.invoiceno = invoiceno;
	}
	public float getPaymentamount() {
		return paymentamount;
	}
	public void setPaymentamount(float paymentamount) {
		this.paymentamount = paymentamount;
	}
	/*public Status getPaymentfstatus() {
		return paymentfstatus;
	}
	public void setPaymentfstatus(Status paymentfstatus) {
		this.paymentfstatus = paymentfstatus;
	}*/
	public String getPayementallexeptedby() {
		return payementallexeptedby;
	}
	public void setPayementallexeptedby(String payementallexeptedby) {
		this.payementallexeptedby = payementallexeptedby;
	}
}
	