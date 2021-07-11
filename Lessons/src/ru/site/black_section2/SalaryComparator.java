package ru.site.section2;

import java.util.Comparator;

public class SalaryComparator implements Comparator<Employee> {
	
	// 3-ий способ
//	@Override
//	public int compare(Employee employeeOne, Employee employeeTwo) {
//		return employeeOne.salary - employeeTwo.salary;
//	}
	
	// 4-ый способ
	@Override
	public int compare(Employee employeeOne, Employee employeeTwo) {
		if(employeeOne.salary == employeeTwo.salary) {
			return 0;
		} else if (employeeOne.salary < employeeTwo.salary) {
			 return -1;
		} else {
			return 1;
		}
	}
	
}
