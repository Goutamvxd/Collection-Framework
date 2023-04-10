package collection.methods;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class ArrayListSort {

	public static void main(String[] args) {
		
		ArrayList<String> aLIst=new ArrayList<String>();
		aLIst.add("Z");
		aLIst.add("A");
		aLIst.add("G");
		aLIst.add("C");

		LinkedList<String> lList=new LinkedList<String>();
		lList.add("Z");
		lList.add("A");
		lList.add("G");
		lList.add("C");

		Collections.sort(aLIst);
		Collections.sort(lList);
		
		System.out.println(aLIst);
		System.out.println(lList);
	}
}
