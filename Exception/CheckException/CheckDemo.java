public class CheckDemo {

	private int count;

	public static void main(String [] args) {

		//doSomething();
		var cd = new CheckDemo();

		try {
			cd.doSomething();
		} catch(RuntimeException e) {
			System.out.println("RunTimeException Handel.");
		} catch(Exception e) {
			System.out.println("Check Exception Handel");
		}

		

	}

	static void hello() {
		System.out.println("Hello Method.");
	}

	void doSomething() throws Exception{
		hello();
		sayHello(0);
	}

	void sayHello(int count) throws Exception{

		if(count <= 0) {
			throw new Exception();
		}

		System.out.println("SayHello Method");
	}
}