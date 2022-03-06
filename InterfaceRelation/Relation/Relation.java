public class Relation {

	public static void main(String [] args) {

		// Yes you can Pollymorphic and encapsulation

		Parent p = Child.childStatic();
		
		p.doParent();

	}
}

interface Parent {

	public static Parent parentStatic() {
		return new Parent(){ 
			public void doParent(){ System.out.print("Hello");}
		};
	}

	void doParent();
}

interface Child extends Parent {

	public static Child childStatic() {
		return new Child(){
			public void doChild(){}
			public void doParent(){ System.out.println("Hi");}
		};
	}

	void doChild();
}
