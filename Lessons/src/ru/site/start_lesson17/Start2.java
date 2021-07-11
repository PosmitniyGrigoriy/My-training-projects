package ru.site.lesson17;

public class Start2 {
	
	static boolean equality(StringBuilder sb1, StringBuilder sb2) {
				
		boolean result;
		if (sb1 == sb2) { // == или equals
			result = true;
		} else {
			result = false;
		}
		return result;
	}
	
	public static void main(String[] args) {
		
		// v1 - == и equals - false
//		StringBuilder sb1 = new StringBuilder();
//		StringBuilder sb2 = new StringBuilder();
		
		// v2 - == и equals - false
//		StringBuilder sb1 = new StringBuilder("black");
//		StringBuilder sb2 = new StringBuilder("black");

		// v3 - == и equals - true
		StringBuilder sb1 = new StringBuilder("black");
		StringBuilder sb2 = sb1;
		
		// v4 - == и equals - false
//		StringBuilder sb1 = new StringBuilder(50);
//		StringBuilder sb2 = new StringBuilder(50);
		
		boolean a = equality(sb1, sb2);
		System.out.println(a);
	}
	
}
