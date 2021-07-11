package ru.site.lesson12;

public class Start4 {

	String name;
	int age;
	
	Start4(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public static void main(String[] args) {
		
		Start4 people1 = new Start4("Игорь", 25);
		Start4 people2 = new Start4("Илья", 28);
		Start4 people3 = new Start4("Игорь", 25);

		if (people1.name == people2.name) {
			if (people1.age == people2.age) {
				System.out.println("Имя и возраст первого и второго человека одинаковы");
			} else {
				System.out.println("Имя первого и второго человека одинаково, а возраст разный");
			}
		} else {
			System.out.println("Имя первого и второго человека разные. Дальше анализ делать нет смысла.");
		}
		
		if (people1.name == people3.name) {
			if (people1.age == people3.age) {
				System.out.println("Имя и возраст первого и второго человека одинаковы");
			} else {
				System.out.println("Имя первого и второго человека одинаково, а возраст разный");
			}
		} else {
			System.out.println("Имя первого и второго человека разные. Дальше анализ делать нет смысла.");
		}
		
		
	}

}
