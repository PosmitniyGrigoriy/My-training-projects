package ru.site.lesson14;

public class Start2 {

	static void time() {
		for(int a = 0; a <= 6; a++) {
			if(a == 6) {
				break;
			}
			for(int b = 0; b <= 59; b++) {
				if (a > 1 && b == 11) {
					break;
				}
				for(int c = 0; c <= 59; c++) {
					if ((c * a) > b) {
						break;
					}
					System.out.println(a + " : " + b + " : " + c);
				}
			}
		}
	}

	public static void main(String[] args) {

		time();

	}

}
