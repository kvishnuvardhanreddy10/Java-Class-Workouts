package collection;

import java.util.TreeSet;

public class Collections_TreeSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeSet<String> names = new TreeSet<>();
		names.add("Vishnu");
		names.add("Badri");
		names.add("Anwar");
		
		System.out.println(names);
		System.out.println(names.isEmpty());
		System.out.println(names.contains("Badri"));
		
		names.remove("Vishnu");
		
		System.out.println(names);
		
		names.clear();
		
		System.out.println(names.isEmpty());
		System.out.println(names);
	}

}
