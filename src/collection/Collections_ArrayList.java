package collection;

import java.util.ArrayList;

public class Collections_ArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> array = new ArrayList<>();
		
		array.add("Vishnu");
		array.add("Messi");
		array.add("Boston");
		array.add("Madrid");
		
		System.out.println(array);
		System.out.println(array.get(3));
		
		array.set(0, "Texas");
		
		System.out.println(array);
		System.out.println(array.size());
		System.out.println(array.isEmpty());
		
		array.remove(1);
		
		System.out.println(array);
		
		array.clear();
		
		System.out.println(array.isEmpty());
		
	}
	

}
