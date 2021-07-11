package ru.site.string;

public class Start2 {
	
	public static String stringLine(String a, int b, double c) {
		
		String s = a + " & " + b + " & " + c;
		System.out.println(s);
		return s;
		
	}
	
	public static void main(String[] args) {
		
		stringLine("I go to school", 8, 5.6);
		
	}

}
