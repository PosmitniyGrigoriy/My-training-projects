package ru.site.lesson22;

class Animal {
	
	int eye;
	
	Animal() {
		System.out.println("I am animal");
	}
	
	void eat() {
		System.out.println("Animal eats");
	}
	
	void drink() {
		System.out.println("Animal drinks");
	}

}

class Pet extends Animal {
	
	String name;
	int tail = 1;
	int paw = 4;
	
	Pet() {
		System.out.println("I am pet");
		eye = 2;
	}
	
	void run() {
		System.out.println("Pet runs");
	}
	
	void jump() {
		System.out.println("Pet jumps");
	}
	
}

class Dog extends Pet {
	
	Dog(String name) {
		System.out.println("I am dog and my name is: " + name);
	}
	
	void play() {
		System.out.println("Dog plays");
	}
	
}

class Cat extends Pet {
	
	Cat(String name) {
		System.out.println("I am cat and my name is: " + name);
	}
	
	void sleep() {
		System.out.println("Cat sleeps");
	}
		
}

public class Start4 {
	
	public static void main(String[] args) {
		
		Dog dog = new Dog("Барон");
		System.out.println(dog.paw);
		System.out.println();
		Cat cat = new Cat("Барсик");
		cat.sleep();
		
	}
	
}
