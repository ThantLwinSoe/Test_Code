import java.util.Arrays;

public class PrepairEncap {

	private String [] array ={};

	public boolean add(String data) {

		array =  Arrays.copyOf( array, array.length + 1 );
		array[array.length - 1] = data;

		return true;
	}
	public void show() {

		for(String array : array){

			System.out.println(array);
		}
	}
	public String[] getAll(){

		PrepairEncap ou = new PrepairEncap();
		
		return ou.get();
	}
	private String [] get() {    // also use public modifier same encap


		return array;
	}

}