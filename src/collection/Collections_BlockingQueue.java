package collection;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class Collections_BlockingQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BlockingQueue<String> names = new LinkedBlockingQueue<>(5); // it is used because we can give size while creating
		
		names.add("bob");
		names.add("joe");
		names.add("lucie");
		names.add("wills");
		names.add("adam");
		names.offer("brown"); // if space available then it adds or else it execute the next code without throwing an error
		
		System.out.println(names);
		System.out.println(names.peek()); // displays first value
		

	}

}
