package interfaceTask;

public interface Add {
	public void add();
	
	static void method1() {
		System.out.println("Static method");
	}
	
	default void method2() {
		System.out.println("Default method");
	}
	
	private void method3() {
		System.out.println("Private method");
	}
	
	default void call() {
		method3();
	}
	
	public static void main(String[] args) {
		Add obj1 = new Calculator();
		Add.method1();
		obj1.method2();
		obj1.method3();
		
	}
}

