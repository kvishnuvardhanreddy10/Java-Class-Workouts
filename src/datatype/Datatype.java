package datatype;

import java.util.Scanner;

public class Datatype {
	Scanner sc = new Scanner(System.in);
	void Employee() {
		System.out.println("--- Employee Details ---");
		System.out.println("Employee Id :");
		int empid = sc.nextInt();
		System.out.println("Employee Name :");
		sc.nextLine();
		String name = sc.nextLine();
		System.out.println("Employee Salary :");
		double salary = sc.nextDouble();
		System.out.println("Employee Shift Timing :");
		sc.nextLine();
		String time = sc.nextLine();
		
		System.out.println("EmpId : " + empid + " " + "Name : " + name + " " + "Salary : " + salary + " " + "Shift Timing : " + time);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Datatype employee = new Datatype();
		employee.Employee();

	}

}
