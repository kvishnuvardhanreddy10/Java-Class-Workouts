package multithread;

public class Multithread extends Thread {
	
	public void loop() {
		for(int i = 1; i <= 10; i++) {
			
				System.out.println("Loop : " + i);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					
				}
			}
		}
	
	
	public void run() {
		for(int i = 1; i <= 50; i++) {
			
			if(i % 5 == 0) {
				System.out.println("Thread : " + i);
			}
		}
		System.out.println("Thank you");		
	}

}
