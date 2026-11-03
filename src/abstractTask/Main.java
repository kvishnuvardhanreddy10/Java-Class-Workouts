package abstractTask;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1 = new Implement1();
		e1.information("Vishnu", "Must be improve");
		e1.display();
		
		System.out.println();
		
		Employee e2 = new Implement2();
		e2.information("Vishnu", "Must be improve");
		e2.display();
	}

}
