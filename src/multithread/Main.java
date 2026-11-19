package multithread;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Multithread multithread = new Multithread();
		multithread.start();
		multithread.loop();
		
		System.out.println("-----------------------------------------------");
		
		Child child = new Child();
		Thread thread = new Thread(child);
		thread.start();
		child.even();
		child.normal();
		
	}

}
