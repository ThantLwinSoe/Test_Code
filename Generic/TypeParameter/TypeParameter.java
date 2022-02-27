public class TypeParameter {

	public static void main(String [] args) {

		// Build Generic Type Object 
		
		// java 5 -7 
		Pair<String, Integer> obj = new Pair<String, Integer> ();

		// java 7- 9
		Pair<String, Integer> obj2 = new Pair<>();

		// java 10
		var obj3 = new Pair<String, Integer>();

		// GenericInheritance 
		// WayOne is a concreate Class, he extends Generic Class
		WayOne wo = new WayOne();

		// WayTwo is a Generic Class

		WayTwo<String, Integer> wt = new WayTwo<>();



	}
}

class Pair<K,V> {

	private K key;
	private V value;

	public void setKey(K key) {
		this.key = key;
	}

	public void setValue(V value) {
		this.value = value;
	}

	public K getKey() {
		return this.key;
	}

	public V getValue() {
		return this.value;
	}

}

class WayOne extends Pair<String, Integer> {

}

class WayTwo<K,V> extends Pair<K,V> {

}