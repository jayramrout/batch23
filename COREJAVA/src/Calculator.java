import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter First Number ");
		String a = scanner.nextLine();

		System.out.println("Enter Second Number ");
		String b = scanner.nextLine();

		int valueA = Integer.parseInt(a);
		int valueB = Integer.parseInt(b);
		
		System.out.println("Final Value is = " + (valueA + valueB));
		
	}

}
