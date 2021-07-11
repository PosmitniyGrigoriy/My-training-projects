package ru.site.lesson23;

class Employee {
	
	String name;
	int age;
	
	Employee(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	void doWork() {
		System.out.println("–аботник делает работу");
	}
	
}

class Doctor extends Employee {
	
	String post;
	
	Doctor(String name, int age, String post) {
		super(name, age);
		this.post = post;
	}
	
	void doHealth() {
		System.out.println("ƒоктор лечит");
	}
	
}

class Surgeon extends Doctor {
	
	int salary;
	
	Surgeon(String name, int age, String post, int salary) {
		super(name, age, post);
		this.salary = salary;
	}
	
	void doOperation() {
		System.out.println("’ирург проводит операцию");
	}
	
}

public class Start {
	
	public static void main(String[] args) {
		
		Surgeon z1 = new Surgeon("¬иктор", 30, "’ирург", 100);
		Doctor z2 = new Surgeon("¬иктор", 30, "’ирург", 100);
		Employee z3 = new Surgeon("¬иктор", 30, "’ирург", 100);
		
		// z1 доступны все переменные и все методы с трех классов
		z1.doWork();
		z1.doHealth();
		z1.doOperation();
		
		// z2 доступны переменные и методы уже не все, а только текущего класса и выше. класса ниже уже не доступны переменные и методы
		z2.doWork();
		z2.doHealth();
		
		// z3 доступны переменные и методы уже не все, а только текущего класса и выше. класса ниже уже не доступны переменные и методы
		z3.doWork();
		
	}

}
