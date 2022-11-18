/*
 * Yulia Flenova
 * n01342767
 * November 18, 2022
 * Assignment 3
 */
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class WordMap {
	HashMap<String, Integer> wMap;
	
	public WordMap() {
		wMap = new HashMap<>();
	}
	
	public void put(String word) {
		if(wMap.containsKey(word)) {
			Integer c = wMap.get(word);
			wMap.put(word, c + 1);
		}
		else 
			wMap.put(word, 1);
	}
	
	public int Count() {
		return wMap.keySet().size();
	}
	
	public void Print() {
		Set keySet = wMap.keySet();
		Iterator mapItem = keySet.iterator();
		
		System.out.println("#####Word count#####");

		while (mapItem.hasNext()) {
			String word = (String) mapItem.next();
			Integer i = wMap.get(word);
			System.out.println("key: "+ word+  " "+ i.toString());
		}
		
	}
}
