package ru.site.section3;

import java.util.ArrayList;
import java.util.List;

public class Start {
	
	// Данные статические методы относятся к последним (нижним заданиям)
	static void showListInfo(List<?> list) {
		System.out.println("Элементы листа: " + list);
	}
	
	static double total(ArrayList<? extends Number> array) {
		double total = 0;
		for (Number n : array) {
			total += n.doubleValue();
		}
		return total;
	}

	public static void main(String[] args) {
		
		System.out.println("Параметризированный класс: ");
		
		ParameterizedClassInfo<String> info1 = new ParameterizedClassInfo<>("Привет");
		ParameterizedClassInfo<String> info5 = new ParameterizedClassInfo<>("Огурец");
		System.out.println(info1);
		ParameterizedClassInfo<Integer> info2 = new ParameterizedClassInfo<>(10);
		System.out.println(info2);
		
		String s1 = info1.getValue();
		Integer i1 = info2.getValue();
		System.out.println(s1);
		System.out.println(i1);

		ParameterizedClassPair<String, Integer> pair1 = new ParameterizedClassPair<>("Помидор", 30);
		System.out.println(pair1); // Мой вариант вывода
		System.out.println(pair1.getValue1() + " " + pair1.getValue2()); // Вариант вывода автора

		ParameterizedClassOtherPair<String> otherPair = new ParameterizedClassOtherPair<>("Парень", "Девушка");
		System.out.println(otherPair);
		System.out.println(otherPair.getValue1() + " " + otherPair.getValue2());
		
		System.out.println();
		System.out.println("Параметризированный метод: ");
		
		ArrayList <Integer> i5 = new ArrayList<>();
		i5.add(10);
		i5.add(15);
		i5.add(34);
		i5.add(2);
		int result = ParameterizedMethodGen.getElement(i5);
		System.out.println(result);

		ArrayList <String> s5 = new ArrayList<>();
		s5.add("Один");
		s5.add("Два");
		s5.add("Три");
		s5.add("Четыре");
		String result2 = ParameterizedMethodGen.getElement(s5);
		System.out.println(result2);
		
		// For v1 and v2
		ParameterizedMethodGen2 test = new ParameterizedMethodGen2();
		System.out.println(test.getAge(15));
		
		// В классе ParameterizedClassInfo закомментировал код, поэтому ниже метод будет выдавать ошибку. Раскомментироватьк код, и ошибка пропадет.
//		info1.testQ(info5);
		
		ParameterizedClassInfo2<Integer> info10 = new ParameterizedClassInfo2<>(4);
		ParameterizedClassInfo2<Double> info11 = new ParameterizedClassInfo2<>(4.34);
		ParameterizedClassInfo2<Integer> info12 = new ParameterizedClassInfo2<>(348474);
		ParameterizedClassInfo2<Long> info13 = new ParameterizedClassInfo2<>(448147184712412412L);
//		ParameterizedClassInfo2 info13 = new ParameterizedClassInfo2("Текст"); // Так нельзя писать, потом что здесь доступны типы данных только по Number, а не String
		System.out.println(info10 + " " + info11 + " " + info12 + " " + info13);
		
		ParameterizedClassInfo2<Double> info = new ParameterizedClassInfo2<>(3.14);
		System.out.println(info);
		Double d1 = info.getValue();
		System.out.println(d1);
		
		List<Number> list3 = new ArrayList<>();
		list3.add(3.14);
		list3.add(766);
		list3.add(5857257273578235L);
		System.out.println(list3);
		
		// ***************************************************
		
		List<Double> list1 = new ArrayList<>();
		list1.add(3.14);
		list1.add(3.15);
		list1.add(3.20);

		List<String> list2 = new ArrayList<>();
		list2.add("Привет");
		list2.add("Пока");
		list2.add("Ок");

		showListInfo(list1);
		showListInfo(list2);

		// ***************************************************
		
		ArrayList<Double> ald = new ArrayList<>();
		ald.add(3.14);
		ald.add(3.15);
		ald.add(3.20);
		System.out.println(total(ald));
		
	}

}

//interface test1 {}
//interface test2 {}
