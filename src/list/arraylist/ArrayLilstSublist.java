package list.arraylist;

import java.util.ArrayList;

public class ArrayLilstSublist {
public static void main(String[] args) {
	
	ArrayList<String> seasons=new ArrayList<String>();
	seasons.add("Winter");
	seasons.add("Spring");
	seasons.add("Summer");
	seasons.add("Monsoon");
	seasons.add("Autumn");
	
	// subList
	
	ArrayList<String> firstTwoSeasons=new ArrayList<>(seasons.subList(0, 1));
	//subList(includeIndx,excludeIndex);
	seasons.removeAll(firstTwoSeasons);
	System.out.println(seasons);
}
}
