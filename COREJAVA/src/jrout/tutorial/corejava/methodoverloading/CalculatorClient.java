package jrout.tutorial.corejava.methodoverloading;

public class CalculatorClient {

	public static void main(String[] args) {
		Calculator calc = new Calculator();
		int result = calc.add(2, 3);
		
		System.out.println(result);
		
		result = calc.add(2, 3, 4);
	}
	
	
}
