package ru.site.lesson23_2;

import ru.site.lesson23_3.X2;
//import ru.site.lesson23_3.X2.*;

public class Y2 extends X2 {
	
	public void abc() { System.out.println('Y'); }
	public void def() { Y2 y = new Y2(); y.abc(); }
//	public void ghi() { X2 x = new Y2(); x.abc(); } // Метод abx не виден. Ошибка. Нужно в классе X2 менять уровень доступа у метода с protected на public, тогда будет работать
	
	public static void main(String[] args) {
		
		Y2 a = new Y2();
		a.abc();
		a.def();
//		a.ghi();
		
	}

}
