package example.cupsule;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Person {

	public Set<Course> getCources() {
		return Collections.unmodifiableSet(_courses);
	}


//	public void initializeCourses(Set<Course> arg) {
//		Iterator iter = arg.iterator();
//		while(iter.hasNext()){
//			addCourse((Course) iter.next());
//		}
//	}
	
	public void initializeCourses(Set<Course> arg) {
		_courses.addAll(arg);
	}
	
	private Set _courses = new HashSet();
	
	public void addCourse(Course arg) {
		_courses.add(arg);
	}

	public void removeCourse(Course arg) {
		_courses.remove(arg);
	}


	public void numberOfCourses() {
		Iterator iter = this.getCources().iterator();
		int count = 0;
		while(iter.hasNext()){
			Course each = (Course) iter.next();
			if(each.isAdvanced()) count++;
			System.out.println(each.name);
		}
		
	}

}