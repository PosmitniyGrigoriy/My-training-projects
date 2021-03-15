// ”рок от Java Blogger 007

package ru.site.format;

public class Start {

	public static void main(String[] args) {
		
		String text = "Ёто значени€: ";
		int a = 3;
		int b = 4;
		
		System.out.println(text + a + " и " + b);
		System.out.printf("%s%d и %d", text, a, b);
		
		// важно: выше используеьс€ printf. Ёто дл€ форматировани€. ≈сли обычный саут. там принтлн, выводит каждую новую строку с новой строки. ѕросто принт выводит на одной строке. Ќужно дополнительно раздел€ть \n, чтобы с новой строки выводилась строка
		
	}

}
