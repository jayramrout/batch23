package oprator;

public class BooleanLogicalOperator {

	public static void main(String[] args) {
		
		int johnAge = 21;
		int johnMark = 40;
		
		int samAge = 30;
		int samMark = 50;
		
		boolean isGoodAge = (johnAge >= 20 && samAge >= 25);
		boolean hasGoodMarks = ((johnMark + samMark) >= 90); 
		
		String message = "";
		
		
		if(isGoodAge && hasGoodMarks){
//		if((johnAge >=20 && samAge >= 25) && ((johnMark + samMark) >= 90)){
			System.out.println("They are ready to drive a Truck....");
		}else {
			System.out.println("They are not eligible");
		}
		
		
		
		if(isGoodAge){
			System.out.println("Its a good age");
		}else {
			System.out.println("Its not a good age");
		}
		
	}
	

}
