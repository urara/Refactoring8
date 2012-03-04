package example.replace;

public class Person {

	private BloodGroup _bloodGroup;

	public Person(BloodGroup bloodGroup){
		_bloodGroup = bloodGroup;
	}
	
	public void setBloodGroup(BloodGroup arg){
		_bloodGroup = arg;
	}
		
	public BloodGroup getBloodGroup() {
		return _bloodGroup;
	}

}
