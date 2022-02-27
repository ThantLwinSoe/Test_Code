public class SubType {

	public static void main(String [] args) {

		SubClass<Animals> obj = new SubClass<>();

		obj.doSomething(new Animals("PuSi"));

		SuperClass<Dog> obj2 = new SuperClass<>();
		obj2.doSomething(new Dog("Nga Nyo"));



	}
}

class SuperClass <Type extends Animals> {

	private Type ok;

	void doSomething(Type ok) {
		ok.feed();
	}

}

class SubClass <Type extends Animals> extends SuperClass<Type>{

}

// class SubClassTwo extends SuperClass <Type> {

// }

class Animals {

	private String name;

	Animals(String name) {
		this.name = name;
	}

	void feed() {
		System.out.println("Yap Yummy!!!");
	}

	void sayHello() {
		System.out.println("Hello I'm " + name);
	}

}

class Dog extends Animals {

	Dog(String name) {
		super(name);
	}
}