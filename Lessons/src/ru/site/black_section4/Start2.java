package ru.site.section4;

import java.util.ArrayList;

public class Start2 {

	public static void main(String[] args) {
		
		Student student1 = new Student("Олег", 20, 5, 4.5);
		Student student2 = new Student("Виталий", 21, 4, 4.3);
		Student student3 = new Student("Михаил", 21, 5, 4.9);
		Student student4 = new Student("Полина", 20, 5, 4.7);
		Student student5 = new Student("Мария", 20, 4, 3.8);
		Student student6 = new Student("Мария", 20, 4, 3.8);
		
		ArrayList<Student> listStudents = new ArrayList<>();
		listStudents.add(student1);
		listStudents.add(student2);
		listStudents.add(student3);
		listStudents.add(student4);
		listStudents.add(student5);
		
		System.out.println(listStudents);
		listStudents.remove(student6);
		System.out.println(listStudents);
		
//		Результаты вывода:
//		[Олег 20 5 4.5, Виталий 21 4 4.3, Михаил 21 5 4.9, Полина 20 5 4.7, Мария 20 4 3.8]
//		[Олег 20 5 4.5, Виталий 21 4 4.3, Михаил 21 5 4.9, Полина 20 5 4.7]
		
	}

}
