package exception;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// runtime exception
		System.out.println("Hello World...");
		
		try {
		int a = 10, b = 0;
		System.out.println(a/b);
		}catch(ArithmeticException e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("Good Morning");
		
		try {
		String data = null;
		System.out.println(data.length());
		}catch(NullPointerException e) {
			System.out.println(e.getMessage());
		}
		
		try {
		String name = "max";
		System.out.println(name.charAt(3));
		}catch(StringIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}finally {
			System.out.println("array execution is completed");
		}
		
		try {
		String a = "10a";
		int no = Integer.valueOf(a);
		System.out.println();
		}catch(NumberFormatException e) {
			System.out.println(e.getMessage());
		}
		
		
		// Compile time exception
		try {
		Thread.sleep(2000);
		System.out.println("Start method");
		}catch(InterruptedException e) {
			System.out.println(e.getMessage());
		}
	}

}
