package example.state;

public class Employee {

	private int _type;
	static final int ENGINEER = 0;
	static final int SALESMAN = 1;
	static final int MANAGER = 2;
	
	Employee(int type){
		_type = type;
	}
	
	int _monthlySalary;
	int _commition;
	int _bonus;
	
	int PayAmount(){
		switch (_type){
		case ENGINEER:
			return _monthlySalary;
		case SALESMAN:
			return _monthlySalary + _commition;
		case MANAGER:
			return _monthlySalary + _bonus;
			default:
				throw new RuntimeException("ïsê≥Ç»è]ã∆àı");
		}
	}
}
