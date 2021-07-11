package ru.site.lesson16;

public class Start5 {
	
	public void emeil(String s) {
		
		int a = 0; // Позиция символа @
		int b = 0; // Позиция символа .
		int c = 0; // Позиция символа ;
		
		while(c < s.length() - 1) {
			a = s.indexOf('@', c);
			b = s.indexOf('.', c);
			c = s.indexOf(';', c + 1);
			System.out.println(s.substring(a + 1, b));
		}
		
	}
	
	public static void main(String[] args) {
		
		Start5 s5 = new Start5();
		s5.emeil("ya@yahoo.com;     on@mail.ru;         ona@gmail.com;");

	}
	
}
