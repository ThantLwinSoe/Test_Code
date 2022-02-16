public class AnnonemusTestDemo {

	public static void main(String [] args) {

		MyClass ob = new MyClass("Thant Lwin Soe") {

			void hello() {
				System.out.println("Hello Annonemus.");
			}
		};

		ob.hello();
		System.out.println(ob.name);


	}

	static{
		Say ok = new Say(){
			public void doSomething() {
				System.out.println("Interface Annonemus.");
			}
		};
		ok.doSomething();
	}
}

abstract class MyClass {

	public String name;

	MyClass(String name) {
		this.name = name;
	}

	abstract void hello();
}

interface Say {

	void doSomething();
}