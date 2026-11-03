package array;

import java.util.Scanner;

public class OneDimensionArray {
	
	Scanner sc = new Scanner(System.in);
	
	void intArrayMethod() {
		System.out.print("Enter length of an array : ");
		int size = sc.nextInt();
		
		int[] marks = new int[size];
		
		for(int i = 0; i < marks.length; i++) {
			System.out.print("enter u r mark of " + i + " index : ");
			marks[i] = sc.nextInt();
		}
		
		for(int mark : marks) {
			System.out.println("mark : " + mark);
		}
	}
	
	void stringArrayMethod() {
		System.out.print("Enter length of an array : ");
		int size = sc.nextInt();
		sc.nextLine();
		
		String[] names = new String[size];
		
		for(int i = 0; i < names.length; i++) {
			System.out.print("enter u r name of " + i + " index : ");
			names[i] = sc.nextLine();
			
		}
		
		for(String name : names) {
			System.out.println("Name : " + name);
		}
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		OneDimensionArray oneDimensionArray = new OneDimensionArray();
		
		oneDimensionArray.intArrayMethod();
		
		System.out.println();
		
		oneDimensionArray.stringArrayMethod();

	}

}
