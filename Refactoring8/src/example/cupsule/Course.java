package example.cupsule;

public class Course {

	String name;
	boolean isAdvanced;

	public Course(String name, boolean isAdvanced){
		this.name = name;
		this.isAdvanced = isAdvanced;
	}

	public boolean isAdvanced(){
		return isAdvanced;
	}
}