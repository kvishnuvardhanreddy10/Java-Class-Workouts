package multithread;

public class Child extends Parent implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i = 1; i <= 10; i++) {
			
			try {
				System.out.println("Runnable loop : " + i);
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
	public void normal() {
		for(int i = 1; i <= 40; i++) {
			if(i % 4 == 0) {
			System.out.println("Normal loop : " + i);
			}
		}
	}

	
}
