package ru.site.economyrammemory;

public class Start {

	public static void main(String[] args) {
		
		// Для экономии памяти ОЗУ указал byte, а не int, так как переменная а, б и с входит в диапазон byte.
		byte a = 2;
		byte b = 4;
		byte c = (byte) (a*b);
		System.out.println(c);

	}

}
