package ru.site.lesson21;

public class Start {

	public static void main(String[] args) {
		
		System.out.println((3 < 4 ? 10 : "Привет")); // Так писать можно
		
		
		Object b = (3 < 4 ? 10 : "Привет"); // Так писать можно
		System.out.println(b); // Так писать можно
		// Но если вместо Object будет int, или String, то будет ошибка, так как в ternary operation two data type
		
		
		int c = 5;
		int d = 5;
		int e = (c > 6) ? c++ : d++;
		System.out.println("c = " + c);
		System.out.println("d = " + d);
		
		
		int z = 7;
		System.out.println(z > 2 ? z < 5 ? 3 : 6 : 9);
//		z > 2 ? (z < 5 ? 3 : 6) : 9;
		
		int a1 = 5;
		int b1 = 10;
		
		int z1 = 11;
		int z2 = 22;
		
		int c1 = a1 > b1 ? z1 : z2;
		System.out.println(c1);
		
	}

}
