package syn_thread;

public class SynThread_Task {
	
	synchronized void method1() {
		for(int i = 1; i <= 5; i++) {
			
			try {
				System.out.println("Method : " + i);
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			if(i == 1) {
				try {
					wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
				}
			}
		}
	}
	
	synchronized void method2() {
		for(int i = 6; i <= 10; i++) {
			
			try {
				System.out.println("Method : " + i);
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		try {
			wait();
			System.out.println("thread 2 completed");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	synchronized void method3() {
		for(int i = 11; i <= 15; i++) {
			
			try {
				System.out.println("Method : " + i);
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		try {
			wait();
			System.out.println("thread 3 completed");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	synchronized void release() {
		notifyAll();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SynThread_Task synThread_Task = new SynThread_Task();
		
		Thread t1 = new Thread(()->{
			synThread_Task.method1();
		});
		
		Thread t2 = new Thread(()->{
			synThread_Task.method2();
		});

		Thread t3 = new Thread(()->{
			synThread_Task.method3();
		});
		
		Thread t4 = new Thread(()->{
			synThread_Task.release();
		});
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}

}
