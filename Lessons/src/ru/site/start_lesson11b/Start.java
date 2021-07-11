package ru.site.lesson11b;

public class Start {

	static String text1 = "text1";
	static String text2 = "text2";
	
	static void swap() {
		String text3 = text1;
		text1 = text2;
		text2 = text3;
		System.out.println(text1);
		System.out.println(text2);
	}
	
	public static void main(String[] args) {
		
		System.out.println(text1);
		System.out.println(text2);
		
		System.out.println();
		
		swap();
		
	}

}
