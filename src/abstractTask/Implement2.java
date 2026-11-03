package abstractTask;

public class Implement2 extends Employee {

	private String name;
	private String feedback;
	
	@Override
	public void information(String name, String feedback) {
		// TODO Auto-generated method stub
		this.name = name;
		this.feedback = "Good" ;
	}

	@Override
	public void display() {
		System.out.println("Name : " + this.name + ", Feedback : " + this.feedback);
		
	}

}
