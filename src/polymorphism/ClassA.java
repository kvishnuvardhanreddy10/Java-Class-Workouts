package polymorphism;

public class ClassA {
	
	String employeeName;
	int salary;
	int shift;
	
	public ClassA(String employeeName, int salary, int shift) {
		this.employeeName = employeeName;
		this.salary = salary;
		this.shift = shift;
	}
	
	void display() {
		System.out.println("EmployeeName : " + employeeName);
		System.out.println("EmployeeSalary : " + salary);
		System.out.println("EmployeeShift : " + shift);
	}
}
