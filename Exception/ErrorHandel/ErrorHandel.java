public class ErrrorHandel {

	public static void main(String [] args) {

		try {
			makeError(0);
		} catch(Exception e) {
			System.out.println("Exception Handel in main.");
		} catch(StackOverflowError e) {
			System.out.println("StackOverflowError Handel in main.");
		} catch(Error e) {
			System.out.println("Error Handel in main.");
		}
		
		System.out.println("Yes end Progaram.");
	}

	static void makeError(int count) {

		System.out.println("Count is " + (count ++));

		makeError(count);
	}

}