package list.arraylist;

import java.util.ArrayList;

public class ArrayListIsEmpty {

	public static void main(String[] args) {
		
		ArrayList<String> searchEngine=new ArrayList<>();
		searchEngine.add("Google");
		searchEngine.add("Bing");
		searchEngine.add("Yahoo");
		searchEngine.add("Yandex");
		searchEngine.add("DuckDuckGo");
		searchEngine.add("Baidu");
		searchEngine.add(" Ask.com");
		searchEngine.add("Naver");
		
		if(!searchEngine.isEmpty()) {
			searchEngine.clear();
			System.out.println("ArrayList size:"+searchEngine.size());
		}
	}
}
