public class SwitchTest {

	static final int zero = 0 ;

	public static void main(String [] args) {

		
		//doByte(0);

		//doSwitch(6);

		doNewSwitch(11);
	}

	static void doByte(int value) {

		switch(value) {

			case zero:
				System.out.println("0");
				break;
			case 1:
				System.out.println("1");
			case 2:
				System.out.println("2");
			case 3:
				System.out.println("3");
				break;
			default:
				System.out.println("Default");
				break;
		}
	}


	static void doSwitch(int value) {

		switch(value) {

			case 0,1,2,3 -> System.out.println("0 1 2 3");
			case 4,5,6,7 -> System.out.println("4 5 6 7");
			default -> System.out.println("Default");

		}


	}


	static void doNewSwitch(int value) {

		String show = switch(value) {

			case 0,1 -> {

				System.out.println("There is "+ value);
				yield "Con Con";
			}
			case 2 -> "Two";
			default -> "Others";

		};


		int showInt = switch(value) {

			case 12,11 -> {

				System.out.println( value);
				yield 12;
			}
			case 2 -> 2;
			default -> 3;

		};

		//System.out.println(show);
		System.out.println(showInt);

	}
}