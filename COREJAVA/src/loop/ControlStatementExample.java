package loop;

import java.util.Scanner;

public class ControlStatementExample {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		String course = scanner.nextLine();
		
		
		if(course.equals("Java")){
			System.out.println("This is Java course");
		} else if(course.equals("DotNet")){
			System.out.println("This is Dot Net course");
		} else if(course.equalsIgnoreCase("PHP")){
			System.out.println("This is PHP course");
		} else if(course.equals("Python")){
			System.out.println("This is Python course");
		}else {
			System.out.println(" I am learning C....");
		}
		
	}

}
