package list;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListSort {

	public static void main(String[] args) {
		ArrayList<String> planets=new ArrayList<String>();
		planets.add("Mars");
		planets.add("Venus");
		planets.add("Earth");
		planets.add("Mercury");
		planets.add("Jupiter");
		planets.add("Saturn");
		planets.add("Uranus");
		planets.add("Neptone");
		
		// to insert into a specific index
		//planets.add(3,"Earth");
		
		// sorting by compare
		
		
	/*	planets.sort((s1,s2)-> compare(s1,s2));
		System.out.println(planets);
	}

	private static int compare(String s1, String s2) {
		return s2.compareTo(s1);
	}*/
		
		// Collections.sort method
		// by default in ascending order
		
		
		Collections.sort(planets);
		System.out.println(planets);
}
}