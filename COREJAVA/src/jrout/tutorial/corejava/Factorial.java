package jrout.tutorial.corejava;

public class Factorial {
	int fact(int n) {
		int result;
		if(n==1) return 1;
		
		result = fact(n-1) * n;
		return result;
	}
	
	public static void main(String arg[]) {
		System.out.println(new Factorial().fact(4));
	
	}
}
