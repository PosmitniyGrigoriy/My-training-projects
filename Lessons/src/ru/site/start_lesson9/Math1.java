package ru.site.lesson9;

public class Math1 {

	// Автор курса скорее специально добавил 2 одинаковых переменных, чтобы проверить внимательность. Эта программа не будет работать, так как 2 одинаковых переменных а. Поэтому закомментировал 1 строку, чтобы программа заработала.
//	int a = 1;
	public static int a = 2;
	public static int b = 4;

	public static void sum() {
		System.out.println("Текст");
	}
	
	public void sum2() {
		System.out.println("Текст");
	}
	
	public int c = 5;
	
	void abc(int a) {
		System.out.println(a);
		System.out.println(this.a);
	}

}
