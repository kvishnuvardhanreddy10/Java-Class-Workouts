package collection;

import java.util.HashMap;

public class Collections_HashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer, String> hash = new HashMap<>();
		
		hash.put(1, "a");
		hash.put(2, "b");
		hash.put(3, "c");
		hash.put(4, "d");
		
		System.out.println(hash);
		
		hash.remove(4);
		
		System.out.println(hash);
		
		hash.replace(3, "d");
		
		System.out.println(hash);
		System.out.println(hash.containsKey(1));
		

	}

}
