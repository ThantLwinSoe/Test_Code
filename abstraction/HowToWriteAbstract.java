public abstract class Animal {

	abstract void feed(String food);

	void greet() {
		System.out.println("Hello Java.");
	}
}

class Monkey extends Animal {

}

class Elephant extends Animal {

}




public class Zoo {

	Animal [] animals = new animals[10];

	boolean add(Animal animals) {

		return true;
	}

	void feed(String food) {

		for(Animal a : animals) {
			if(null != a) {
				a.feed(food);
			}
		}
	}

} 