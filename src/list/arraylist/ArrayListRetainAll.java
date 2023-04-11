package list.arraylist;

import java.util.ArrayList;

public class ArrayListRetainAll {

	public static void main(String[] args) {

		ArrayList<String> bags = new ArrayList<>();
		bags.add("pen");
		bags.add("pencil");
		bags.add("paper");
		bags.add("Photo");

		ArrayList<String> boxes = new ArrayList<>();
		boxes.add("pen");
		boxes.add("TV");
		boxes.add("books");
		boxes.add("rubber");
		boxes.add("Photo");

		//retainALl on boxes
		
		
		  boxes.retainAll(bags);
		  System.out.println("After retailAll:" + boxes);
		 
		
		//retainALl on bags
		
		bags.retainAll(boxes);
		System.out.println("After retailAll:"+ bags);
	}
}
