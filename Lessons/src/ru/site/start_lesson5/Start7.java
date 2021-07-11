package ru.site.lesson5;

public class Start7 {

	public static void main(String[] args) {
		
		Employee employee = new Employee(1, "Олег", 26, 45000, "Продавец");
		Employee employee2 = new Employee(2, "Игорь", 31, 72000, "Руководитель");
		
		int salaryX2Employee1 = employee.salaryX2();
		System.out.println(salaryX2Employee1);
		
		System.out.println(employee2.salaryX2());
		
	}

}
