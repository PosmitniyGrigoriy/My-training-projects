package ru.site.section4;

import java.util.*;

public class Start10 {
	
	public static void main(String[] args) {
		
		LinkedHashSet<Integer> lhsNumbers = new LinkedHashSet<>();
		lhsNumbers.add(6);
		lhsNumbers.add(-1);
		lhsNumbers.add(10);
		lhsNumbers.add(3);
		lhsNumbers.add(2);
		System.out.println(lhsNumbers);
		
		
		LinkedHashMap<Integer, Integer> lhmNumbers2 = new LinkedHashMap<>();
		lhmNumbers2.put(6, 10);
		lhmNumbers2.put(-1, 10);
		lhmNumbers2.put(10, 10);
		lhmNumbers2.put(3, 10);
		lhmNumbers2.put(2, 10);
		System.out.println(lhmNumbers2);
		
	}
	
}
