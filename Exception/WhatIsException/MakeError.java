public class MakeError {

	public static void main(String [] args) {

		System.out.println("Start Main Class.");
		
		method1();

		System.out.println("End Main Class");
	}

	static void method1() {
		System.out.println("Method One.");

		method2();
	}

	static void method2() {
		System.out.println("Mehtod Two.");

		method3();
	}

	static void method3() {
		System.out.println("Method Three.");

		method4();
	}

	static void method4() {

		// This is Exception Code
		int i = 10 / 0;

		System.out.println("Method Four.");
	}
}