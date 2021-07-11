package ru.site.lesson13;

public class Start3 {
	
	int numberMonth;
	
	static int setNumberMonth(int number) {
		return number;
	}
	
	public static void main(String[] args) {
		
//		switch(Start3.setNumberMonth(1)) {
		switch(setNumberMonth(1)) {
		case 1:
		case 3:
		case 5:
		case 6:
		case 8:
		case 10:
		case 12:
			System.out.println("В этом месяце 31 день");
			break;
		case 4:
		case 7:
		case 9:
		case 11:
			System.out.println("В этом месяце 30 дней");
			break;
		case 2:
			System.out.println("В этом месяце 28 дней");
			break;
		default:
			System.out.println("Такого месяца нет");
		}
		
	}

}
