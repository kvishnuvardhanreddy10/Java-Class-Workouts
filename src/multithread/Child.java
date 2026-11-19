package multithread;

public class Child extends Parent implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i = 1; i <= 10; i++) {
			System.out.println("Runnable loop : " + i);
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
