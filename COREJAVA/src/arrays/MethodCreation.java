package arrays;

public class MethodCreation {

	public static void main(String[] args) {
//		printMyDetails();
//		printCompanyDetails();
		String info = returnMyInfo();
		System.out.println(info);
		
		
		int firstResult = add(5,8);
		int secondResult = add(15,88);

		int finalValue = add(firstResult,secondResult);
		
		System.out.println("finalValue "+finalValue);
		
	}
	
	public static String returnMyInfo(){
		return "I am a java Tutor .\n Having 11+ yrs of exp";
	}
	
	public static int add(int a , int b) {
		return a+b;
	}
	
	
	public static void printMyDetails(){
		System.out.println("I am a java tutor....");
		System.out.println("I am many java students");
		printExp();
	}
	
	public static void printExp(){
		System.out.println("I am having 11+ year exp");
	}
	
	public static void printCompanyDetails(){
		System.out.println("I work in so and so place...");
		System.out.println("My Work adderess is so and ...");
	}
	
}
