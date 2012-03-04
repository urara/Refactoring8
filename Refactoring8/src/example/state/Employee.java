package example.state;

import example.state.Engineer;
import example.state.Manager;
import example.state.Salesman;

public class Employee {

	private EmployeeType _type;
	//private int _type;
	static final int ENGINEER = 0;
	static final int SALESMAN = 1;
	static final int MANAGER = 2;
	
	public Employee(int type){
		setType(type);
	}
	
	public int getType(){
		return _type.getTypeCode();
	}
	
	void setType(int arg) {
		switch(arg){
		case ENGINEER:
			_type = new Engineer();
			break;
		case SALESMAN:
			_type = new Salesman();
			break;
		case MANAGER:
			_type = new Manager();
			break;
			default:
				throw new IllegalArgumentException("不正な従業員コード");	
		}
	}



	int _monthlySalary = 20000;
	int _commition = 1000;
	int _bonus = 10000;
	
	public int payAmount(){
		switch (getType()){
		case ENGINEER:
			return _monthlySalary;
		case SALESMAN:
			return _monthlySalary + _commition;
		case MANAGER:
			return _monthlySalary + _bonus;
			default:
				throw new RuntimeException("不正な従業員");
		}
	}
}
