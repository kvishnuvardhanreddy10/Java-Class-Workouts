package recursion;

public class Recursion {
	
	public void loop(int value) {
		if(value %5 == 0) {
			System.out.println(value);
		}
		
		if(value == 101) {
			return;
		}
		value++;
		loop(value);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Recursion recursion = new Recursion();
		recursion.loop(1);
	}

}
