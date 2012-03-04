package com.test;

import static org.junit.Assert.assertEquals;

import java.util.HashSet;
import java.util.Set;

import junit.framework.Assert;
import org.junit.Test;
import example.cupsule.Course;
import example.cupsule.Person;

public class CupsuleJUnitTest {

	@Test
	public void CourseTest() {
		Course courseF = new Course("みんなのPython", false);
		assertEquals(false , courseF.isAdvanced());
		Course courseT = new Course("Ruby on Rails", true);
		assertEquals(true , courseT.isAdvanced()); 
	}

	@Test
	public void PersonTest() {
		Person kent = new Person();
		Set s = new HashSet();
		s.add(new Course("Smalltalkプログラミング", false));
		kent.setCourses(s);
		assertEquals(1, kent.getCources().size());
		s.add(new Course("4言語同時習得", true));
		kent.setCourses(s);
		assertEquals(2, kent.getCources().size());
		
		
		
		
	}
}
