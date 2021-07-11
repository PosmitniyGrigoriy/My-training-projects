package ru.site.lesson17;

public class Start4 {

	public static void main(String[] args) {
		
		StringBuilder sb1 = new StringBuilder("Привет");
		StringBuilder sb2 = new StringBuilder("Привет");
		StringBuilder sb3 = sb1;
		System.out.println(sb1);
		sb1.append(", друг");
		System.out.println(sb1);
		
		System.out.println(sb1==sb2);
		System.out.println(sb1.equals(sb2));
		System.out.println(sb1.equals(sb3));
		
		System.out.println();
		
		StringBuilder sb5 = new StringBuilder("Помидор");
		System.out.println(sb5);
		sb5.insert(2, "ЗЗЗ");
		System.out.println(sb5);
		sb5.delete(2, 5);
		System.out.println(sb5);
		sb5.deleteCharAt(2);
		System.out.println(sb5);
		sb5.reverse();
		System.out.println(sb5);
		char v = sb5.charAt(0);
		System.out.println(v);
		int b = sb5.append("друг").capacity();
		System.out.println(b);
		int a = sb5.capacity();
		System.out.println(a);
		System.out.println(sb5);
		sb5.replace(0, 3, "ОРЗ");
		System.out.println(sb5);
		
		StringBuilder sb200 = new StringBuilder("Очки");
		sb200.append("безопасность человека");
		int c = sb200.capacity();
		System.out.println(c);
		
		
	}

}
