package oprator;

public class OperatorExample {

	public static void main(String[] args) {
		
		int a = 30;
		int b = 40;
		System.out.println( a+b+4 + " Is the final result");
		System.out.println("Is the final result" + (a+b+4));
		
		int i = 20;
		System.out.println("Value of i = "+ i--);
//		i++;
		System.out.println("Value of i = "+ i);
		
		int c = 50;
//		c = c + 2;
		c -= 2;
		System.out.println(c);
		
	}

}
