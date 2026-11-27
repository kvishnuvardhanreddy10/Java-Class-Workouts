package collection;

import java.util.LinkedList;
import java.util.Queue;

public class Collections_Queue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Queue<Integer> data = new LinkedList<>(); // cannot add element at first or last like dequeue
		data.add(10);
		data.add(20);
		data.add(30);
		System.out.println(data);
		data.poll(); // it removes first element
		System.out.println(data);

	}

}
