package ru.site.lesson19;

public class Start5 {
	
	public static String[] abc(String[] ... array1) {
		int length = 0;
		for(String[] array2 : array1) {
			length += array2.length;
		}
		String[] target = new String[length];
		int count = 0;
		for(String[] array2 : array1) {
			for(String s : array2) {
				target[count] = s;
				count++;
			}
		}
		return target;
	}
	
	public static void main(String[] args) {
		String[] target = abc(new String[] {"Автомобиль", "Трактор", "Танк"}, new String[] {"Один", "Два", "Три", "Четыре"});
		for(String s : args) {
			for(int i = 0; i < target.length; i++) {
				if(s.equals(target[i])) {
					target[i] = null;
				}
			}
		}
		for(String s : target) {
			System.out.print(s + " ");
		}
		System.out.println();
	}

}
