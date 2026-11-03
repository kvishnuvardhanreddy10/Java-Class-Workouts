package abstractTask;

public class Implement1 extends Employee{
	private String name;
	private String feedback;
	
	@Override
	public void information(String name, String feedback) {
		this.name = name;
		this.feedback = feedback;
	}

	@Override
	public void display() {
		System.out.println("Name : " + this.name + ", Feedback : " + this.feedback);
		
	}
	
}
