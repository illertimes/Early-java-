package assignments;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.HashSet;
public class Array5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> array= Arrays.asList{"red", "orange","green", "white", "black"};
		if (array.contains(3)){
			System.out.println("Element found in array" + "ArrayList contains() method");
			
	};
	Set<String>arraySet = new HashSet<String>(array);
	
	}

}
