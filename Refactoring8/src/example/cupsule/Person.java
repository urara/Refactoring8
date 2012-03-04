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
	
	//cupsule sequence
	String[] _skills = new String[10];
	
	public String[] getSkills(){
		return _skills;
	}
//	void setSkills(String[] arg){
//		_skills = arg;
//	}

	public void setSkill(int index , String newSkill){
		_skills[index] = newSkill;
	}
	
	public void setSkills(String[] arg){
		_skills = new String[arg.length];
		for(int i = 0;i < arg.length;i++){
			setSkill(i, arg[i]);
		}
	}
}