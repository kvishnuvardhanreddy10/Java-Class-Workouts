package interfaceTask;

import java.util.Scanner;

public class Calculator implements Add, Sub{
	Scanner sc = new Scanner(System.in);
	
	public void add() {
		System.out.println("enter 1st number");
		int a = sc.nextInt();
		System.out.println("enter 2st number");
		int b = sc.nextInt();
		System.out.println("Addition of 1st and 2nd number is : " + (a+b));
	}
	
	public void sub() {
		System.out.println("enter 1st number");
		int a = sc.nextInt();
		System.out.println("enter 2st number");
		int b = sc.nextInt();
		System.out.println("Subtraction of 1st and 2nd number is : " + (a-b));
	}
}	
