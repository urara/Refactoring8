package example.cupsule;

import java.util.HashSet;
import java.util.Set;

public class Client {
	public static void main(String[] args){
		Person kent = new Person();
		Set s = new HashSet();
//		s.add(new Course("Smalltalk�v���O���~���O", false));
//		s.add(new Course("4���ꓯ���K��", true));
		kent.addCourse(new Course("Smalltalk�v���O���~���O", false));
		kent.addCourse(new Course("4���ꓯ���K��", true));
		kent.initializeCourses(s);
		System.out.println(kent.getCources().size());
		Course refact = new Course("���t�@�N�^�����O", false);
		s.add(refact);
		s.add(new Course("���ۓI�ȗv���̎���", true));
		System.out.println(kent.getCources().size());
		kent.getCources().remove(refact);
		System.out.println(kent.getCources().size());
	}
}