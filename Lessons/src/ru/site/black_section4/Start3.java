package ru.site.section4;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Start3 {

	public static void main(String[] args) {
		
		String text1 = "madam";
//		String text1 = "madamZ";
		List<Character> listSymbol = new LinkedList<>();
		for(char symbol : text1.toCharArray()) {
			listSymbol.add(symbol);
//			System.out.println(symbol);
		}
		System.out.println(listSymbol); // [м, а, д, а, м]
		ListIterator<Character> iteratorCheck = listSymbol.listIterator();
		ListIterator<Character> reverseIteratorCheck = listSymbol.listIterator(listSymbol.size());
		boolean isPalendrome = true;
		while(iteratorCheck.hasNext() && reverseIteratorCheck.hasPrevious()) {
			if(iteratorCheck.next() != reverseIteratorCheck.previous()) {
				isPalendrome = false;
				break;
			}
		}
		if(isPalendrome) {
			System.out.println("Слово палиндром");
		} else {
			System.out.println("Слово не палиндром");
		}
		
	}

}
