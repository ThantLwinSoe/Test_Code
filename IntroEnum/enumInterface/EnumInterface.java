public class EnumInterface {

	public static void main(String [] args) {

		for (Days d : Days.values()) {
			d.doSomething();
		}

	}
}

interface Something {

	void doSomething();
}

enum Days implements Something{

	SUN("SUNDAY"){
		public void doSomething(){
			System.out.println("Yes Super " + SUN.viewName);
		}
	},MON("MONDAY"),TUE("TUESDAY"),WED("WEDNESDAY"),THU("THURSDAY"),FRI("FRIDAY"),SAT("SATURDAY");

	private String viewName;

	Days (String viewName) {
		this.viewName = viewName;
	}

	public void doSomething() {

		System.out.println("Today is " + viewName);
	}

}