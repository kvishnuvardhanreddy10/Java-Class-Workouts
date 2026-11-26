package collection;

import java.util.Stack;

public class Collections_Stack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Stack<Integer> num = new Stack<>();
		
		num.push(1);
		num.push(2);
		num.push(3);
		num.push(4);
		num.push(5);
		
		System.out.println(num);
		
		num.pop();
		
		System.out.println(num.empty());
		System.out.println(num);
	}

}
