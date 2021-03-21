package ru.site.inputstreamreader;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Start {

	public static void main(String[] args) throws IOException {
		
		BufferedReader Input = new BufferedReader(new InputStreamReader(System.in));
		
		String Result;
		
		System.out.println("Введите число");
		
		Result = Input.readLine();
		
		System.out.println("\nВы ввели: " + Result);
		
		// Конвертация из строки в число
		int Result2 = Integer.parseInt(Result);
		System.out.println(Result2);
		
	}

}
