public class GetOrNot {

	String name = "Thant Lwin Soe";

	public void greet() {
		System.out.println("Hello " + name);
	}

	void doSomething() {
		System.out.println("This is only belong Parent method");
	}
}

public class Child extends GetOrNot {

	public void hello() {
		System.out.println("This is ont Override.");
	}
}