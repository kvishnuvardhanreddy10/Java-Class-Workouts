package syn_thread;


public class Syn_Thread extends Syn_Thread1 {
	
	synchronized void food() {
		for(int i = 0; i <= 10; i++) {
			
			
			try {
				System.out.println("Food : " + i);
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			if(i == 0) {
				try {
					wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
//		try {
//			wait();
//			System.out.println("Thread 1 completed");
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
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
		
//		try {
//			wait();
//			System.out.println("Thread 2 completed");
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
	}
	
	synchronized void delivered() {
		for(int i = 0; i <= 10; i++) {
			
			
			try {
				System.out.println("Food delivered : " + i);
				Thread.sleep(500); // sleep -> it automatically release after mentioned delay
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
	
	synchronized void release() {
		notify(); // it release only the first thread which blocked by wait() method
		notifyAll(); // it release all thread which blocked by wait() method
		System.out.println("released....");
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
		
		Thread t4 = new Thread(()->{
			syn_Thread.parentmethod();
		});
		
		Thread t5 = new Thread(()->{
			syn_Thread.release();
		});
		
		t1.start(); // if we are calling thread method then we have use start() instead of method name.
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		syn_Thread.booking();
		
	}
}

