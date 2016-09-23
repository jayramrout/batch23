package jrout.tutorial.corejava.exception.ude;

public class UserDefinedExceptionExample {

	public static void main(String[] args) {
		UserDefinedExceptionExample udee = new UserDefinedExceptionExample();
		String name="";
		String diffName = "";
		/*try {
			name = udee.pickAName(3);
		} catch (Exception e) {
			e.printStackTrace();
			name = "No Name Choosen";
		}
		*/
//		diffName = udee.pickADiffName(4);
//		name = udee.pickAName(4);
		
		
		/*try {
			diffName = udee.pickADiffName(4);
			name = udee.pickAName(4);
			
		} catch (WrongIndexException e) {
			e.printStackTrace();
		}catch(Exception exp){
			exp.printStackTrace();
			System.err.println("This is Error...");
		}
		*/
		System.out.println("Picked Name = " + name);
		try {
			udee.callMethod();
		} catch (Exception e) {
			e.printStackTrace();
		}
		udee.call2();
	}

	
	
	public void callMethod() throws Exception {
		UserDefinedExceptionExample udee = new UserDefinedExceptionExample();
		udee.pickADiffName(4);
		udee.pickAName(4);
	}
	
	public void call2(){
		
	}
	
	
	public String pickAName(int index) throws Exception {
		String names[] = {"Lalitha","John","Mike","Tom"};
		
		String name = names[index];
		return name;
	}
	
	public String pickADiffName(int index) throws WrongIndexException {
		String names[] = {"Lalitha","John","Mike","Tom"};
		
		if(index > 3) {
			throw new WrongIndexException("Please Given Index Less than 3 . You have give an Index "+ index);
		}
		String name = names[index];
		return name;
	}
}
