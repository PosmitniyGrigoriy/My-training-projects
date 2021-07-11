package ru.site.getbyte;

import java.util.Arrays;

public class Start {

	public static void main(String[] args) throws Exception {
		
		// ¬водитс€ слово, далее получаем байты, потом ниже код есть. ¬ставл€ем эти байты (прописываем вручную) и выводит раскодированное слово.
		String s = "kuky";
		
		// —о слова/фразы считываютс€ байры и ложатс€ в массив, кодировка по умолчанию
		byte[] b1 = s.getBytes();
		
		// —оздаетс€ 2 и 3 массивы. “ам будут байты в разных кодировках.
		byte[] b2 = null, b3 = null;
		b2 = s.getBytes("UTF-8");
		b3 = s.getBytes("windows-1251");
		
		System.out.println(Arrays.toString(b1));
		System.out.println(Arrays.toString(b2));
		System.out.println(Arrays.toString(b3));
		System.out.println();
		
		// ÷ифры положены в массив (байты) и из них было получено слово kuky
		// почему-то со скаченной таблицей ansii не совпадает. русские буквы содержат минусовые значени€, а по таблице плюсовые. может таблица ansii обновилась или другое что-то.
		byte[] b = {-1, 32, -24, -28, -13, 32, -29, -13, -21, -1, -14, -4};
		String s1 = new String(b); //¬ыводитс€ € иду гул€ть или kuky
//		String s2 = new String(b, "utf-8"); //¬ыводитс€ kuky
		String s2 = new String(b, "windows-1251"); //¬ыводитс€ € иду гул€ть
		System.out.println(s1);
		System.out.println(s2);
		
		char[] c = new char[] {'a', 'b', 'c', 'd' };
		String s3 = new String(c);
		System.out.println(s3); // ¬ыводит abcd
		
	}

}
