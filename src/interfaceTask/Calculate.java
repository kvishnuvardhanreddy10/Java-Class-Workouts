package interfaceTask;

import java.util.Scanner;

public class Calculate implements Add {
	Scanner sc = new Scanner(System.in);
	
	public void add() {
		System.out.println("enter 1st String");
		String a = sc.nextLine();
		System.out.println("enter 2st String");
		String b = sc.nextLine();
		System.out.println("Addition of 1st and 2nd String is : " + (a+b));
	}
}
