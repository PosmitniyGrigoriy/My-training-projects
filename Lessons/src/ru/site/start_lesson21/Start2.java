// v1 - Создается конструктор и выводится сообщение
//package ru.site.lesson21;
//
//class Test {
//	Test() {
//		System.out.println("Создался объект");
//	}
//}
//
//public class Start2 {
//
//	public static void main(String[] args) {
//
//		Test test = new Test();
//
//	}
//
//}


// v2 - создается метод и не выводится сообщение, так как метод в main не вызван
//package ru.site.lesson21;
//
//class Test {
//	void Test() {
//		System.out.println("Создался объект");
//	}
//}
//
//public class Start2 {
//
//	public static void main(String[] args) {
//
//		Test test = new Test();
//
//	}
//
//}


//v3 - создается метод и конструктор. Сообщение конструктора выведется, а сообщение метода нет, так как метод в мэин не вызыван
package ru.site.lesson21;

class Test {
	void Test() {
		System.out.println("Это метод");
	}
	
	Test() {
		System.out.println("Это конструктор");
	}
}

public class Start2 {

	public static void main(String[] args) {

		Test test = new Test();

	}

}
