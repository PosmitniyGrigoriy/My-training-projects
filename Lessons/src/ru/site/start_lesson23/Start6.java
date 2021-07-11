package ru.site.lesson23;

class Employee3 {
	
	int age = 30;
	
}

class Doctor3 extends Employee3 {
	
	int age = 35;
//	String age = "Тридцать пять";
	
}

public class Start6 {
	
	public static void main(String[] args) {
		
		Employee3 z1 = new Employee3();
		Employee3 z2 = new Doctor3();
		Doctor3 z3 = new Doctor3();
		System.out.println(z1.age);
		System.out.println(z2.age);
		System.out.println(z3.age);
		
	}

}
