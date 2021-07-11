package ru.site.section4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Start4 {

	public static void main(String[] args) {
		
		int[] arrayNumbers = {-3, 8, 12, -8, 0, 5, 10, 1, 150, -30};
		for(int number : arrayNumbers) {
			System.out.print(number + " ");
		}
		System.out.println();
		Arrays.sort(arrayNumbers);
		for(int number : arrayNumbers) {
			System.out.print(number + " ");
		}
		System.out.println();
		int index = Arrays.binarySearch(arrayNumbers, 8);
		System.out.println(index);
		
		// ***********************************************************
		
		System.out.println("***************************");
		
		List<Integer> listNumbers = new ArrayList<>();
		listNumbers.add(-3);
		listNumbers.add(8);
		listNumbers.add(12);
		listNumbers.add(-8);
		listNumbers.add(0);
		listNumbers.add(5);
		listNumbers.add(10);
		listNumbers.add(1);
		listNumbers.add(150);
		listNumbers.add(-30);
		
		for(int number : listNumbers) {
			System.out.print(number + " ");
		}
		System.out.println();
		
		Collections.sort(listNumbers);
		for(int number : listNumbers) {
			System.out.print(number + " ");
		}
		System.out.println();
		int index2 = Collections.binarySearch(listNumbers, 5);
		System.out.println(index2);
		
//		Результат вывода:
//		-3 8 12 -8 0 5 10 1 150 -30 
//		-30 -8 -3 0 1 5 8 10 12 150 
//		6
//		***************************
//		-3 8 12 -8 0 5 10 1 150 -30 
//		-30 -8 -3 0 1 5 8 10 12 150 
//		5
		
	}

}
