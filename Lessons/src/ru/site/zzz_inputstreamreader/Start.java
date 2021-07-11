package ru.site.inputstreamreader;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Start {

	public static void main(String[] args) throws IOException {
		
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		
		String result;
		
		System.out.println("Введите число");
		
		result = input.readLine();
		
		System.out.println("\nВы ввели: " + result);
		
		// Конвертация из строки в число
		int Result2 = Integer.parseInt(result);
		System.out.println(Result2);
		
	}

}
