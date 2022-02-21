import java.util.*;

public class SingletonDemo {

	public static void main(String [] args) {

		var bv = new BookViewer();
		bv.view();

	}
}

class BookViewer {

	public void view() {
		var bv = BookStore.getter();
		bv.add("Hello");
		bv.show();
	}
}


class BookStore {

    public String [] bArray = {};
	private static BookStore bk;

	private BookStore() {}

	public static  BookStore getter() {

		if(bk == null) {
			bk = new BookStore();
		}

		return bk;
	}

	public void add(String book) {

		bArray = Arrays.copyOf(bArray, bArray.length + 1);
		bArray[bArray.length - 1] = book;
	}

	public void show() {
		for(String b : bArray) {

			System.out.println(b);

		}
	}
}