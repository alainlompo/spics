package org.hypernovae.entapps.spics.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Customer {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	private String fullName;
	private String mainPhone;
	private String mainEmail;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getMainPhone() {
		return mainPhone;
	}
	public void setMainPhone(String mainPhone) {
		this.mainPhone = mainPhone;
	}
	public String getMainEmail() {
		return mainEmail;
	}
	public void setMainEmail(String mainEmail) {
		this.mainEmail = mainEmail;
	}
	public Customer(String fullName, String mainPhone, String mainEmail) {
		super();
		this.fullName = fullName;
		this.mainPhone = mainPhone;
		this.mainEmail = mainEmail;
	}
	
	public Customer(String fullName, String mainEmail) {
		this(fullName,"",mainEmail);
	}
	
	public Customer(String fullName) {
		this(fullName, "","");
	}
	
	public Customer() {
		
	}
	
	public String toString() {
		return String.format("Customer [id:%d, fullName:%s, mainEmail:%s]", id, fullName, mainEmail);
	}
	
	

}
