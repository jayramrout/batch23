package arrays;

public class SwitchStatement {

	public static void main(String[] args) {
		int input = 5;
		
		/*if(input == 1){
			System.out.println("Input is One");
		}else  if(input == 2){
			System.out.println("Input is Two");
		}else  if(input == 3){
			System.out.println("Input is Three");
		}else if(input == 4){
			System.out.println("Input is Four");
		}else if(input == 5){
			System.out.println("Input is Five");
		}else if(input == 6){
			System.out.println("Input is Six");
		}else if(input == 10){
			System.out.println("Input is Ten");
		}else {
			System.out.println("This is default...");
		}*/
		
		switch (input) {
			case 1:
				System.out.println("Input is 1");
				break;
			case 2:
				System.out.println("Input is 2");
				break;
			case 3:
				System.out.println("Input is 3");
				break;
			case 4:
				System.out.println("Input is 4");
				break;
			case 5:
				System.out.println("Input is 5");
				break;
			case 6:
				System.out.println("Input is 6");
				break;
			case 10:
				System.out.println("Input is Ten");
				break;
			default:
				System.out.println("This is default...");
				break;
		}

	}

}
