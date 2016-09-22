package jrout.tutorial.corejava.exception;

public class ExceptionExample {

	public static void main(String[] args) {
		ExceptionExample ee = new ExceptionExample();
		ee.printInfo(12,0, 0);
		
	}
	public void printInfo(int a , int b , int temp) {
		int divValue = 0;
		System.out.println("I have entered the program...");
		System.out.println("I am runnning the program...");
		System.out.println("Addition of two Numbers is "+ (a+b));
		
		try{
			divValue = a/b;
			System.out.println("Divsion is done....");
		}catch(Exception exp){
			try {
				divValue = a/temp;
			} catch (Exception e) {
				divValue = 1;
				e.printStackTrace();
			}
			exp.printStackTrace();
		}
		
		
		System.out.println("Division is "+ divValue);
		
		System.out.println("I am about to finish");
		System.out.println("I am finished...");
	}

}
