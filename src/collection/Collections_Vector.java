package collection;

import java.util.Vector;

public class Collections_Vector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vector<String> names = new Vector<>();
		
		names.add("Aryna");
		names.add("Rybakina");
		System.out.println(names);
		names.set(0, "Pegula");
		System.out.println(names);

	}

}
