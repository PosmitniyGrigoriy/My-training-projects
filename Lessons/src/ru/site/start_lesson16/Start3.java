package ru.site.lesson16;

public class Start3 {

	public static void main(String[] args) {
		
		// v1 - как можно оформить программу, чтобы был вывод в нужном формате
		
//		Потонула деревня в ухабинах,
//		Заслонили избенки леса.
//		Только видно на кочках и впадинах,
//		Как синеют кругом небеса.
		
		String s1 = "Потонула деревня в ухабинах, Заслонили избенки леса. Только видно на кочках и впадинах, Как синеют кругом небеса.";
//		System.out.println("Шаг 1: " + s1);
		
		String s2 = s1.toUpperCase();
//		System.out.println("\nШаг 2: " + s2);
		
//		System.out.println("\nШаг 3: " + s2.length() + " длина");
		
		char c1;
		char c2;
		
		for (int i = 0; i < s1.length(); i++) {
			
			c1 = s1.charAt(i);
			c2 = s2.charAt(i);
			
			if (c1 != ',' && c1 != '.' && c1 != ' ' && c1 == c2) {
				System.out.println();
				System.out.print(c1);
				continue;
			}
			System.out.print(c1);
		}
		
		
		
		
		
		
		System.out.println();
		
		
		// v2 - как можно оформить программу, чтобы был вывод в нужном формате
		
//		Я памятник себе воздвиг нерукотворный,
//		К нему не зарастет народная тропа;
//		Вознесся выше он главою непокорной - 
//		Александрийского столпа.
		
		String text = "Я памятник себе воздвиг нерукотворный, К нему не зарастет народная тропа; Вознесся выше он главою непокорной - Александрийского столпа.";

		String text2 = text.toUpperCase();
		
		char a = ',';
		char b = ';';
		char c = '-';
		char d = ' ';
		char e = '.';
		
//		System.out.println(text);
//		System.out.println(text2);
		
		for(int i = 0; i < text.length(); i++) {
			if(text.charAt(i) == text2.charAt(i)) {
				if(text.charAt(i) != a && text.charAt(i) != b && text.charAt(i) != c && text.charAt(i) != d && text.charAt(i) != e) {
					System.out.println();
					System.out.print(text.charAt(i)); // Первую букву большую выводит
					continue;
//					continue;System.out.println();
				}
			}
			System.out.print(text.charAt(i));
		}
		
		
		
		
		
		
		
		System.out.println();
		
		
		// v3 - как можно оформить программу, чтобы был вывод в нужном формате
		
//		Я памятник себе воздвиг нерукотворный,
//		К нему не зарастет народная тропа;
//		Вознесся выше он главою непокорной - 
//		Александрийского столпа.
		
		String text10 = "Я памятник себе воздвиг нерукотворный, К нему не зарастет народная тропа; Вознесся выше он главою непокорной - Александрийского столпа.";
		String text20 = text10.toLowerCase();
		
		for(int i = 0; i < text10.length(); i++) {
			if(text.charAt(i) != text20.charAt(i)) {
				System.out.println();
				System.out.print(text10.charAt(i)); // Первую букву большую выводит
				continue;
			}
			System.out.print(text10.charAt(i));
		}
		
		
		
		
		
		
		
	}

}
