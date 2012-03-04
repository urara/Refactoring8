package example.subclass;

public abstract class Employee {

	public static final int ENGINEER = 0;
	static final int SALESMAN = 1;
	static final int MANAGER = 2;
	
	abstract int getType();
	
	static Employee create(int type){
		switch(type){
		case ENGINEER:
			return new Engineer();
		case SALESMAN:
			return new Salesman();
		case MANAGER:
			return new Manager();
			default:
				throw new IllegalArgumentException("タイプコードの値が不正");
		}
	}
	
//	private int _type;
//	static final int ENGINEER = 0;
//	static final int SALESMAN = 1;
//	static final int MANAGER = 2;
//	
//	Employee(){
//		this(_type);
//	}
//	
//	Employee(int type){
//		_type = type;
//	}
//	
//	int getType(){
//		return _type;
//	}
//	
//	static Employee create(int type){
//		if (type == ENGINEER) return new Engineer();
//		else return new Employee(type);
//	}
}
