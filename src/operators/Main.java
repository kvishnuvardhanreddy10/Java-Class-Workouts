package operators;

import accessModifier.ProtectedClass;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProtectedClass obj1= new ProtectedClass();
		SubProtectedClass obj2 = new SubProtectedClass();
		
		obj2.method3();
		obj2.subMethod();
	}

}
