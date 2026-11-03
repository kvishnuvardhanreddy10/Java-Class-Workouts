package operators;

public class Operators {
	
	public static void main(String[] args) {
		
		int v1 = 5;
		int v2 = 2;
		
		// 8 4 2 1
		// 0 1 0 1 => 5
		// 0 0 1 0 => 2
		// 0 0 0 0 => 0 And bit wise
		System.out.println(v1 & v2);
		
		// 8 4 2 1
		// 0 1 0 1 => 5
		// 0 0 1 0 => 2
		// 0 1 1 1 => 7
		System.out.println(v1 | v2);
		
		// 8 4 2 1
		// 0 1 0 1 => 5
		// 0 0 1 0 => 2
		// 0 1 1 1 => 7
		System.out.println(v1 ^ v2);
	}

}
