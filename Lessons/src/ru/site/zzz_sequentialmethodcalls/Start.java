package ru.site.sequentialmethodcalls;

public class Start {

	public static void method1() {
		System.out.println("Method1");
		method2(666);
	}
	
	public static void method2(int x) {
		System.out.println("Method2 " + x);
		method3(x);
	}
	
	public static void method3(int x) {
		System.out.println("Method3 " + x);
		method4(x);
	}
	
	public static void method4(int x) {
		System.out.println("Method4 " + x);
	}
	
	public static void main(String[] args) {
		
		method1();
		
	}

}
