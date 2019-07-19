package com.revature.main;

import java.util.UUID;

public class Customer extends Users{
	private String id;	
		
	public Customer() {
		super();
		//generate unique ID
		this.id = UUID.randomUUID().toString();
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + "]";
	}



}
