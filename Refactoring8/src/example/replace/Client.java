package example.replace;

public class Client {

	public static void main(String[] args){
		Person kent = new Person(BloodGroup.A);
		kent.getBloodGroup().getCode();//??
		
		kent.setBloodGroup(BloodGroup.AB);
		
	}
}
