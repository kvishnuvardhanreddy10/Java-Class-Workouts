package collection;

import java.util.ArrayDeque;
import java.util.Deque;

public class Collections_Deque {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Deque<Integer> num = new ArrayDeque<>();
		
		num.addFirst(10);
		num.addLast(20);
		num.add(30);
		num.add(40);
		
		System.out.println(num);
		
		num.removeFirst();
		
		System.out.println(num);
		
		num.removeLast();
		
		System.out.println(num);
	}

}
