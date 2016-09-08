package jrout.tutorial.corejava.classesexample;

public class HumanCreator {

	public static void main(String[] args) {
		
		Human chirag = new Human("Chirag",25);
//		chirag.name = "Chirag";
//		chirag.age = 25;
		chirag.height = 6;
		
		Human jathin = new Human("Jathin",26);
//		jathin.name = "Jathin";
//		jathin.age = 26;
		jathin.height = 5;
		
		System.out.println(chirag.name +"   "+ chirag.age +"    " + chirag.height);
		System.out.println(jathin.name +"   "+ jathin.age +"    " + jathin.height);
		
		
		
		System.out.println(chirag.name);
		System.out.println(jathin.name);
		
		Human rashed = new Human("Rashed",30);
//		rashed.name = "Rashed";
		rashed.height = 5;
		
		System.out.println(" Name : "+rashed.name +" Age : "+ rashed.age +" Mark :" + rashed.marks);
		
		
		Human jay = null;
		
		System.out.println(jay);
				
		
	}

}
