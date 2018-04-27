package assignments;
//Write a method to reverse your ArrayList
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Array7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List <String> color = new ArrayList<String>(5);
		color.add("Red");
		color.add("Green");
		color.add("Orange");
		color.add("white");
		color.add("black");
		
		System.out.println("Before Reverse");
		System.out.println(color);
		Collections.reverse(color);
		System.out.println("After Reverse");
		System.out.println(color);
	}

}
