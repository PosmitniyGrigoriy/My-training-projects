// Урок от Sergey Nemchinsky Java Start

package ok.ru.site.varioustopics;

import java.util.ArrayList;
import java.util.List;

public class Start {

	public static void main(String[] args) {
		
		// в lesson 2 были выбраны люди, а не автомобили, животные
		
		BaseInfo Russian = new Man ("Igor", 175, 70, ColorEye.BLUE, ColorSkin.WHITE);
		BaseInfo American = new Man2 ("Kolin", 170, 76, ColorEye.GREEN, ColorSkin.BROUN);
		BaseInfo American2 = new Man2 ("Kolin", 170, 76, ColorEye.GREEN, ColorSkin.BROUN);
		
		List<BaseInfo> AllMans = new ArrayList<>();
		
		AllMans.add(Russian);
		AllMans.add(American);
		AllMans.add(American2);
		
		System.out.println("Коллекция: " + AllMans);
		System.out.println();
		
		double a = 4;
		
		Russian.addAge(2.2);
		Russian.addAge(1);
		American.addAge(a);
		American2.addAge(a);
		
		System.out.println(Russian);
		System.out.println(American);
		System.out.println(American2);
		
		System.out.println();
		System.out.println("Сравнение American + Russian:   " + American.equals(Russian));
		System.out.println("Сравнение American + American2: " + American.equals(American2));
		
		System.out.println();
		System.out.println("Пора ли русскому идти на прием к доктору:   " + Russian.isReadyToDoctor());
		System.out.println("Пора ли американцу идти на прием к доктору: " + American.isReadyToDoctor());
		
	}
}