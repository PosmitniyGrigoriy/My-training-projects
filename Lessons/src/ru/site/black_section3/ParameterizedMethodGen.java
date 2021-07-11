package ru.site.section3;

import java.util.ArrayList;

public class ParameterizedMethodGen {
	
	public static <T> T getElement(ArrayList<T> a1) {
		return a1.get(1);
	}
	
}
