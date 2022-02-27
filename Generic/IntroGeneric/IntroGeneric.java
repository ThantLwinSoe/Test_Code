import java.util.*;

public class IntroGeneric {

	public static void main(String [] args) {

		var obj = new Container <Integer> ();
		obj.add(1000);
		System.out.println(obj.get(0));
		System.out.println(Arrays.toString(obj.getAll()));

	}
}

class Container <Type> {

	@SuppressWarnings("unchecked")
	private Type [] array = (Type []) new Object[0];

	void add(Type tp) {

		array = Arrays.copyOf(array, array.length + 1);

		array[array.length - 1] = tp;
	} 

	Type get(int i) {

		return array[i];

	}

	int size() {
		return array.length;
	}

	Type[] getAll() {
		return Arrays.copyOf(array, array.length);
	}
}