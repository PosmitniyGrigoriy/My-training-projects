package ru.site.lesson23;

class A10 {
	
	String s1 = "Привет";
	static double d1 = 3.14;
	
	int total(int ... i) {
		int result = 0;
		for(int a : i) {
			result += a;
		}
		return result;
	}
	
	static void abc() {
		System.out.println("Статический метод");
	}
	
}

public class Start9 extends A10 {
	
	String s2 = super.s1 + ", друг!";
//	String s3 = s1 + ", друг!";
//	String s1 = super.s1 + ", друг!";
	boolean s1 = true;
	
	int total(int ... i) {
		int result = super.total(i);
		System.out.println(result);
		return result;
	}
	
	public static void main(String[] args) {
		
		Start9 start9 = new Start9();
		System.out.println(start9.s2);
//		System.out.println(start9.s3);
		System.out.println(start9.s1);
		
	}

}
