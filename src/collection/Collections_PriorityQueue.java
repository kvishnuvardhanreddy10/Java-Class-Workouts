package collection;

import java.util.PriorityQueue;

public class Collections_PriorityQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PriorityQueue<Integer> num = new PriorityQueue<>(); // it works based on min leap algorithm
		
		num.add(3);
		num.add(-2);
		num.add(-5);
		num.add(0);
		num.add(1);
		
		System.out.println(num); 
		
		num.poll(); // it removes first element
		
		System.out.println(num);

	}

}
