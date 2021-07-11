package ru.site.lesson23;

public class Start12 {
	
	public Start12() { System.out.println("X"); }
	public Start12(int i) { System.out.println("X" + i); }
	private boolean abc() { return false; }
	public static void main(String[] args) {
		Start12 x = new Y4(18); // Если эту строку запустить, закомментировав нижнюю, то будет вывод: Х18, false.
//		Start12 x = new Start12(18); // Если эту строку запустить, закомментировав верхнюю, то будет вывод: Х, Y, false.
		System.out.println(x.abc());
	}
	
}

class Y4 extends Start12 {
	
	public Y4(int i) { System.out.println("Y"); }
	public boolean abc() { return true; }
	
}