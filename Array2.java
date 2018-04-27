package assignments;
//Write a Java method to iterate through all elements in the previous ArrayList.

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
public class Array2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[]arrayList={"red", "orange","green", "white", "black"};
		int numberOfitems = arrayList.length;
		for(int i=0; i < numberOfitems; i++){
			String name = arrayList[i];
			System.out.println("Today's color is "+ name);
		}

	}

}
