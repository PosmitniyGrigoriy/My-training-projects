package ru.site.lesson6;

public class Method {
	
	public int sum() {
		System.out.println("0");
		return 0;
	}
	
	// Overloading
	public int sum(int a) {
		System.out.println(a);
		return a;
	}
	
	// Overloading
	public int sum(int a, int b) {
		int result = a + b;
		System.out.println(result);
		return result;
	}
	
	// Overloading
	public int sum(int a, int b, int c) {
		int result = a + b + c;
		System.out.println(result);
		return result;
	}
	
	// Overloading
	public int sum(int a, int b, int c, int d) {
		int result = a + b + c + d;
		System.out.println(result);
		return result;
	}
	
	// Overloading
	public String sum(String hello, String name) {
		String result = hello + name;
		System.out.println(result);
		return result;
	}
	
}
