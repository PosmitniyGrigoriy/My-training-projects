package ru.site.lesson4;

public class Start {

	public static void main(String[] args) {
		
		Student student1 = new Student(1, "Игорь", "Морозов", 2009, 5, 4, 4);
		Student student2 = new Student(2, "Александр", "Миронов", 2011, 3, 3, 4);
		Student student3 = new Student(3, "Олег", "Петров", 2010, 5, 3, 4);
		
		System.out.println(student1);
		System.out.println(student2);
		System.out.println(student3);
		
		System.out.println();
		
		System.out.println("Средняя оценка первого студента: " + student1.calculateTheAverageScore());
		System.out.println("Средняя оценка второго студента: " + student2.calculateTheAverageScore());
		System.out.println("Средняя оценка третьего студента: " + student3.calculateTheAverageScore());
		
		System.out.println("-----------");
		
		Student student11 = new Student(1, "Игорь", "Морозов", 2009);
		Student student21 = new Student(2, "Александр", "Миронов", 2011);
		Student student31 = new Student(3, "Олег", "Петров", 2010);
		
		System.out.println(student11);
		System.out.println(student21);
		System.out.println(student31);
		
		System.out.println(student11.getStudentIdNumber());
		System.out.println(student11.getName());
		System.out.println(student11.getSurname());
		System.out.println(student11.getYearOfStudy());
		
		System.out.println("-----------");
		
		Student student12 = new Student();
		Student student22 = new Student();
		Student student32 = new Student();
		
		System.out.println(student12);
		System.out.println(student22);
		System.out.println(student32);
		
		System.out.println("-----------");
		
	}

}
