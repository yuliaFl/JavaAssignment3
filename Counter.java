/*
 * Yulia Flenova
 * n01342767
 * November 18, 2022
 * Assignment 3
 */
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Counter {
	private ArrayList<String> items;

	public Counter() {
		items = new ArrayList<>();
	}

	public void addItem(String item) {
		items.add(item);		
	}

	public int size() {
		return items.size() - 1;
	}

}
