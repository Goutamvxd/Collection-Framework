package list.arraylist;

import java.util.ArrayList;

public class ArrayListForEach {

 public static void main(String[] args) {
	ArrayList<String> days=new ArrayList<String>();
	days.add("Monday");
	days.add("Tuesday");
	days.add("Wednesday");
	days.add("Thrusday");
	days.add("Friday");
	days.add("Saturday");
	days.add("Sunday");
	
	days.forEach(e->action(e));
}

private static void action(String e) {
	System.out.println(e);
}
}
