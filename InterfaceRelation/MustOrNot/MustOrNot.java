public class MustOrNot implements Hello {

	public static void main(String [] args) {

		String ok = new MustOrNot().hello("Thant Lwin Soe");
		System.out.println(ok);

	}

	public String hello(String name) {

		return name;
	}

}

interface Hello {

	String hello(String name);
}