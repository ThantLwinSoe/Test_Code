public class GenericMethod {

	public static void main(String [] args) {

		// it is not object
		// it return Object
		// Just method
		var obj = doJob("HEllo", 1000);
		obj.show();

	}

	public static <K extends CharSequence, V extends Number> Container<K,V> doJob(K key, V value) {
		return new Container<K,V>(key,value);
	}
}

class Container<K,V> {

	private K key;
	private V value;

	Container(K key, V value) {
		this.key = key;
		this.value = value;
	}

	void show() {
		System.out.println("Key: " + key);
		System.out.println("Value: " + value);
	}
}

