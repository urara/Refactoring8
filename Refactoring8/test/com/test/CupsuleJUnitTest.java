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
		Course courseF = new Course("‚İ‚ñ‚È‚ÌPython", false);
		assertEquals(false , courseF.isAdvanced());
		Course courseT = new Course("Ruby on Rails", true);
		assertEquals(true , courseT.isAdvanced()); 
	}

	@Test
	public void PersonTest() {
		Person kent = new Person();
		Set s = new HashSet();
		//s.add(new Course("SmalltalkƒvƒƒOƒ‰ƒ~ƒ“ƒO", false));
		kent.addCourse(new Course("SmalltalkƒvƒƒOƒ‰ƒ~ƒ“ƒO", false));
		kent.initializeCourses(s);
		assertEquals(1, kent.getCources().size());
		//s.add(new Course("4Œ¾Œê“¯K“¾", true));
		kent.addCourse(new Course("4Œ¾Œê“¯K“¾", true));
		kent.initializeCourses(s);
		assertEquals(2, kent.getCources().size());
		kent.setSkill(0, "©“®‰^“]–Æ‹–");
		kent.setSkill(1, "‰pŒŸ‚S‹‰");
		assertEquals("©“®‰^“]–Æ‹–",(kent.getSkills()[0]));
		
		String[] skills = {"‘åŒ^“ñ—Ö","–ìØƒ\ƒ€ƒŠƒG"};
		kent.setSkills(skills);
		assertEquals("‘åŒ^“ñ—Ö", kent.getSkills()[0]);
		
		
		
	}
}
