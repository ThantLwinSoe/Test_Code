final class A {

}

// This will be Compile Time Error 
// Cannot inheritance Final Class
class B extends A {

	final void test() {
		System.out.println("Yes or not");
	}
}