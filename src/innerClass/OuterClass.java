package innerClass;

public class OuterClass {
	
	class InnerClass1 {
		void sample1() {
			System.out.println("normal inner class 1 and normal method");
		}
	}
	
	static class InnerClass2 {
		static void sample2() {
			System.out.println("static inner class 2 and static method");
		}
	}
	
	static class InnerClass3 {
		void sample3() {
			System.out.println("static inner class 3 and normal method");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OuterClass outer = new OuterClass();

		OuterClass.InnerClass1 inner1 = outer.new InnerClass1();
		inner1.sample1();
		
		OuterClass.InnerClass2.sample2();
		
		OuterClass.InnerClass3 inner3 = new InnerClass3();
		inner3.sample3();
		
		
	}

}
