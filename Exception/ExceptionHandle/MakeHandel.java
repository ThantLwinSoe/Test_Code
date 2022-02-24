public class MakeHandel {

	public static void main(String [] args) {

		System.out.println("Main Class Start.");

		method1();

		System.out.println("Main Class End.");

	}
	static void method1() {
		System.out.println("Method One.");

		method2();

		System.out.println("Method One End");


	}
	static void method2() {
		System.out.println("Method Two.");
		method3();

		System.out.println("Method Two End.");
	}
	static void method3() {
		System.out.println("Method Three.");

		method4();

		System.out.println("Method Three End.");
	}
	static void method4() {
		System.out.println("Method Four.");

		try {
			int i = 100/0;
		} catch(ArithmeticException e) {
			System.out.println("Exception Handle.");
		}
		

		System.out.println("Method Four End");
	}
}