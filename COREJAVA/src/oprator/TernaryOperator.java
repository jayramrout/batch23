package oprator;

public class TernaryOperator {

	public static void main(String[] args) {
		
		int johnAge = 21;
		int johnMark = 40;
		
		int samAge = 30;
		int samMark = 50;
		
		boolean isGoodAge = (johnAge >= 20 && samAge >= 25);
		
		String message = isGoodAge ? "Its a good Age" : "Its not a good Age";
		System.out.println(message);
		
		/*if(isGoodAge){
			System.out.println(message);
//			System.out.println("Its a good age");
		}else {
			System.out.println(message);
//			System.out.println("Its not a good age");
		}*/

	}

}
