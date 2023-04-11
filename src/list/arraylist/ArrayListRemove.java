package list.arraylist;

import java.util.ArrayList;

public class ArrayListRemove {

	public static void main(String[] args) {

		ArrayList<String> arrayList = new ArrayList<String>();

		// add method insets value at the end
		arrayList.add("January");
		arrayList.add("February");
		arrayList.add("March");
		arrayList.add("April");
		arrayList.add("May");
		arrayList.add("June");
		arrayList.add("July");
		arrayList.add("August");
		arrayList.add("September");
		arrayList.add("October");
		arrayList.add("November");
		arrayList.add("December");

		// add by index
		arrayList.add(9, "October");

		// remove method removes the first occurrence
		/*
		 * arrayList.remove("October");
		 * System.out.println("size of array is:"+arrayList.size());
		 * 
		 */

		// how to remove all the occurrence of element

		/*// this is for flter method 
		 * arrayList.removeIf(e -> filter(e));
		 */
		
		arrayList.removeIf(e->e.equals("October"));
		// print using toString method
		// System.out.println(arrayList.toString());

		System.out.println(arrayList);

	}
	
	// we can reduce this method simply placing equal condition in removeIf
	/*
	 * private static boolean filter(String e) {
	 * 
	 * return e.equals("October");
	 * 
	 * if (e.equals("October")) return true; return false;
	 * 
	 * }
	 */

}
