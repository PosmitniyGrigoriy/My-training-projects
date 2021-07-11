package ru.site.lesson14;

public class Start3 {

	static void time() {
		OUTER: for(int a = 0; a <= 6; a++) {
			MIDDLE: for(int b = 0; b <= 59; b++) {
				if (a > 1 && b % 10 == 0) {
					break OUTER;
				}
				INNER: for(int c = 0; c <= 59; c++) {
					if ((c * a) > b) {
						continue MIDDLE;
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
