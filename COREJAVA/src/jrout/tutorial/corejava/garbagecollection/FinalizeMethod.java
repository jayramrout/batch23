package jrout.tutorial.corejava.garbagecollection;

//import jrout.tutorial.corejava.classesexample.Person;
//import jrout.tutorial.corejava.classesexample.Human;
import jrout.tutorial.corejava.classesexample.Human;
import jrout.tutorial.corejava.classesexample.Person;

public class FinalizeMethod {

	public static void main(String[] args) {
		
		for(int i =0 ; i < 5000000 ; i++) {
			new Person("Narayana"+i ,21);
		}
		
	}
}