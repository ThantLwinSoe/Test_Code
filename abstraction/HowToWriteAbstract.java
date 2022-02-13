abstract class Animal {

	abstract void feed(String food);

	private final void greet() {
		System.out.println("Hello Java.");
	}
}

class Monkey extends Animal {

	void feed(String food) {

		System.out.println("Oishi Kwe Kwe!");
	}


}

abstract class Elephant extends Animal {

	abstract void wash();

}


class AsiaElephant extends Elephant {

	void feed(String food) {
		System.out.println("Yes I Like this food.");
		System.out.println("Mor");
	}

	void wash() {
		System.out.println("Yes I love Water!!!");
	}
}




class Zoo {

	Animal [] animals = new Animal[10];

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