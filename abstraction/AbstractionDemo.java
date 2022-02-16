abstract class Test {

	void show() {
		System.out.println("Hello instance method at the abstract class");
	}

	abstract void doSomething();
}

class Child extends Test {

	void doSomething() {
		System.out.println("This is Child instance Method.");
	}
}

class T1 {

	void ok() {
		System.out.println("OKay");
	}

	void doSomething() {
		System.out.println("Hello T1 instance method.");
	}
}

class T2 extends T1 {
	void hello() {
		System.out.println("T2 instance method.");
	}
}