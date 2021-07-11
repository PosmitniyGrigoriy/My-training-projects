//package ru.site.lesson23;
//
//class A {
//	void abc(A a) {
//		System.out.println("A");
//	}
//}
//
//class B extends A {
//	void abc(B b1) { // Перегруженный метод - overloading
//		System.out.println("B");
//	}
//}
//
//class C extends B {
//	void abc(B b2) { // Перезаписанный метод - overriding
//		System.out.println("С");
//	}
//}
//
//public class Start8 {
//	
//	public static void main(String[] args) {
//		
//		A c1 = new C();
//		c1.abc(new B());
//		
//	}
//}


package ru.site.lesson23;

class A {
	void abc(A a1) {
		System.out.println("A");
	}
}

class B extends A {
	void abc(A a2) { // Перезаписанный метод - overriding
		System.out.println("AAA");
	}
}

class C extends B {
	void abc(B b) { // Перегруженный метод - overloading
		System.out.println("С");
	}
}

public class Start8 {
	
	public static void main(String[] args) {
		
		A c1 = new C();
		c1.abc(new B());
		
	}
}
