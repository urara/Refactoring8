package example.cupsule;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;


public class Client {
	public static void main(String[] args){
		//cupsule
		Person kent = new Person();
		Set s = new HashSet();
//		s.add(new Course("Smalltalkプログラミング", false));
//		s.add(new Course("4言語同時習得", true));
		kent.addCourse(new Course("Smalltalkプログラミング", false));
		kent.addCourse(new Course("4言語同時習得", true));
		kent.initializeCourses(s);
		System.out.println(kent.getCources().size());
		Course refact = new Course("リファクタリング", false);
		s.add(refact);
		s.add(new Course("抽象的な要件の実現", true));
		System.out.println(kent.getCources().size());
		//kent.getCources().remove(refact);
		kent.removeCourse(refact);
		System.out.println(kent.getCources().size());
		
		//move Behavior
		Iterator iter = kent.getCources().iterator();
		int count = 0;
		while(iter.hasNext()){
			Course each = (Course) iter.next();
			if(each.isAdvanced()) count++;
			System.out.println(each.name);
		}
		
	}
}