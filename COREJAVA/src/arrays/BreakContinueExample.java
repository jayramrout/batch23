package arrays;

public class BreakContinueExample {

	public static void main(String[] args) {
		continueExample();
	}
	
	public static void continueExample() {
		int ageInput = 4;
		boolean present = false;
		
		int ages[] = {2,3,4,5,6,7,8,9};
		
		for(int i = 0 ;i  < ages.length; i++) {
			if(ages[i] == ageInput) {
				continue;
			}
			System.out.println("Age "+ ages[i]+" is Accountable for Having fun");
		}
	}
	
	
	/**
	 * This method is used for showcase example of Break
	 */
	public static void breakExample() {
		int ageInput = 5;
		boolean present = false;
		
		int ages[] = {2,3,4,5,6,7,8,9};
		
		for(int i = 0 ;i  < ages.length; i++) {
			if(ages[i] == ageInput) {
				present = true; 
				break;
			}
		}
		
		if(present){
			System.out.println("Yes " + ageInput +" Is Present Inside Age Array");	
		}else {
			System.out.println("Yes " + ageInput +" Is Not Present Inside Age Array");
		}
	}
	
}
