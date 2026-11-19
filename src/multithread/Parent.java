package multithread;

public class Parent {
	
	public void even() {
		for(int i = 1; i <= 10; i++) {
			if(i%2 == 0) {
				
				System.out.println(i + " is a even no");
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
				}
			}
		}
	}

}
