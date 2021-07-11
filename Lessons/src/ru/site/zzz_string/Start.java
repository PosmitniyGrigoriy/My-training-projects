package ru.site.string;

public class Start {

	public static void main(String[] args) {
		
		String s1 = "Java", s2 = "School";
		System.out.println(s1 + " и " + s2);
		
		String axiom = s1 + " и " + s2 + " makes life easier";
		System.out.println(axiom);
		
		String rule = 24 + "/7 support";
		System.out.println(rule);
		
		// Первые 2 буквы в слово Java убирает и печатает 3 и 4 буквы
		String sub = s1.substring(2);
		System.out.println(sub);
		
		// Считает сколько букв в слове
		int x = s2.length();
		System.out.println(x);
		
		// Делает слово с больших букв
		String s5 = s1.toUpperCase();
		System.out.println(s5);
		
		// Делает слово с маленьких букв
		String s6 = s1.toLowerCase();
		System.out.println(s6);
		
		// Выводит первый символ
		char c = s1.charAt(0);
		System.out.println(c);
		
		// Первых 20 символов удаляет и дальше печатает текст
		int startIndex = 20;
		String life = axiom.substring(startIndex, startIndex + "life".length() + 1 + "easier".length());
		System.out.println(life);
		
		String replacement = "AaaaBbbbccc";
		int pos1 = replacement.indexOf("bb"); // Находит
		System.out.println(pos1); // Считает сколько символов есть до bb.
		
		int pos2 = replacement.indexOf("aaf"); // Не находит и выводит -1, операция заканчивается
		System.out.println(pos2);
		
		int lifePos = axiom.indexOf("life", 0);
		System.out.println(lifePos); // Выводит сколько символов есть до слова life
		
		String replacement2 = "AaaaBbbbccc".replace("aaa", "---"); // Ищет буквы ааа и заменяет их на ---.
		System.out.println(replacement2);
		
		boolean b1 = "Java".equals(s1);
		System.out.println(b1); // Выводит тру. Два слова одинаковые.
		
		boolean b2 = s1.equals(s2);
		System.out.println(b2); // выводит фолс. 2 разных слова для сравнения.
		
		boolean b3 = "jAvA".equalsIgnoreCase(s1);
		System.out.println(b3); // Выводит тру. Игнорирует большие и маленкие буквы.
		
	}

}
