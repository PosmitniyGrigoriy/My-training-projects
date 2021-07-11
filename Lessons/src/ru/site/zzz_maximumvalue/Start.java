package ru.site.maximumvalue;

public class Start {

	public static int maximum(int x, int y, int z) {
		int maximumValue = x;
		
		if (y > maximumValue) {
			maximumValue = y;
		}
		
		if (z > maximumValue) {
			maximumValue = z;
		}
		
		System.out.println(maximumValue);
		return maximumValue;
		
	}
	
	public static void main(String[] args) {
		
		maximum(10, 11, 12);
		maximum(10, 9, 8);
		
	}

}
