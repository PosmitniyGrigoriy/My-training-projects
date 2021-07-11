package ru.site.lesson23;

class X {
	String s1 = "Привет";
}

class Y extends X {
	boolean bool = false;
}

public class Start10 {

	public static void main(String[] args) {
		
		X x = new Y();
//		System.out.println(x.s1 + " " x.bool); // На этой строке ошибка. Переменная bool не видна. Разобраться почему.
		
	}

}
