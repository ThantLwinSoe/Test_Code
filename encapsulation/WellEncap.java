import java.util.Arrays;

public class WellEncap {

	public static void main(String [] args) {

		PrepairEncap pe = new PrepairEncap ();
		pe.add("TLS");
		pe.add("NyiLay");
		pe.add("MaMa");
		pe.show();
		String [] array = pe.getAll();
		Arrays.fill(array , null);

		pe.show();
}
}