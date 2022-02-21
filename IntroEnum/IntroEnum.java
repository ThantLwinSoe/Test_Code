public class IntroEnum {


	public static void main(String [] args) {

		callEnum(Days.WED);
		callEnum(Days.MON);
		callEnum(Days.SUN);

	}

	public static void callEnum(Days day) {

		System.out.println(day);
	}

}

enum Days {
	MON,TUE,WED,THUR,FRI,SAT,SUN;
}