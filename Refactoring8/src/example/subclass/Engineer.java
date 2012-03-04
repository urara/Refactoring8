package example.subclass;

public class Engineer extends Employee {

	@Override
	public int getType(){
		return Employee.ENGINEER;
	}
	
}
