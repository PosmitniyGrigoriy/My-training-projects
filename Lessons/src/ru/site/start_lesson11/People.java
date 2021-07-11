package ru.site.lesson11;

public class People {
	
	String name;
	int age;
	static byte count;
	
	People(String name, int age) {
		count++;
		this.name = name;
		this.age = age;
		System.out.println("# " + count + " " + name + ", " + age + " лет");
	}
	
	static void changePosition2(People people1, People people2) {
		
		
		People people3 = people1;
		people1 = people2;
		people2 = people3;
		
		System.out.println();
		System.out.println("# 1 " + people1.name + ", " + people1.age + " лет"); // Был Игорь, теперь Олег
		System.out.println("# 2 " + people2.name + ", " + people2.age + " лет"); // Был Олег, теперь Игорь
		// Но это копия заменилась, так как если потом вывести снова тот же экземпляр (до изменения этим методом), то данные будут старые (не измененные), так как была создана копия в методе и была работа с копией, а не основными данными.
		
	}
		
	@Override
	public String toString() {
		return "People [name=" + name + ", age=" + age + "]";
	}
	
	static void updateObjectPeople1(People updateObject) {
		updateObject.name = "Олег";
		updateObject.age = 27;
	}
	
	static void updateObjectPeople2(People updateObject) {
		updateObject.name = "Игорь";
		updateObject.age = 25;
	}

	static void changePosition(int a, int b) {
		
		System.out.println("A: " + a + ", " + "B: " + b + " - было");
		
		int c = a;
		a = b;
		b = c;
		
		System.out.println("A: " + a + ", " + "B: " + b + " - стало");
		
	}
	
}
