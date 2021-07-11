package ru.site.lesson23;

class Animal {
	void say() {
		System.out.println("Я животное");
	}
}

class Mouse extends Animal {
	void say() {
		System.out.println("Я мышка");
	}
}

public class Start4 {
	
	void test(Animal animal) {
		System.out.println("Animal");
	}
	
	void test(Mouse mouse) {
		System.out.println("Mouse");
	}

	public static void main(String[] args) {
		
		Start4 start4 = new Start4();
		Animal animal = new Mouse();
		start4.test(animal);
		animal.say();
		
	}

}
