package collection;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class Collections_BlockingQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BlockingQueue<String> names = new LinkedBlockingQueue<>(5);
		
		names.add("bob");
		names.add("joe");
		names.add("lucie");
		names.add("wills");
		names.add("adam");
		names.offer("brown");
		
		System.out.println(names);
		System.out.println(names.peek());
		

	}

}
