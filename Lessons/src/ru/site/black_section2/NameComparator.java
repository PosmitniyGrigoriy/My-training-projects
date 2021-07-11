package ru.site.section2;

import java.util.Comparator;

public class NameComparator implements Comparator<Employee> {
	
	// 2-ой способ
	@Override
	public int compare(Employee employeeOne, Employee employeeTwo) {
		return employeeOne.name.compareTo(employeeTwo.name);
	}
	
}
