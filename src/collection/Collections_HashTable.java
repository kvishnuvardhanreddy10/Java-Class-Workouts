package collection;

import java.util.Hashtable;

public class Collections_HashTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Hashtable<Integer, String> data = new Hashtable<>();
		
		data.put(1, "sadie");
		data.put(2, "Millie");
		data.put(3, "Brown");
		System.out.println(data);
		data.replace(3, "Sinner");
		System.out.println(data);

	}

}
