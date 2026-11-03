package operators;

import accessModifier.ProtectedClass;

public class SubProtectedClass extends ProtectedClass {
	
	public void subMethod() {
		System.out.println("String Name : " + name);
	}
	
	protected void method3() {
		super.method3();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
