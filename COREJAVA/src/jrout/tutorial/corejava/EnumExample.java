package jrout.tutorial.corejava;

enum Months{
	JAN(11), FEB(22) ,MARCH(33),APRIL(44);
	
	int val;
	
	private Months(int val) {
		this.val = val;
	}
	
	public int getValue(){
		return this.val;
	}
	
	}

public class EnumExample {

	public static void main(String[] args) {
		
		printMonth(Months.FEB);
	}
	public static void printMonth(Months month) {
		if(month == Months.JAN){
			System.out.println("January");
		}else if(month == Months.FEB){
			System.out.println("Feb value is "+ Months.FEB.getValue());
		}else if(month == Months.MARCH){
			System.out.println("March");
		}else if(month == Months.APRIL){
			System.out.println("April");
		}
	}
	
	/*public static void printMonth(int monthNumber) {
		if(monthNumber == 1){
			System.out.println("January");
		}else if(monthNumber == 2){
			System.out.println("Feb");
		}else if(monthNumber == 3){
			System.out.println("March");
		}else if(monthNumber == 4){
			System.out.println("April");
		}
	}
	*/

}
