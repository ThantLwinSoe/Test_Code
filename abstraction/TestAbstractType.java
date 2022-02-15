abstract class Person {

	abstract void greet(String name);

	abstract void hairColor(String color);

}

class Student extends Person implements Granturate { 

	void greet(String name) {
		System.out.println("Hello I'm Student." + name);
	}

	void hairColor(String color) {

		System.out.println("I' have " + color + " hair.");
	}

	void sport(String sport) {
		System.out.println("I like " + sport + ".");
	}

	public void goUni(String university) {

		System.out.println("I want to go "+ university + ".");
	}
}


/*interface Granturate {

	void goUni(String university);


}*/

class Test {

	public static void main(String [] args) {

		Student s = new Student();
		s.goUni("TU");

	}
}