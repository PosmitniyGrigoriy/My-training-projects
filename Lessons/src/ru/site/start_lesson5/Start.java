package ru.site.lesson5;

public class Start {
	public static void main(String[] args) {
		Math math = new Math();
		int result = math.sum(2,3,5);
		System.out.println(result);
		System.out.println(math.sum(17,2,1));
	}
}
