package ru.site.lesson8;

public class StartStudent {
	
	String name;
	int course;
	static int count;
	
	public StartStudent(String name, int course) {
		count++;
		this.name = name;
		this.course = course;
		System.out.println("Создан студент # " + count + ": "+ name + ", "+ course + " курс");
	}
	
	public static void showCount() {
		System.out.println("\nВсего создано студентов: " + count);
	}
	
	void abc() {
		StartStudent st3 = new StartStudent("Олег", 2);
	}
	
	static void abcd() {
		StartStudent st2 = new StartStudent("Игорь", 1);
	}
	
	public static void main(String[] args) {
		
		abcd();
		StartStudent st3 = new StartStudent("Иван", 4);
		st3.abc();
		
	}
	
}

class StudentTest {
	
	public static void main(String[] args) {
		
		StartStudent st1 = new StartStudent("Игорь", 1);
		StartStudent st2 = new StartStudent("Иван", 4);
		StartStudent st3 = new StartStudent("Олег", 2);
		
		StartStudent.showCount();
		
	}
	
}
