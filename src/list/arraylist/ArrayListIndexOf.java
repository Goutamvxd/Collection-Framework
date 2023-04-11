package list.arraylist;

import java.util.ArrayList;

public class ArrayListIndexOf {

	public static void main(String[] args) {
		ArrayList<String> iplTeams=new ArrayList<String>();
		iplTeams.add("Lucknow Super Giants");
		iplTeams.add("Rajasthan Royals");
		iplTeams.add("Kolkata Knight Riders");
		iplTeams.add("Gujarat Titans");
		iplTeams.add("Chennai Super Kings");
		iplTeams.add("Punjab Kings");
		iplTeams.add("Royal Challengers Bangalore");
		iplTeams.add("Sunrisers Hyderabad");
		iplTeams.add("Mumbai Indians");
		iplTeams.add("Delhi Capitals");
		
		// added duplicate element
		iplTeams.add("Chennai Super Kings");
		
		// find the index of specific element
		int pos=iplTeams.indexOf("Chennai Super Kings");
		System.out.println(pos);
// index counts starts from 0
		
		
		// if have duplicate  element the finding first and last index
		// first index can be found using indexOf method
		
		int lastIndex=iplTeams.lastIndexOf("Chennai Super Kings");
		System.out.println(lastIndex);

	}
}
