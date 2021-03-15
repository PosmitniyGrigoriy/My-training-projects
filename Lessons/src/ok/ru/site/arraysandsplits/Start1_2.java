// Урок от Sergey Nemchinsky Java Start

package ok.ru.site.arraysandsplits;

import java.util.ArrayList;
import java.util.List;

public class Start1_2 {

	public static void main(String[] args) {

		String text = "I am going to market to sell here";
		String[] words = text.split(" ");

		System.out.println(words.length + " | " + text + "\n");
		
		List<String> words2 = new ArrayList<>();
		
		for (int i = 0; i < words.length; i++) {
			char[] numbers = words[i].toCharArray();
			System.out.println(numbers.length + " | " + words[i]);
			words2.add(words[i]);
		}

		
		
		System.out.println("\n"+ "Коллекция: " + words2);
		System.out.println();

		

//		String[] mass = new String[] { "1", "2", "3", "4" };
//		List m = Arrays.asList(mass);
//		mass[1] = "5";
//		System.out.println(m);

		
		
	}




}