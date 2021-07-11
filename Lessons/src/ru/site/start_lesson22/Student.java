package ru.site.lesson22;

class Human {
	
	String n;
	String m;
	
	Human(String n) {
		this(n, null);
	}
	
	Human(String n, String s) {
		this.n = n;
		this.m = m;
	}
	
}

public class Student extends Human {
	
	Student() {
		this(5);
		System.out.println("Привет");
	}
	
	Student(int i) {
		super("Пока");
	}
	
	public static void main(String[] args) {
		
		Student student = new Student();
		
	}
	
}
