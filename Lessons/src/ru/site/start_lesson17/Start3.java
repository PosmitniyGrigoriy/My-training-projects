package ru.site.lesson17;

public class Start3 {
	
	static boolean equality(StringBuilder sb1, StringBuilder sb2) {
		boolean result = true; // Здесь должно быть true. Иначе, когда сравнивать объекты как на строках 37 и 38, будет false, если на этой строке будет false.
		if(sb1.length() == sb2.length()) {
			for (int i = 0; i < sb1.length(); i++) {
				if(sb1.charAt(i) == sb2.charAt(i)) {
					result = true;
				} else {
					result = false;
					break;
				}
			}
		} else {
			result = false;
		}
		return result;
	}
	
	public static void main(String[] args) {
		
		StringBuilder sb1 = new StringBuilder("Привет");
		StringBuilder sb2 = new StringBuilder("Привет");
		StringBuilder sb3 = new StringBuilder("Привет2");
		StringBuilder sb4 = new StringBuilder("ПривеТ");
		StringBuilder sb5 = new StringBuilder("ПривеТ");
		
		boolean result = equality(sb1, sb2); // Второй аргумент поменять на 2, 3, 4 sb*, тогда будет разный вывод в сауте.
		System.out.println(result);
		
		// Также можно так сравнивать объекты
		
		System.out.println(equality(sb1, sb3)); // так можно писать
//		System.out.println(equality("Привет", "Привет")); // будет ошибка, так как указывается стринг, а не стринг билдер. так писать нельзя
		System.out.println(equality(new StringBuilder(""), new StringBuilder(""))); // так можно писать
		System.out.println(equality(new StringBuilder(), new StringBuilder())); // так можно писать
		
		
		// Также для сравнения стриг билредеров можно положить их в стринг и уже стринги сравнить
		System.out.println();
		String s1 = new String(sb1);
		String s2 = new String(sb2);
		String s3 = new String(sb3);
		
		System.out.println(s1 == s2);
		System.out.println(s1 == s3);
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		
		
	}
	
}
