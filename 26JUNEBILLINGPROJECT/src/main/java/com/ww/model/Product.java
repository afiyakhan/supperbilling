package com.ww.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;



@Entity
@Table(name="product")
public class Product {
	@Id
	private int pid;
	private String pcode;
	private String pname;
	private String phincode;
	private String ptype;
	@OneToOne(cascade=CascadeType.ALL)
	private ProductCategory pcat;
	private String pbrand;
	private String pdescription;
	
//	private Status returnStatus;
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPcode() {
		return pcode;
	}
	public void setPcode(String pcode) {
		this.pcode = pcode;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getPhincode() {
		return phincode;
	}
	public void setPhincode(String phincode) {
		this.phincode = phincode;
	}
	public String getPtype() {
		return ptype;
	}
	public void setPtype(String ptype) {
		this.ptype = ptype;
	}
	public ProductCategory getPcat() {
		return pcat;
	}
	public void setPcat(ProductCategory pcat) {
		this.pcat = pcat;
	}
	public String getPbrand() {
		return pbrand;
	}
	public void setPbrand(String pbrand) {
		this.pbrand = pbrand;
	}
	public String getPdescription() {
		return pdescription;
	}
	public void setPdescription(String pdescription) {
		this.pdescription = pdescription;
	}
	/*public Status getReturnStatus() {
		return returnStatus;
	}
	public void setReturnStatus(Status returnStatus) {
		this.returnStatus = returnStatus;
	}*/
	
	

}
