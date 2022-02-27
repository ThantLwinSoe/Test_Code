public class TypeBounded {

	public static void main(String [] args) {

		// Number and his SubClass can invote at the Type like a Integer,Long,Float ...

		Container<Integer> obj = new Container<>(); 
		Container<Float> obj = new Container<>();
		Container<Number> obj = new Container<>();

	}
}

class Container <Type extends Number> {

	private Type value;

	void setValue(Type value) {
		this.value = value;
	}

	Type getValue() {
		return this.value;
	}

}