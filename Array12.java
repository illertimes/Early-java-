package assignments;
import java.util.ArrayList;
import java.util.*;

public class Array12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String color[]={"red", "orange","green", "white", "black"};
		//Array to ArrayList
		ArrayList<String>color2 = new ArrayList<String>(Arrays.asList(color));
	
		for(String str:color){
			System.out.println(str);
		}
	}

}
