package polymorphism;

public class Method_Overloading {
	
	void Calculate(int a, int b) {
		System.out.println("Add : " + (a+b));
	}
	
	void Calculate(double a, double b) {
		System.out.println("Sub : " + (a-b));
	}
	
	void Calculate(int a, double b) {
		System.out.println("Mul : " + (a*b));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Method_Overloading obj = new Method_Overloading();
		
		obj.Calculate(10, 30);
		obj.Calculate(10.30, 20.45);
		obj.Calculate(10, 5.5);
	}

}
