package syn_thread;


public class Syn_Thread {
	
	synchronized void food() {
		for(int i = 0; i <= 10; i++) {
			
			
			try {
				System.out.println("Food : " + i);
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	synchronized void location() {
		for(int i = 0; i <= 10; i++) {
			
			
			try {
				System.out.println("Location : chennai " + i);
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	synchronized void delivered() {
		for(int i = 0; i <= 10; i++) {
			
			
			try {
				System.out.println("Food delivered : " + i);
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public void booking() {
		for(int i = 1; i <= 20; i++) {
			
			
			try {
				System.out.println("booking : " + i);
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		Syn_Thread syn_Thread = new Syn_Thread();
		
		Thread t1 = new Thread(()->{
			syn_Thread.food();
		});
		
		Thread t2 = new Thread(()->{
			syn_Thread.location();
		});
		
		Thread t3 = new Thread(()->{
			syn_Thread.delivered();
		});
		
		t1.start();
		t2.start();
		t3.start();
		syn_Thread.booking();
	}
}

