package polymorphism;

public class Method_OverridingChild extends Method_OverridingParent{
	
	@Override
	void display() {
		super.display();
		String name = "Badri";
		System.out.println("Name : " + name);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Method_OverridingChild obj = new Method_OverridingChild();
		obj.display();
	}

}
