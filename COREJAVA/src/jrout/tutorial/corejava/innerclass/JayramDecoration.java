package jrout.tutorial.corejava.innerclass;

public class JayramDecoration {
	
	
	class BedRoom{
		//State
		//Behaviour
		
		public void printBedRoomDetail(){
			System.out.println("This bed room is the best design ever in the market");
			System.out.println("This is the most unique Room in the world...");
		}
	}
	class DrawingRoom{
		
	}
}

class Tata{
	
	public static void main(String arg[]) {
		JayramDecoration jd = new JayramDecoration();
//		BedRoom rd = jd.new BedRoom(); // Resolve this compilation issue by uncommmenting the code...
	}
}