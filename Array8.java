package assignments;
import java.util.Collections;
import java.util.ArrayList;
import java.util.List;

public class Array8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List <String> color = new ArrayList<String>(5);
		color.add("Red");
		color.add("Green");
		color.add("Orange");
		color.add("white");
		color.add("black");
		
		List<String>color2 =new ArrayList<String>(5);
		color2.add("red");
		color2.add("Green");
		color2.add("orange");
		color2.add("White");
		color2.add("Black");
		System.out.println("Before copy" + color);
		Collections.copy(color,color2);
		System.out.println("After copy" + color2);
	}

}
