import java.util.*;

public class BeforeGeneric {

	public static void main(String [] args) {

		var bfc = new BfContainer();
		bfc.add("Hello Everyone!");
		System.out.println(bfc.get(0));
		bfc.add(new Date());
		bfc.add(1000);
		System.out.println(Arrays.toString(bfc.getAll()));

		// Need to Type Casting Correctly Using Object Type
		// We need Generic 
		var problem = (Date) bfc.get(1);


	}
}

class BfContainer {

	private Object [] array = {};

	void add(Object str) {
		array = Arrays.copyOf(array, array.length + 1);

		array[array.length - 1] = str;
	}

	int size() {
		return array.length;
	}

	Object get(int index) {
		return array[index];
	}

	Object [] getAll() {
		return Arrays.copyOf(array, array.length);
	}
}