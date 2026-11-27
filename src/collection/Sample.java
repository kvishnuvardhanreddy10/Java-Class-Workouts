package collection;

import java.util.ArrayList;

public class Sample {
	
	private String name;
	private int age;

	public Sample(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public Sample() {
	}
	
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	

	@Override
	public String toString() {
		return "Sample [name=" + name + ", age=" + age + "]";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Sample> sample = new ArrayList<>();
		
		sample.add(new Sample("Vishnu", 22));
		sample.add(new Sample("Wills", 24));
		sample.add(new Sample("Sadie", 22));
		
		System.out.println(sample);
		System.out.println();
		
		for(Sample sam : sample) {
			System.out.println(sam.getName() + " " + sam.getAge());
		}
		
		System.out.println();
		
		sample.set(0, new Sample("Rose", 25));
		
		System.out.println(sample);
		
		System.out.println();
		
		for(Sample sam : sample) {
			System.out.println(sam.getName() + " " + sam.getAge());
		}
		
		System.out.println();
		
	}

}
