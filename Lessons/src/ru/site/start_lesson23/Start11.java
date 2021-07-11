package ru.site.lesson23;

class X2 { }

class Y2 extends X2 { }

public class Start11 {
	
	public static void abc(X2 x, Y2 y) { System.out.println("Привет"); }
	public static void abc(Y2 y, X2 x) { System.out.println("Пока"); }

	public static void main(String[] args) {
		
		Y2 a = new Y2();
//		abc(a, a); // На этой строке ошибка. Создан Y, а X не создан, поэтому и ошибка. Нужно в параметры метода вставлять переменные экземпляра Х и Y или наоборот, а не две переменные одного экземпляра
		
	}

}
