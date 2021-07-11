package ru.site.lesson18;

public class Start3 {

	static String showArray(String a, String b, String c) {
		String result = "{ {" + a + "}, {" + b + "}, {" + c + "} }";
		return result;
	}
	
	public static void main(String[] args) {
		
		String result = showArray("элемент00, элемент01", "элемент10", "элемент20, элемент21");
		System.out.println(result);
	}

}
