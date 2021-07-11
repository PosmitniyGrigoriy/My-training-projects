package ru.site.lesson8;

public class People {
	
	String name;
	int age;
	static int number; // Статик увеличивает значнение # объекта на +1 каждый раз, а без него не увеличивается
	
	People(String name, int age) {
		number++;
		this.name = name;
		this.age = age;
		System.out.println("Создан человек # " + number + ": " + name + ", " + age);
	}
	
	public static void sum() {
		System.out.println("\nВсего создано человек: " + number);
	}
	
	public static void sum2() {
		System.out.println("\nВсего создано человек: " + number);
	}
	
	
	public static void main(String[] args) {
		
		People people = new People("Игорь", 25);
		People people2 = new People("Олег", 29);
		People people3 = new People("Маша", 22);
		sum(); // Имя метода - лучше использовать этот вариант, а не нижние
		People.sum(); // Имя класса + имя метода
		ru.site.lesson8.People.sum2(); // Полное имя пэкэджа + имя класса + имя метода
		
	}
	
}
