package jrout.tutorial.corejava.garbagecollection;

//import jrout.tutorial.corejava.classesexample.Person;
//import jrout.tutorial.corejava.classesexample.Human;
import jrout.tutorial.corejava.classesexample.Human;
import jrout.tutorial.corejava.classesexample.Person;

public class GarbageCollection {

	public static void main(String[] args) {
		Person narayana = new Person("Narayana",21);
		Human john = new Human("John",35);
		
		Person rony = new Person("Rony",20);
		
		System.out.println("There objects have been created in the memory...");
		
		Person rajendra = new Person("Rajendra",21);
		
		System.out.println(rajendra.getName());
		System.out.println(rony.getName());
		
		
	}

}
