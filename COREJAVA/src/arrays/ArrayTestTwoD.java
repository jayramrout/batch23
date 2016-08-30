package arrays;

public class ArrayTestTwoD {

	public static void main(String[] args) {
		
		String rajName = "Raj";
		String rajAge = "30";
		String []rajInfo = {rajName, rajAge};
		
		printInfo(rajInfo);
		/*for(String name : rajInfo){
			System.out.println(name);
		}*/
		
		
		String surajName = "Suraj";
		String surajAge = "34";
		String []surajInfo = {surajName, surajAge};
		printInfo(rajInfo);
		/*for(String name : surajInfo){
			System.out.println(name);
		}*/
		
		
		String samName = "Sam";
		String samAge = "54";
		String []samInfo = {samName, samAge};
		printInfo(rajInfo);
		
		/*for(String name : samInfo){
			System.out.println(name);
		}*/
		
		
		// Use For Loop inside a for loop...
		String personInfo[][] = {rajInfo , surajInfo , samInfo};
		
	}
	
	public static void printInfo(String [] info){
		for(String name : info){
			System.out.println(name);
		}
	}
	
	
	
}
