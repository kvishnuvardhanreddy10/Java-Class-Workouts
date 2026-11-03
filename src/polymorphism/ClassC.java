package polymorphism;

public class ClassC extends ClassB {
	
	public ClassC(String employeeName, int salary, int shift) {
		super(employeeName,salary,shift);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClassC obj = new ClassC("Vishnu", 25000, 8);
		obj.display();
		
	}

}
