package ru.site.section2;

import java.util.*;

public class Start {
	
	public static void main(String[] args) {
		
		List<String> listName = new ArrayList<>();
		listName.add("Алексей");
		listName.add("Игорь");
		listName.add("Александра");
		listName.add("Олег");
		listName.add("Ярослав");
		
		Collections.sort(listName);
		System.out.println(listName);
		
		// *****************************************
		
		List<Integer> listDate = new ArrayList<>();
		listDate.add(11);
		listDate.add(29);
		listDate.add(3);
		listDate.add(7);
		listDate.add(1);
		
		Collections.sort(listDate);
		System.out.println(listDate);
		
		// *****************************************
		
		Employee emp1 = new Employee(1, "Олег", "Примак", 1000);
		Employee emp2 = new Employee(29, "Игорь", "Зубриков", 850);
		Employee emp3 = new Employee(15, "Вячеслав", "Пронин", 1200);
		Employee emp4 = new Employee(10, "Вячеслав", "Антипов", 600);
		Employee emp5 = new Employee(13, "Алена", "Михайлова", 900);
		
		List<Employee> emp = new ArrayList<>();
		emp.add(emp1);
		emp.add(emp2);
		emp.add(emp3);
		emp.add(emp4);
		emp.add(emp5);
		
		// Если написать строку ниже, то будет ошибка. Джава не поймет, как нужно сравнивать объект, так как объект имеет более 1 поля. Не ясно какое поле нужно сравнивать.
		
//		Collections.sort(emp); // Ошибка будет на слове sort (если не будет импортирован интерфейс Comparable и прописан метод в классе Employee)
		Collections.sort(emp); // Для Comparable
//		Collections.sort(emp, new IdComparator()); // Для Comparator (сортировка поля id)
//		Collections.sort(emp, new NameComparator()); // Для Comparator (сортировка поля name)
		Collections.sort(emp, new SalaryComparator()); // Для Comparator (сортировка поля salary)
		System.out.println(emp);
		
		// Сортировать нужно самому. Критерии самому нужно выставлять. Можно сортировку сделать по любому полу: id, name, surname, salary или совмещать поля для вывода результата.
		
		// Чтобы сделать сортировку в объекте, у которого более 1 поля, нужно использовать интерфейс comparable.
		
	}

}
