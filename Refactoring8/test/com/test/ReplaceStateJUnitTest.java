package com.test;

import static org.junit.Assert.assertEquals;

import junit.framework.Assert;
import org.junit.Test;

import example.state.Employee;



public class ReplaceStateJUnitTest {

	@Test
	public void EnginnerTest() {
		Employee emp = new Employee(1);
		assertEquals(21000 , emp.payAmount());

	}
	


}
