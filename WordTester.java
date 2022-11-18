/*
 * Yulia Flenova
 * n01342767
 * November 18, 2022
 * Assignment 3
 */
import java.util.ArrayList;
import java.util.Scanner;

public class WordTester {
	public WordTester() {
		Scanner scanner = new Scanner(System.in);

		Counter count = new Counter();
		WordMap wMap = new WordMap();
		String word;
		System.out.println("Enter the words to be counted");

		do {
			word = scanner.nextLine().toLowerCase();
			if (word.equals("end"))
				break;

			count.addItem(word);
			wMap.put(word);
			// save into hash

		} while (!word.equals("end"));
		System.out.println("Total Words are: " + count.size());
		System.out.println("Unique words are: " + wMap.Count());
		wMap.Print();
	}

	public static void main(String[] args) {
		new WordTester();
	}
}
