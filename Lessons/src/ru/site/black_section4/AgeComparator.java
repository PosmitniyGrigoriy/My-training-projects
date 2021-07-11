package ru.site.section4;

import java.util.Comparator;

public class AgeComparator implements Comparator<Student2> {
	
	@Override
	public int compare(Student2 student1, Student2 student2) {
		return student1.age.compareTo(student2.age);
	}
	
}
