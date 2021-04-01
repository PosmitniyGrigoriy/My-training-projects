// ”рок от Sergey Nemchinsky Java Start

package ru.site.arraysandsplits;

public class Start1 {

	public static void main(String[] args) {
		
		String text = "I am going to market to sell here";
		String[] words = text.split (" ");
		
		System.out.println(words.length + " | " + text + "\n");
		
		for (int i = 0; i < words.length; i++) {
		char[] numbers = words[i].toCharArray();
		System.out.println(numbers.length + " | " + words[i]);
		
		}
	}
}