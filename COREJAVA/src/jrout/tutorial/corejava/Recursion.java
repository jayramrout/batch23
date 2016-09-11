package jrout.tutorial.corejava;

public class Recursion {

	public static void main(String[] args) {
		int firstValue = add(2,3);
		int secValue = subs(14,5);
		
		int finalValue = add(firstValue, secValue);
		System.out.println("finalValue");
	}

	
	public static int add(int a, int b) {
		return a+b;
	}

	public static int subs(int a , int b) {
		return a-b;
	}
}

/// Factorial of a number:
// 3 = 3*2*1
// 4 = 4*3*2*1




