package list.arraylist;

import java.util.ArrayList;

public class ArrayListReplaceAll {

	public static void main(String[] args) {
		ArrayList<String> continents=new ArrayList<String>();
		continents.add("Asia");
		continents.add("Africa");
		continents.add("Europe");
		continents.add("North America");
		continents.add("South America");
		continents.add("Australia");
		continents.add("Antarctic");
		
		// replaceALl method
		
		continents.replaceAll(e->replaceData(e));
	
		System.out.println(continents);
		
		
	}

	private static String replaceData(String e) {
		return e.substring(0,3);
	}
}
