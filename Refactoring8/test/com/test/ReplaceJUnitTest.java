package com.test;

import static org.junit.Assert.assertEquals;

import java.util.HashSet;
import java.util.Set;

import junit.framework.Assert;
import org.junit.Test;
import example.cupsule.Course;
import example.cupsule.Person;

public class ReplaceJUnitTest {

	@Test
	public void CourseTest() {
		Course courseF = new Course("‚Ý‚ñ‚È‚ÌPython", false);
		assertEquals(false , courseF.isAdvanced());
		Course courseT = new Course("Ruby on Rails", true);
		assertEquals(true , courseT.isAdvanced()); 
	}

}
