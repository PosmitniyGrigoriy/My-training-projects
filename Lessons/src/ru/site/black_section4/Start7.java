package ru.site.section4;

class lifo {
	static void test1() {
		System.out.println("test1 - начало");
		System.out.println("test1 - конец");
	}

	static void test2() {
		System.out.println("test2 - начало");
		test1();
		System.out.println("test2 - конец");
	}

	static void test3() {
		System.out.println("test3 - начало");
		test2();
		System.out.println("test3 - конец");
	}
}

public class Start7 {
	
	public static void main(String[] args) {
		
		System.out.println("main - начало");
		lifo.test3();
		System.out.println("main - конец");
		
	}
	
}
