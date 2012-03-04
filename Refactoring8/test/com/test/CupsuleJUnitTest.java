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
		Course courseF = new Course("�݂�Ȃ�Python", false);
		assertEquals(false , courseF.isAdvanced());
		Course courseT = new Course("Ruby on Rails", true);
		assertEquals(true , courseT.isAdvanced()); 
	}

	@Test
	public void PersonTest() {
		Person kent = new Person();
		Set s = new HashSet();
		//s.add(new Course("Smalltalk�v���O���~���O", false));
		kent.addCourse(new Course("Smalltalk�v���O���~���O", false));
		kent.initializeCourses(s);
		assertEquals(1, kent.getCources().size());
		//s.add(new Course("4���ꓯ���K��", true));
		kent.addCourse(new Course("4���ꓯ���K��", true));
		kent.initializeCourses(s);
		assertEquals(2, kent.getCources().size());
		kent.setSkill(0, "�����^�]�Ƌ�");
		kent.setSkill(1, "�p���S��");
		assertEquals("�����^�]�Ƌ�",(kent.getSkills()[0]));
		
		String[] skills = {"��^���","��؃\�����G"};
		kent.setSkills(skills);
		assertEquals("��^���", kent.getSkills()[0]);
		
		
		
	}
}
