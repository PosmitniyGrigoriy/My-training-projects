package ru.site.lesson6;

public class Option10 {

	int id;
	String surname;
	int age;
	double salary;
	String department;
	int nubmer;

	Option10(int id, String surname, int age, double salary, String department, int nubmer) {

		this.id = id;
		this.surname = surname;
		this.age = age;
		this.salary = salary;
		this.department = department;
		this.nubmer = nubmer;

	}

	// ѕример как должен выгл€деть конструктор во врем€ перегрузки, но чтобы не было дублей строк. »спользовать такой формат this. ѕодробнее в ворде по этой теме.
	Option10(int id, String surname, int age) {

		this(id, surname, age, 0.0, null, 0);

	}

}
