public class NestedDemo {

	static{
		class Hello {
			void show() {
				System.out.println("Hello Local Class.");
			}
		}
		
		Hello obj = new Hello();   // Yes Run Here Local Class
		obj.show();
		
	}

	public static void main(String [] args) {

	/*	Outer.staticMessage();  // it is work

		Outer obj = new Outer();  // it is work
		obj.doSomething();  // it is work
	*/

		// call StaticClass from outside
	/*	Outer.InnerStatic obj = new Outer.InnerStatic();   // it is work.
		obj.doSomething();									// it is work. 
	*/

		// call Non Static Class (Instance Class) from Outside
	/*	Outer obj = new Outer();						// it is work.
		Outer.Inner innerObj = obj.new Inner();			// it is work.
		innerObj.doSomething();
	*/

		// way 2
	/*	Outer.Inner oi= new Outer().new Inner();
		oi.doSomething();
	*/
		
		// cannot run local class in the main method
		//Hello obj = new Hello();
		//obj.show();
	}
	

}