package ru.site.lesson9;

public class Various {
	
	 // Ниж есть переменные и методы, в названиях которых указаны Андерскоры (_ и $). Так тоже можно называть.
	
	public String name;
	static int count;
	public String text1 = "text";
	public String t_e__x___t____2 = "text";
	public String $text2 = "text";
	public String t$e$x$t$2 = "text";
	String text;
	int result;
	double money;
	boolean game;
	int age;
	
	Various(String name) {
		count++;
		this.name = name;
		System.out.println("Машина # " + count + ": Название: " + name);
	}
	
	Various() {
		total();
	}
	
	public String toString() {
		return name;
	}
	
	public void total() {
		System.out.println("Всего машин: " + count);
	}
	
	public void t_o__t___a____l() {
		System.out.println("Всего машин: " + count);
	}
	
	public void $tot$al() {
		System.out.println("Всего машин: " + count);
	}
	
	
	
	
	// Ниже методы для тренировки. Чтобы выработать навык создавать разные варианты методов.
	
	public void test() {
		System.out.println("Текст");
	}
	
	public void test(String text) {
		this.text = text;
		System.out.println(text);
		
	}
	
	public void test(String text, int result) {
		this.text = text;
		this.result = result;
		System.out.println(text + result);
	}
	
	public void test(int result, double money) {
		
	}
	
	public void test(String text, String name, boolean game, int age) {
		
	}
	
	
	
	
	public void test2(String text) {
		System.out.println(text);
	}
	
	public void test2(String text, int result) {
		System.out.println(text + result);
	}

	
	
}
