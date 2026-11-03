package accessModifier;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PublicClass obj1 = new PublicClass();
		obj1.method1();
		System.out.println(obj1.name);
		
		ProtectedClass obj2 = new ProtectedClass();
		obj2.method3();
		System.out.println(obj2.name);
	}

}
