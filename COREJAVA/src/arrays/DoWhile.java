package arrays;

public class DoWhile {

	public static void main(String[] args) {
		int n = 10;
		/*for(int i = 0  ; i < n ; i++) {
			System.out.println("tick " + i);
		}*/
		
		/*int j = 0;
		while(j < n){
			System.out.println("tick " + j++);
		}*/
		
		do {
		System.out.println("tick " + n);
		n--;
		} while(n > 0);
	}

}
