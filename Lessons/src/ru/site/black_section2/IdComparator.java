package ru.site.section2;

import java.util.Comparator;

public class IdComparator implements Comparator<Employee> {
	
	// 1-ый способ
	@Override
	public int compare(Employee employeeOne, Employee employeeTwo) {
		if(employeeOne.id == employeeTwo.id) {
			return 0;
		} else if (employeeOne.id < employeeTwo.id) {
			return -1;
		} else {
			return 1;
		}
	}
		
}
