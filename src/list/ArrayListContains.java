package list;

import java.util.ArrayList;

public class ArrayListContains {

	public static void main(String[] args) {
		
		ArrayList<String> laptops=new ArrayList<String>();
		laptops.add("Apple");
		laptops.add("HP");
		laptops.add("Dell");
		laptops.add("Asus");
		laptops.add("Lenovo");
		laptops.add("Acer");
		
		boolean exits=laptops.contains("Dell");
		
		if(exits)
			System.out.println("Dell Exists:");
		else
			System.out.println("Dell Not Exists:");
		System.out.println(laptops);
	}
}
