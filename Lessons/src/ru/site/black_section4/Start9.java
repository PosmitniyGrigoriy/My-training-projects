package ru.site.section4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Start9{

	public static void main(String[] args) {
		
		Student2 student1 = new Student2("Алена", 20);
		Student2 student2 = new Student2("Ирина", 19);
		Student2 student3 = new Student2("Виктория", 20);
		Student2 student4 = new Student2("Алена", 20);
		Student2 student5 = new Student2("Виктория", 20);

		Map<Student2, Integer> mapStudents = new HashMap<>();
		mapStudents.put(student1, 5);
		mapStudents.put(student2, 4);
		mapStudents.put(student3, 5);
		
		System.out.println(mapStudents.containsKey(student4));
		System.out.println(student1.equals(student4));
		
		System.out.println(student1.hashCode());
		System.out.println(student2.hashCode());
		System.out.println(student3.hashCode());
		System.out.println(student4.hashCode());
				
		// Интовые значения hashCode 4-х студентов без переопределения методов equals и hashCode
//		1227229563
//		1982791261
//		1562557367
//		1101288798
		
		// Интовые значения hashCode 4-х студентов c переопределением методов equals и hashCode
//		993796778
//		1001336753
//		1915514292
//		993796778
		
		TreeMap<Student2, Double> treeMapStudents = new TreeMap<>(new Comparator<Student2>() {
			@Override
			public int compare(Student2 st1, Student2 st2) {
				return 0;
		}
		}); // Если не будет найдено решение, то удалить код внутри параметрок коллекции, и ошибки не будет, тогда использовать вместо Comparator Comparable. И добавить код Comparable в Student2, чтобы работала строка 64, и ошибки в консоли не было.
		
		treeMapStudents.put(student1, 7.5);
		treeMapStudents.put(student2, 7.3);
		treeMapStudents.put(student3, 8.1);
		treeMapStudents.put(student4, 7.8);
		System.out.println(treeMapStudents);
		System.out.println(treeMapStudents.descendingMap());
//		System.out.println(treeMapStudents.tailMap(8.0));
//		System.out.println(treeMapStudents.headMap(7.8));
		System.out.println(treeMapStudents.lastEntry());
		System.out.println(treeMapStudents.firstEntry());
		
		System.out.println(treeMapStudents.containsKey(student5));
		System.out.println(treeMapStudents.containsValue(student5));
		
	}

}
