package arrays;

public class ArraysExample {

	public static void main(String[] args) {
		int johnAge = 20;
		int samAge = 40;
		int rajAge = 35;
		
//		int allAges[] = {johnAge , samAge , rajAge , 50};
		int allAges[] = new int[10]; // 0......7
		allAges[0] = johnAge;
		allAges[1] = samAge;
		allAges[2] = rajAge;
		allAges[3] = 50;
		
		System.out.println(allAges[1]);
		allAges[1] = ++samAge;
		System.out.println(allAges[1]);
		
		System.out.println(allAges[4]);
		System.out.println(allAges[5]);
		System.out.println(allAges[6]);
		System.out.println(allAges[7]);
		
//		System.out.println(allAges[1]);
//		System.out.println(allAges[2]);
//		System.out.println(allAges[0]);
		
		/*for(int i = 0; i < 3 ; i++){
			System.out.println(allAges[i]);
		}*/
		
		/*int i = 0;
		while(i < 3) {
			System.out.println(allAges[i]);
			i++;
		}*/
		
	}
}
