package collection;

import java.util.LinkedList;

public class Collections_LinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList<Integer> data = new LinkedList<>();
		
		data.add(10);
		data.addFirst(5);
		data.addLast(15);
		data.add(20);
		data.add(25);
		System.out.println(data);
		data.removeFirst();
		data.removeLast();
		data.remove(0);
		System.out.println(data);
		System.out.println(data.contains(15));
	}

}
