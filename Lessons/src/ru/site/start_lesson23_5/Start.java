package ru.site.lesson23_5;

class Animal {
	
	Animal() {
		System.out.println("Animal");
	}
	
	void say() {
		System.out.println("Animal");
	}
	
	void go(Animal animal) {
		System.out.println("Animal go");
	}
	
	Animal animalSay() {
		System.out.println("Animal say");
		Animal animal = new Animal();
		return animal;
	}
	
}

class Dog extends Animal {
	
	Dog() {
		System.out.println("Dog");
	}
	
	void say() {
		System.out.println("Dog");
	}
	
	void sayZZZ() {
		System.out.println("ZZZ");
	}
	
	void go(Dog dog) {
		System.out.println("Dog go");
	}
	
	Animal animalSay() {
		System.out.println("Dog say");
		Dog dog = new Dog();
		return dog;
	}
	
	// Использовать верхний или нижний ковариантный метод. Сразу 2 использовать нельзя, так как методы называютя одиаково, а это дубли
//	Dog animalSay() {
//		System.out.println("Dog say");
//		Dog dog = new Dog();
//		return dog;
//	}
	
}

public class Start {

	public static void main(String[] args) {
		
		System.out.println("------ Animal t1 = new Animal(); ------");
		Animal t1 = new Animal();
		System.out.println("------ Dog d1 = new Dog(); ------");
		Dog d1 = new Dog();
		System.out.println("------ Animal z1 = new Dog(); ------");
		Animal z1 = new Dog();
		System.out.println("------ t1.say(); ------");
		t1.say();
		System.out.println("------ d1.say(); ------");
		d1.say();
		System.out.println("------ z1.say(); ------");
		z1.say();
		System.out.println("Выводит сообщение, исходя из переменной типа");
		t1.go(z1);
		t1.go(d1);
		t1.go(t1);
		System.out.println("Выводит сообщение, исходя из переменной типа");
		d1.go(z1);
		d1.go(d1);
		d1.go(t1);
		System.out.println("Выводит сообщение, исходя из переменной типа");
		z1.go(z1);
		z1.go(d1);
		z1.go(t1);
		System.out.println("1----");
		t1.animalSay();
		System.out.println("2----");
		d1.animalSay();
		System.out.println("3----");
		z1.animalSay();
		System.out.println("4----");
		
	}

}
