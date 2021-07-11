package ru.site.transformation;

public class Start {

	public static void main(String[] args) {
		
		// Преобразование числа в строку
		
		String intString = Integer.toString(111);
		System.out.println(intString);
		System.out.println("----------");
		
		String byteMinString = Byte.toString(Byte.MIN_VALUE);
		String byteMaxString = Byte.toString(Byte.MAX_VALUE);
		
		String shortMinString = Short.toString(Short.MIN_VALUE);
		String shortMaxString = Short.toString(Short.MAX_VALUE);
		
		// char = character
		String characterMinString = Character.toString(Character.MIN_VALUE);
		String characterMaxString = Character.toString(Character.MAX_VALUE);
		
		String intMinString = Integer.toString(Integer.MIN_VALUE);
		String intMaxString = Integer.toString(Integer.MAX_VALUE);
		
		String longMinString = Long.toString(Long.MIN_VALUE);
		String longMaxString = Long.toString(Long.MAX_VALUE);
		
		String floatMinString = Float.toString(Float.MIN_VALUE);
		String floatMaxString = Float.toString(Float.MAX_VALUE);
		
		String doubleMinString = Double.toString(Double.MIN_VALUE);
		String doubleMaxString = Double.toString(Double.MAX_VALUE);
		
		String booleanMinString = Boolean.toString(Boolean.TRUE);
		String booleanMaxString = Boolean.toString(Boolean.FALSE);
		
		System.out.println("Byte: " + byteMinString  + " и " + byteMaxString);
		System.out.println("Short: " + shortMinString  + " и " + shortMaxString);
		System.out.println("Character: " + characterMinString  + " и " + characterMaxString);
		System.out.println("Integer: " + intMinString  + " и " + intMaxString);
		System.out.println("Long: " + longMinString  + " и " + longMaxString);
		System.out.println("----------");
		System.out.println("Float: " + floatMinString  + " и " + floatMaxString);
		System.out.println("Double: " + doubleMinString  + " и " + doubleMaxString);
		System.out.println("----------");
		System.out.println("Boolean: " + booleanMinString  + " и " + booleanMaxString);
		System.out.println("----------");
		
		// Преобразование строки в число
		
		int a = Integer.parseInt("123");
		long b = Long.parseLong(longMinString);
		System.out.println(a);
		System.out.println(b);
		
	}

}
