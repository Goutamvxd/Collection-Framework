package generic;

import java.util.ArrayList;

public class ListDemo {

	public static void main(String[] args) {
		/*
		 * when Object type is passed as parameter into ArrayList
		 * it will allow to add different data type as objects
		 * 
		 * 
		 * ArrayList<Object> arrayList=new ArrayList<Object>(); arrayList.add("Hello");
		 * arrayList.add(10); arrayList.add('f'); arrayList.add(8860.8878);
		 * 
		 * for(Object s:arrayList) { System.out.println(s); }
		 */
	
	// What if WE Pass specific type as object
		
		ArrayList<String> arrayList=new ArrayList<String>();
		arrayList.add(10);
		arrayList.add("Goutam");
		arrayList.add('F');
		arrayList.add(8667.89);
		
		for(String s:arrayList) { System.out.println(s); 
		}
		
	// primitive Type are not allowed
		ArrayList<int> arrayList=new ArrayList<int>();
		
	// Wrapper classes are allowed
		
		ArrayList<Integer> arrayList=new ArrayList<Integer>();
	}
}
