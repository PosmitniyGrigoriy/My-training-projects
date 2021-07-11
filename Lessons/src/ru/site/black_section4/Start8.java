package ru.site.section4;

import java.util.*;

public class Start8 {
	
	public static void main(String[] args) {
		
		Stack<Integer> stackNumbers = new Stack<>();
		stackNumbers.push(10);
		stackNumbers.push(5);
		stackNumbers.push(7);
		stackNumbers.push(4);
		stackNumbers.push(9);
		System.out.println(stackNumbers); // [10, 5, 7, 4, 9]
		stackNumbers.pop(); // 9
		System.out.println(stackNumbers); // [10, 5, 7, 4]
		stackNumbers.peek();
		System.out.println(stackNumbers); // [10, 5, 7, 4]
		
		// *******************************************************
		
		Stack<Integer> stackNumbers2 = new Stack<>();
		stackNumbers2.push(10);
		stackNumbers2.push(5);
		stackNumbers2.push(7);
		stackNumbers2.push(4);
		stackNumbers2.push(9);
		System.out.println(stackNumbers); // [10, 5, 7, 4, 9]
		
		while(!stackNumbers2.isEmpty()) {
			stackNumbers2.pop();
		}
		System.out.println(stackNumbers2);
		
	}
	
}
