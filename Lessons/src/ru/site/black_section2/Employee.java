package ru.site.section2;

public class Employee implements Comparable<Employee> {
	
	int id;
	String name;
	String surname;
	int salary;
	
	Employee() {
	}
	
	Employee(int id, String name, String surname, int salary) {
		this.id = id;
		this.name = name;
		this.surname = surname;
		this.salary = salary;
	}
	
	@Override
	public String toString() {
		return "\n" + id + " " + name + " " + surname + " " + salary;
	}
	
	// 1-ый способ
//	@Override
//	public int compareTo(Employee anotherEmployee) {
//		if(this.id == anotherEmployee.id) {
//			return 0;
//		} else if (this.id < anotherEmployee.id) {
//			 return -1;
//		} else {
//			return 1;
//		}
//	}
	
	// 2-ой способ
//	@Override
//	public int compareTo(Employee anotherEmployee) {
//		return this.id - anotherEmployee.id;
//	}
	
	// 3-ий способ
//	@Override
//	public int compareTo(Employee anotherEmployee) {
//		return this.id.compareTo(anotherEmployee.id);
//	}
	
	// 4-ый способ
//	@Override
//	public int compareTo(Employee anotherEmployee) {
//		return this.name.compareTo(anotherEmployee.name);
//	}
	
	// 5-ый способ
	@Override
	public int compareTo(Employee anotherEmployee) {
		int res = this.name.compareTo(anotherEmployee.name);
		if(res == 0) {
			res = this.surname.compareTo(anotherEmployee.surname);
		}
		return res;
	}
	
}
