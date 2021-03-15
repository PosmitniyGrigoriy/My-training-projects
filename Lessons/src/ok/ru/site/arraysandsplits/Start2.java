// ”рок от Sergey Nemchinsky Java Start

package ok.ru.site.arraysandsplits;

public class Start2 {

	public static void main(String[] args) {
		
		String text = "1, 3, 5, 7, 9, 11, 13, apple, telephone";
		String[] words = text.split (", ");
		
		System.out.println(words.length + " | " + text + "\n");
		
		for (int i = 0; i < words.length; i++) {
		char[] numbers = words[i].toCharArray();
		System.out.println(numbers.length + " | " + words[i]);
		
		}
	}
}