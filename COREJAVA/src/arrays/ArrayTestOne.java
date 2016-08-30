package arrays;

public class ArrayTestOne {

	public static void main(String[] args) {

		int age1 = 30;
		int age2 = 20;
		int age3 = 10;
		int age4 = 10;
		
		int ages[] = new int[5];
//		
		ages[0] = age1;
		ages[1] = 11;
		ages[2] = 12;
		ages[3] = 13;
		ages[4] = 24;
//		
//		System.out.println("ages[4] = " +  ages[4]);
		printAges(ages);
	}
	
	public static void printAges(int ages[]){
		
		/*for(int i = 0  ; i < ages.length; i++) {
			System.out.println(ages[i]);
		}*/
		
		for(int age : ages){
			System.out.println(age);
		}
		
	}
	
	public static void printAges(int age1 , int age2 , int age3, int age4){
		System.out.println(age1 +" " + age2 +" " + age3 +" " + age4);
	}
}
