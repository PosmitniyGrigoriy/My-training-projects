package ru.site.lesson17;

public class Start {

	public static void main(String[] args) {
		
		// Какие бывают конструкторы у String
		String s1 = new String();
		String s2 = new String("123 asd");
//		String s3 = new String(50); // Просто указать число нельзя. Будет ошибка. Нужно использовать StringBilder.
		
		System.out.println(s1);
		System.out.println(s2);
		
		// Какие бывают конструкторы у StringBuilder:
		StringBuilder sb1 = new StringBuilder(); // Создан пустой StringBuilder, потом в него можно положить текст
		StringBuilder sb2 = new StringBuilder("Привет"); // Присваивается текст
		StringBuilder sb3 = new StringBuilder(50); // Указывается вместимость, а не присваивается значение инт
		StringBuilder sb4 = new StringBuilder(sb2); // Выводится значение sb2

		
		// Можно положить в стринг StringBuilder
		StringBuilder sb30 = new StringBuilder("Огурец");
		String s100 = new String(sb30);
		System.out.println(s100);
		
		
		StringBuilder sb10 = new StringBuilder("123");
		System.out.println(sb10);
		StringBuilder sb20 = sb10.append("45");
		sb20 = sb20.append("6").append("7");
		System.out.println(sb10);
		System.out.println(sb20);
		
	}

}
