package com.test;

import static org.junit.Assert.assertEquals;

import junit.framework.Assert;
import org.junit.Test;

import example.replace.BloodGroup;
import example.replace.Person;
import example.subclass.Employee;
import example.subclass.Engineer;

public class ReplaceSubJUnitTest {

	@Test
	public void EnginnerTest() {
		Engineer emp = new Engineer();
		assertEquals(true , Employee.ENGINEER == emp.getType());

	}
	


}
