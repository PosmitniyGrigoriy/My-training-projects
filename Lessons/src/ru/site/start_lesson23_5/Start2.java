/**
 * Если будет такой код, как ниже, то:
 * 1. В классе Animal2 есть 3 метода с кэмпаил тайм баиндин. Если создавать в мэин Animal2 a2 = new Animal2();
 * , то будет доступен только 2 и 3 методы. Первый не будет доступен, так как private, а final и static видны, но их нельзя перезаписать в саб классе будет.
 * 2. В классе Dog2 есть те же методы. say2 не получилось перезаписать, так как этот метод наследовался из Animal, и у метода final, поэтому перезапись невозможна.
 * У метода private - он скрытый был в Animal2, поэтому в Dog2 он не попал, и в Dog2 метод private уже новый.
 * А метод static он не перезаписывается тоже. Он скрывается старый стэтик и использует новый. Можно хайдить только 1 метод - это где static.
 */

package ru.site.lesson23_5;

class Animal2 {
	
	private void say() {
		System.out.println("ttt");
	}
	
	final void say2() {
		System.out.println("zzz");
	}
	
	static void say3() {
		System.out.println("ccc");
	}
	
}

class Dog2 extends Animal2 {
	
	private void say() {
		System.out.println("ttt222");
	}
	
//	final void say2() {
//		System.out.println("zzz222");
//	}
	
	static void say3() {
		System.out.println("ccc222");
	}
	
}

public class Start2 {

	public static void main(String[] args) {
		
		Animal2 a2 = new Animal2();
		Dog2 d2 = new Dog2();
		Animal2 c2 = new Dog2();
		
		a2.say2(); // zzz
		a2.say3(); // ccc
		
		d2.say2(); // zzz
		d2.say3(); // ccc222
		
		c2.say2(); // zzz
		c2.say3(); // ccc
		
	}

}
