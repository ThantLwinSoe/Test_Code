public class Outer {

	public static void staticMessage() {

		System.out.println("This is Outer Class. Static Method.");

		InnerStatic is = new InnerStatic();
		is.doSomething();

	}

	public void doSomething() {

		System.out.println("This is Outer Class. Instance Method.");

		InnerStatic is = new InnerStatic();
		is.doSomething();

		Inner in = new Inner();
		in.doSomething();



	}


	public static class InnerStatic {

		public void doSomething() {

			System.out.println("This is InnerStatic Class. Insance method.");

		}

	}

	public class Inner {

		public void doSomething() {

			System.out.println("This is Inner Class. Instance Method.");

		}
	}
}