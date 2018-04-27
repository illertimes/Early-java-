package assignments;
//Write a method to sort your ArrayList from A-Z
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Array6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List <String> color = new ArrayList<String>(5);
		color.add("Red");
		color.add("Green");
		color.add("Orange");
		color.add("white");
		color.add("black");
		
		System.out.println("Before Sorting:");
		for(String counter: color){
			System.out.println(counter);
		}
		Collections.sort(color);
		System.out.println("After sorting:");
		for(String counter:color){
			System.out.println(counter);
		}
	}

}
