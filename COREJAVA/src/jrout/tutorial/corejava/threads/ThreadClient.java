package jrout.tutorial.corejava.threads;

public class ThreadClient {

	public static void main(String[] args) {
		Runner runner = new Runner("Horse");
		runner.start();

		System.out.println("I am done.....");
		
		
		System.out.println(runner.isAlive());
	}

}

class Runner extends Thread {
	public Runner(String name){
		setName(name);
	}
	public void run(){
		for(int i = 0 ; i < 5; i++) {
			
			/*try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}*/
			
			System.out.println( i +" "+ Thread.currentThread().getName());
		}
	}
}
