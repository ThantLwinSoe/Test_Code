public class OverrideException {

	public static void main(String [] args) {

		doBusiness(new SuperClass());

		doBusiness(new SubClass());

	}

	static void doBusiness(SuperClass obj) {

			try {
				obj.doSomething();
			} catch(Exception e) {
				System.out.println("Exception Handel.");
			}
	}
}

	/* if SuperClass method have declared Exception, no need to declared Exception in Child Class.
		if Child Class Have Exception must declared SuperClass.
		Child class must comply defined Exception range in Super Class.
		No more range than superClass.
		It's all CheckException.

		But RunTime and Error is not problem.

	*/

public class SuperClass {

	void doSomething() throws Exception{
		System.out.println("Hello SuperClass.");
	}

}

class SubClass extends SuperClass{

	void doSomething() throws Exception{

		throw new Exception();
		//System.out.println("Hello SubClass.");
	}

}

class MyException extends Exception {

}

class MyException2 extends Exception {

}