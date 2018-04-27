package assignments;

import java.util.ArrayList;
import java.util.List;

public class Array10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List <String> color = new ArrayList<String>(5);
		color.add("Red");
		color.add("Green");
		color.add("Orange");
		color.add("white");
		color.add("black");
		
		List<String>color2 =new ArrayList<String>(5);
		color2.add("red1");
		color2.add("Green1");
		color2.add("orange1");
		color2.add("White1");
		color2.add("Black1");
		
		ArrayList<String> cl= new ArrayList<String>();
		color.addAll(color);
		color2.addAll(color);
		
		for(String temp: cl){
			System.out.println(cl);
		}
		
	}

}
