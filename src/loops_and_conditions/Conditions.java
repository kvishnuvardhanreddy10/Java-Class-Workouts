package loops_and_conditions;

import java.util.Scanner;

public class Conditions {
	
	static void mark() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter u r mark : ");
		int mark = sc.nextInt();
		
		if(mark<=100 && mark>=91) {
			System.out.println("U Secured Grade A+");
		}else if(mark<=90 && mark>=81) {
			System.out.println("U Secured Grade A");
		}else if(mark<=80 && mark>=71) {
			System.out.println("U Secured Grade B+");
		}else if(mark<=70 && mark>=61) {
			System.out.println("U Secured Grade B");
		}else if(mark<=60 && mark>=50) {
			System.out.println("U Secured Grade C");
		}else if(mark<=49 && mark>=0) {
			System.out.println("U Failed");
		}else {
			System.out.println("U entered incorrect mark");
		}
		
		if(mark >= 50 && mark <=100) {
			System.out.println("Pass");
		}else if(mark >= 0 && mark <=49) {
			System.out.println("Fail");
		}
	}

	static void switchMethod() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter operation number : ");
		int operation = sc.nextInt();
		
		int value1 = 0, value2 = 0;
		
		switch(operation) {
		case 1:
			System.out.println("enter value 1 : ");
			value1 = sc.nextInt();
			System.out.println("enter value 2 : ");
			value2 = sc.nextInt();
			System.out.println("Add : " + (value1 + value2));
			break;
		case 2:
			System.out.println("enter value 1 : ");
			value1 = sc.nextInt();
			System.out.println("enter value 2 : ");
			value2 = sc.nextInt();
			System.out.println("Sub : " + (value1 - value2));
			break;
		case 3:
			System.out.println("enter value 1 : ");
			value1 = sc.nextInt();
			System.out.println("enter value 2 : ");
			value2 = sc.nextInt();
			System.out.println("Mul : " + (value1 * value2));
			break;
		case 4:
			System.out.println("enter value 1 : ");
			value1 = sc.nextInt();
			System.out.println("enter value 2 : ");
			value2 = sc.nextInt();
			System.out.println("Div : " + (value1 / value2));
			break;
		default:
			System.out.println("Invalid operation number. give only 1,2,3 or 4 to perform operation");
		}
		
	}
	
	
	public static void main(String[] args) {
		
		
		Conditions.mark();
		System.out.println();
		Conditions.switchMethod();
		
		
	}

}
