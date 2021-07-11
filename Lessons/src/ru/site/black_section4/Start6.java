package ru.site.section4;

import java.util.*;

public class Start6 {
	public static void main(String[] args) {
		
		ArrayList<Integer> listNumbers = new ArrayList<>();
		Integer[] arrayNumbers = {-3, 8, 12, -8, 0, 5, 10, 1, 150, -30};
		for(Integer outputNumber : arrayNumbers) {
			System.out.print(outputNumber + " ");
		}
		Arrays.sort(arrayNumbers);
		System.out.println();
		for(Integer outputNumber : arrayNumbers) {
			System.out.print(outputNumber + " ");
		}
		System.out.println();
		for(Integer addNumber : arrayNumbers) {
			listNumbers.add(addNumber);
		}
		System.out.println(listNumbers);
		Collections.reverse(listNumbers);
		System.out.println(listNumbers);
		Collections.shuffle(listNumbers);
		System.out.println(listNumbers);

	}
}
