package com.revature.junit5;

import static org.junit.Assert.*;

import org.junit.Test;

import com.revature.main.Customer;

public class CustomerTest {

	@Test
	public void testCustomer() {
		Customer cu = new Customer();
	}

	@Test
	public void testToString() {
		Customer cu = new Customer();
		cu.toString();
	}

	@Test
	public void testRegister() {
		Customer cu = new Customer();
		cu.register();
	}

}
