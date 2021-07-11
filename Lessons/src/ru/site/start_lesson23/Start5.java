package ru.site.lesson23;

class Animal2 {
	static void say() {
		System.out.println("Я животное");
	}
}

class Mouse2 extends Animal2 {
	static void say() {
		System.out.println("Я мышка");
	}
}

public class Start5 {
	
	void test(Animal2 animal) {
		System.out.println("Animal");
	}
	
	void test(Mouse2 mouse) {
		System.out.println("Mouse");
	}

	public static void main(String[] args) {
		
		Start5 start4 = new Start5();
		Animal2 animal = new Mouse2();
		start4.test(animal);
		animal.say();
		
		Mouse2 mouse2 = new Mouse2();
		mouse2.say();
		 
	}

}
