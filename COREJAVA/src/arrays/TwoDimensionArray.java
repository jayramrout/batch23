package arrays;

public class TwoDimensionArray {

	public static void main(String[] args) {
		int johnAge = 20;
		int samAge = 40;
		int rajAge = 35;
		

		int allAges[] = new int[10];
		allAges[3] = 30;
		
		System.out.println("allAges.length  =  "+allAges.length);
		for(int i = 0 ; i < allAges.length ; i++) {
			System.out.println("allAges["+i+"]  "+allAges[i]);
		}
		
		/*
		  This is know as enhanced for loop
		 */
		for(int age : allAges){
			System.out.println(age);
		}
		
		
	}
}
