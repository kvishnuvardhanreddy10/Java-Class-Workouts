package java8Features;

import java.util.Scanner;

public class LambdaExpression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		FunctionalInterface1 functionalInterface1 = ()->{
			System.out.print("Enter u r name : ");
			String name = sc.nextLine();
			return "U r name is : " + name;
		};
		
		System.out.println(functionalInterface1.method()); 
		
		FunctionalInterface2 functionalInterface2 = (int a, int b)-> a+b;
		
		System.out.println("Addition of a and b : " + functionalInterface2.calculator(30, 10));
	}

}
