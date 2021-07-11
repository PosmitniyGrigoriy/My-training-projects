package ru.site.lesson13;

public class Start2 {

	public static void main(String[] args) {
		
		// Так как код дублируется с ПН по ПТ, саут и брэйк, то использовать код ниже, чтобы не было дублей
//		switch("Суббота") {
//		case "Понедельник":
//			System.out.println("С 9:00 до 18:00");
//			break;
//		case "Вторник":
//			System.out.println("С 9:00 до 18:00");
//			break;
//		case "Среда":
//			System.out.println("С 9:00 до 18:00");
//			break;
//		case "Четверг":
//			System.out.println("С 9:00 до 18:00");
//			break;
//		case "Пятница":
//			System.out.println("С 9:00 до 18:00");
//			break;
//		case "Суббота":
//			System.out.println("С 9:00 до 13:00");
//			break;
//		case "Воскресенье":
//			System.out.println("Выходной");
//			break;
//		default:
//			System.out.println("Такого дня недели нет");
//		}
		
		switch("Среда") {
		case "Понедельник":
		case "Вторник":
		case "Среда":
		case "Четверг":
		case "Пятница":
			System.out.println("С 9:00 до 18:00");
			break;
		case "Суббота":
			System.out.println("С 9:00 до 13:00");
			break;
		case "Воскресенье":
			System.out.println("Выходной");
			break;
		default:
			System.out.println("Такого дня недели нет");
		}
		
	}

}
