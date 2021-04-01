// ”рок от Sergey Nemchinsky Java Start

package ru.site.arraysandsplits;

public class Start5 {

	public static void main(String[] args) {

		String text = "1, 3, 7, 5, 9, 11, 13, apple, telephone";
		String[] words = text.split(", ");

		System.out.println(words.length + " | " + text + "\n");

		for (int i = 0; i < words.length; i++) {
			if (i == 2)
				break;
			System.out.println(i + " | " + words[i]);
		}
		
		System.out.println("");
		System.out.println(words[0]);
		System.out.println(words[1]);
		System.out.println(words[2]);
		
		System.out.println(words[0] + " | " + words[1] + " | " + words[2] + " | " + words[6]);

		
	}
}