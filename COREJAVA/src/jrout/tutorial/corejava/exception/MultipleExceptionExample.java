package jrout.tutorial.corejava.exception;

public class MultipleExceptionExample {

	public static void main(String[] args) {
		MultipleExceptionExample ee = new MultipleExceptionExample();
		ee.printInfo(12,2, 4);
		
	}
	public void printInfo(int a , int b , int temp) {
		String names[] = {"Lalitha","John","Mike","Tom"};
		String pickedName = "No Name Choosen...";
		
		int divValue = 0;
		System.out.println("Addition of two Numbers is "+ (a+b));
		
		try{
			divValue = a/b;
			System.out.println("Divsion is done....");
			pickedName = names[divValue];
		}catch(ArrayIndexOutOfBoundsException aioExp){
			System.out.println("I am in ArrrayIndex Expeption block");
		}catch(ArithmeticException aexp){
			System.out.println("I am in Arithemetic Expeption block");
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
		
		System.out.println("Picked Name ="+ pickedName);
		
		System.out.println("I am finished...");
	}

}
