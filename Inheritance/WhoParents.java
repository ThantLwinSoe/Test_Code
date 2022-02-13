public class Parent {

	public void greet() {
		System.out.println("This Parents.");
	}

	public static void hello() {
		System.out.println("Parent Hello");
	}
}

public class ChildOne extends Parent {

	public void greet() {
		System.out.println("This is Child One.");
	}

	
	public static void hello() {
		System.out.println("One Hello.");
	}

}

public class ChildTwo extends ChildOne {

	public void greet() {
		System.out.println("This is Child Two.");
	}
}

public class ChildThree extends ChildTwo {

	public void greet() {
		 
		 super.greet();
	} 
}