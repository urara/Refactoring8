package example.cupsule;

import java.util.Set;

public class Person {

	public Set<Course> getCources() {
		return _courses;
	}

	public void setCourses(Set<Course> arg) {
		this._courses = arg;
	}

	private Set<Course> _courses;
}