// Урок от Sergey Nemchinsky Java Start

package ok.ru.site.varioustopics;

import java.util.ArrayList;
import java.util.List;

public class Start {

	public static void main(String[] args) {
		
		// в lesson 2 были выбраны люди, а не автомобили, животные
		
		BaseInfo russian = new Man ("Igor", 175, 70, ColorEye.BLUE, ColorSkin.WHITE);
		BaseInfo american = new Man2 ("Kolin", 170, 76, ColorEye.GREEN, ColorSkin.BROUN);
		BaseInfo american2 = new Man2 ("Kolin", 170, 76, ColorEye.GREEN, ColorSkin.BROUN);
		
		List<BaseInfo> allMans = new ArrayList<>();
		
		allMans.add(russian);
		allMans.add(american);
		allMans.add(american2);
		
		System.out.println("Коллекция: " + allMans);
		System.out.println();
		
		double a = 4;
		
		russian.addAge(2.2);
		russian.addAge(1);
		american.addAge(a);
		american2.addAge(a);
		
		System.out.println(russian);
		System.out.println(american);
		System.out.println(american2);
		
		System.out.println();
		System.out.println("Сравнение American + Russian:   " + american.equals(russian));
		System.out.println("Сравнение American + American2: " + american.equals(american2));
		
		System.out.println();
		System.out.println("Пора ли русскому идти на прием к доктору:   " + russian.isReadyToDoctor());
		System.out.println("Пора ли американцу идти на прием к доктору: " + american.isReadyToDoctor());
		
	}
}