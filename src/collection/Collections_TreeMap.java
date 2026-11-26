package collection;

import java.util.TreeMap;

public class Collections_TreeMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeMap<Integer, String> appointment = new TreeMap<>();
		
		appointment.put(3, "zoe");
		appointment.put(4, "biye");
		appointment.put(1, "viya");
		appointment.put(2, "boby");
		
		System.out.println(appointment);
		
		appointment.remove(4);	
		appointment.replace(1, "john");
		
		System.out.println(appointment);
		System.out.println(appointment.containsKey(2));
		System.out.println(appointment.replace(1, "john", "wills"));
		System.out.println(appointment.containsValue("zoe"));
		System.out.println(appointment.isEmpty());
		System.out.println(appointment);
		
		appointment.clear();
		
		System.out.println(appointment);
		

	}

}
