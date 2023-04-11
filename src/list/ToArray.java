package list;

import java.util.ArrayList;

public class ToArray {

	public static void main(String[] args) {
		
		ArrayList<String> iplCaptains=new ArrayList<>();
		iplCaptains.add("MS Dhoni");
		iplCaptains.add("David Warner");
		iplCaptains.add("Hardik Pandya");
		iplCaptains.add("Shreyas Iyer");
		iplCaptains.add("KL Rahul");
		iplCaptains.add("Rohit Sharma");
		iplCaptains.add("Shikhar Dhawan");
		iplCaptains.add("Sanju Samson");
		iplCaptains.add("Faf du Plessis");
		iplCaptains.add("Bhuvneshwar Kumar");
		
		// toArray 1
		
		
		  Object[] arr=iplCaptains.toArray(); for(Object s:arr) {
		  System.out.println(s); }
		 
		
		//toArray 2
		String[] strArr=new String[iplCaptains.size()];
		strArr=iplCaptains.toArray(strArr);
		for(String s:strArr) {
			System.out.println(s);
		}
		
		
	}
}
