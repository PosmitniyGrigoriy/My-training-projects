package ru.site.lesson9;

public class Math3 {

	int a = 1;
	static int b = 2;

	void abc(int a) {
		System.out.println(b); // 2
		System.out.println(a); // 4
		System.out.println(this.a); // 1 - не присваивается, а ссылается. ссылается - значит 1, а если не было бы this, то присвоилось бы 4
		System.out.println(Math3.b); // 2
	}

}
