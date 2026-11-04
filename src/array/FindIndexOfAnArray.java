package array;

public class FindIndexOfAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] arr = {10, 20, 30, 40, 50, 60};
		
		int key = 40;
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == key) {
				System.out.println("index : " + i);
			}
		}
	}

}
