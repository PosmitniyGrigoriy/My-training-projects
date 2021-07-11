package ru.site.lesson16;

public class Start2 {
		
		// Что значит этот код - можно посмотреть в ворде в уроке 16
		
		String text;
		
		Start2(String text) {
			this.text = text;
			System.out.println(text);
		}
		
		public static void main(String[] args) {
			
			for (int i = 0; i < 5; i++) {
				Start2 start = new Start2("Текст");
				System.out.println(start);
			}
			
			System.out.println();
			
			for (int i = 0; i < 5; i++) {
				String text2 = "Текст";
				String text3 = "Текст";
				System.out.println(text2);
				System.out.println(text2==text3);
			}
		
	}

}
