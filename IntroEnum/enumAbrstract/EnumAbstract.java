public class EnumAbstract {

	public static void main(String [] args) {

		for (Days d : Days.values()) {
			d.doSomething();
		}

	}
}

enum Days {
	SUN("SUNDAY"){
		public void doSomething() {
			System.out.println("Hello This is " + SUN.viewName);
		}
	},
	MON("MONDAY"){
		public void doSomething() {
			System.out.println("Hello This is " + MON.viewName);
		}
	},
	TUE("TUESDAY"){
		public void doSomething() {
			System.out.println("Hello This is " + TUE.viewName);
		}
	},
	WED("WEDNESDAY"){
		public void doSomething() {
			System.out.println("Hello This is " + WED.viewName);
		}
	},
	THU("THURSDAY"){
		public void doSomething() {
			System.out.println("Hello This is " + THU.viewName);
		}
	},
	FRI("FRIDAY"){
		public void doSomething() {
			System.out.println("Hello This is " + FRI.viewName);
		}
	},
	SAT("SATURDAY"){
		public void doSomething() {
			System.out.println("Hello This is " + SAT.viewName);
		}
	};

	private String viewName;

	Days(String viewName) {
		this.viewName = viewName;
	}

public abstract void doSomething();




}