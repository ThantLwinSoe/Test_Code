class TestVariable {

	int i = 10;
	static a = 10;

	public static void main(String [] args) {

		int j =20;

		// This will be compile Time Error
		// static variable cannot be referenced static method
		System.out.println(i+j);

		// This will be run 
		System.out.println(a+j);
	}
}