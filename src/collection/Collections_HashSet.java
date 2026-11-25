package collection;

import java.util.HashMap;
import java.util.HashSet;

public class Collections_HashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<String> hash = new HashSet<>();
		
		hash.add("Delhi");
		hash.add("Chennai");
		hash.add("Kochi");
		hash.add("Mumbai");
		
		System.out.println(hash);
		
		hash.remove("Kochi");
		
		System.out.println(hash);
		System.out.println(hash.contains("Chennai"));
		System.out.println(hash.isEmpty());

		for(String s : hash) {
			System.out.println(s);
		}
	}

}
