package jrout.tutorial.corejava.general;

import jrout.tutorial.corejava.classesexample.Human;
import jrout.tutorial.corejava.classesexample.Person;

public class ObjectAsParameter {

	public static void main(String[] args) {
		Person sandeep = new Person("Sandeep",23);
//		System.out.println(sandeep);
		
//		Person rony = new Person("Rony",21);
//		System.out.println(rony);
		
//		printPersonDetails(sandeep);
		
		ObjectAsParameter oap = new ObjectAsParameter();
		oap.printPersonDetails(sandeep);
		
		
		System.out.println(sandeep);
//		oap.printPersonDetails(rony);
		
//		Human human = new Human("John",45);
//		oap.printPersonDetails(human);
	}
	
	
	public void printPersonDetails(Person person) {
		System.out.println("Printing Details About "+ person.getName() );
		System.out.println("******** "+ person.getAge() );
		
		person.setAge(15);
	}

}
