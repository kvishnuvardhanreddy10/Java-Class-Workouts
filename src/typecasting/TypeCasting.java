package typecasting;

public class TypeCasting {
	
	static void TypeMethod() {
		System.out.println("--- Type Casting ---");
		
		int num = 100;
		String numSt = String.valueOf(num);
		System.out.println(numSt);
		
		String number = "2323";
		int numberInt = Integer.valueOf(number);
		System.out.println(numberInt);
		
		int age = 22;
		byte ageBy = (byte) age;
		System.out.println(ageBy);
		
		boolean pass = true;
		String passSt = String.valueOf(pass);
		System.out.println(passSt);
		
		float pi = 3.44f;
		int piInt = (int) pi;
		System.out.println(piInt);
	}

	public static void main(String[] args) {
		TypeMethod();
	}

}
