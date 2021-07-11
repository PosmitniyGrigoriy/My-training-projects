//package ru.site.lesson23;
//
//class Animal5 {
//
//	static String showName() {
//		return "Animal";
//	}
//
//	void showInfoAboutAnimal() {
//		System.out.println("Name of animal: " + showName());
//	}
//
//}
//
//class Mouse5 extends Animal5 {
//
//	static String showName() {
//		return "Mouse";
//	}
//
//	void showInfoAboutMouse() {
//		System.out.println("Name of mouse: " + showName());
//	}
//
//}
//
//public class Start7 {
//
//	public static void main(String[] args) {
//
//		Mouse5 mouse = new Mouse5();
//		mouse.showInfoAboutAnimal();
//		mouse.showInfoAboutMouse();
//
//	}
//
//}



package ru.site.lesson23;

class Animal5 {

	String showName() {
		return "Animal";
	}

	void showInfoAboutAnimal() {
		System.out.println("Name of animal: " + showName());
	}

}

class Mouse5 extends Animal5 {

	String showName() {
		return "Mouse";
	}

	void showInfoAboutMouse() {
		System.out.println("Name of mouse: " + showName());
	}

}

public class Start7 {

	public static void main(String[] args) {

		Mouse5 mouse = new Mouse5();
		mouse.showInfoAboutAnimal();
		mouse.showInfoAboutMouse();

	}

}
