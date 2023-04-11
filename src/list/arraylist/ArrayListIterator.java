package list.arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Spliterator;

public class ArrayListIterator {

	public static void main(String[] args) {
		
		ArrayList<String> rainbow=new ArrayList<String>();
		rainbow.add("Red");
		rainbow.add("orange");
		rainbow.add("yellow");
		rainbow.add("green");
		rainbow.add("blue");
		rainbow.add("indigo");
		rainbow.add("violet");
		
		Iterator<String> str=rainbow.iterator();
		
		//Iterator provides different methods
		//str.hasNext()
		
		ListIterator<String> listItr=rainbow.listIterator();
		
		//listItr provides different methods
		//listItr.forEachRemaining(null);
		Spliterator<String> spliItr=rainbow.spliterator();
		
		//spliItr provides different methods
		//spliItr.characteristics();
		
		
		//forEach loop
		
		for(String s: rainbow) {
			System.out.println(s);
		}
		
		//System.out.println(rainbow);
		
		
	
	}
}
