package com.javasampleapproch.mysql.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.Column;


@Entity
@Table(name = "customer")
public class Customer implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	@Column(name = "firstname")
	private String firstName;
	
	@Column(name = "lastname")
	private String lastName;
	
	protected Customer() {
		
	}
	
	public Customer(long id, String firstname, String lastname) {
		super();
		this.id = id;
		this.firstName = firstname;
		this.lastName = lastname;
	}

	
	public Customer(String string, String string2) {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return String.format("Customer[id=%d, firstName='%s', lastName='%s']", id, firstName, lastName);
	}
	
	
	
	
	

}
