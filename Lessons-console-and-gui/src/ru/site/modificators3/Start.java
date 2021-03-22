// Урок от Java Blogger 007

package ru.site.modificators3;

import ru.site.modificators.v1;
import ru.site.modificators2.v2;
import ru.site.modificators2.v3;

public class Start {

	public static void main(String[] args) {
		System.out.println("----------");
		System.out.println("Вызываются все доступные методы уровня доступа (находятся в пэкэдже, вызов через экземпляр):\n");
		v1 on1 = new v1();
		on1.test();
		System.out.println("----------");
		System.out.println("Вызываются все доступные методы уровня доступа (находятся в другом пэкэдже, поэтому нужно импортировать класс, где указаны эти методы уровней доступа, вызов через экземпляр):\n");
		v2 on2 = new v2();
		on2.test();
		System.out.println("----------");
		System.out.println("Вызываются все доступные методы уровня доступа (находятся в другом пэкэдже, поэтому нужно импортировать класс, где указаны эти методы уровней доступа, также наследовать класс, где находятся методы уровней доступа, вызов методов напрямую, без экземпляра):\n");
		v3 on3 = new v3();
		on3.test();
		System.out.println("----------");
	}

}
