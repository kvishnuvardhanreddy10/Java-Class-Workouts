package multithread;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		Multithread multithread = new Multithread();
		multithread.start();
		multithread.loop();
		
		System.out.println("-----------------------------------------------");
		
		Child child = new Child();
		Thread thread = new Thread(child);
		
		
		thread.start();
		if(multithread.isAlive()) {
			System.out.println("t1 is alive");
		}
		else {
			System.out.println("t1 is not alive");
		}
		
		if(thread.isAlive()) {
			System.out.println("t2 is alive");
		}
		else {
			System.out.println("t2 is not alive");
		}
		thread.join();
		child.even();
		child.normal();
		
	}

}
