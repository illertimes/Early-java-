package assignments;
/* Comparing Write a method that will compare two ArrayLists, 
printing out which elements they have in common. */
import java.util.ArrayList;
import java.util.List;

public class Array9 {

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
		
		ArrayList<String>color3 = new ArrayList<String>();
			for(String temp:color)
				color3.add(color2.contains(temp)? "Yes" : "No");
			System.out.println(color3);
	}

}
