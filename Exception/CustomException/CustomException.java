public class CustomException {

	public static void main(String [] args) {

	}

	static void highestLevelComponent(){

		try {
			middleWareComponent();
		} catch(MyException e) {
			e.getMessage();
		} catch (RuntimeException e) {
			System.out.println("Exception Handel.");
		} catch (Exception e) {
			System.out.println("Exception Handel.");
		}
	

	}

	static void middleWareComponent() {

		try {
			lowestLevelComponent();
		} catch(Exception e) {
			System.out.println("Exception Handel");
			throw new MyException("This is CustomException.");
		}
		
		

	}

	static void lowestLevelComponent() throws Exception {

		System.out.println("Hello.");

		

	}
}

class MyException extends RuntimeException {

	private String message;

	MyException(message) {
		super(message);
	}

	String getMessage() {
		return this.message;
	}
}