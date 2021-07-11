package ru.site.lesson23;

class Employee2 {
	
	String name;
	int age;
	
	Employee2(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	void doWork() {
		System.out.println("Работник делает работу");
	}
	
}

class Doctor2 extends Employee2 {
	
	String post;
	
	Doctor2(String name, int age, String post) {
		super(name, age);
		this.post = post;
	}
	
	void doHealth() {
		System.out.println("Доктор лечит");
	}
	
}

class Surgeon2 extends Doctor2 {
	
	int salary;
	
	Surgeon2(String name, int age, String post, int salary) {
		super(name, age, post);
		this.salary = salary;
	}
	
	void doOperation() {
		System.out.println("Хирург проводит операцию");
	}
	
	@Override
	void doWork() {
		System.out.println("Хирург делает работу");
	}
	
}

public class Start2 {
	
	public static void main(String[] args) {
		
		Surgeon2 z1 = new Surgeon2("Виктор", 30, "Хирург", 100);
		z1.doWork();
		
	}

}
