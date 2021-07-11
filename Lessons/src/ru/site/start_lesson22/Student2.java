package ru.site.lesson22;

class Human2 {
	
	String name;
	String surname;
	
	Human2(String name, String surname) {
		// На этой строке если мы ее не пишет, то джава сама напишет super(); и обратится к классу выше (Object) и там к пустому конструктору и потом в обратную сторону пойдет до экземпляра
		this.name = name;
		this.surname = surname;
	}
}

public class Student2 extends Human2 {
	
	int course;
	Student2(String name, String surname, int course) {
		super(name, surname);
		this.course = course;
	}
	
	public static void main(String[] args) {
		
		Student2 student2 = new Student2("Николай", "Иванов", 3);
		
	}

}
