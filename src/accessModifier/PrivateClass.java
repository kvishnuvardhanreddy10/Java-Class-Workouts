package accessModifier;

public class PrivateClass {
	
	private String name = "Badri";
	
	private void method2() {
		System.out.println("String Name : " + name);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrivateClass obj1 = new PrivateClass();
		obj1.method2();
		obj1.name = "Venkat";
		System.out.println(obj1.name);
	}

}

