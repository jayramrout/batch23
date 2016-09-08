package jrout.tutorial.corejava.classesexample;

public class JavaProgrammerClient {

	public static void main(String[] args) {
/*		Human anusha = new Human("Anusha",21,"Java Student");
		System.out.println(anusha.name +"  " + anusha.specilization);
		
		Human nila = new Human("Nila",21, 5 , "Java Student");
		System.out.println(nila.name +"  " + nila.specilization +" " + nila.height);
*/		
		Human anusha = new Human("Anusha",-1);
		anusha.age = -1;
		System.out.println(anusha.name +"  " + anusha.age);
		
		
	}

}
