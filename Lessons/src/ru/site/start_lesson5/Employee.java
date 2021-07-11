package ru.site.lesson5;

public class Employee {
	
	int id;
	String surname;
	int age;
	int salary;
	String department;
	
	Employee(int id, String surname, int age, int salary, String department) {

		this.id = id;
		this.surname = surname;
		this.age = age;
		this.salary = salary;
		this.department = department;
		
	}
	
	public int salaryX2() {
		int resultSalary = salary * 2;
		return resultSalary;
	}
	
}
