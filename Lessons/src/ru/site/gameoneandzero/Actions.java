package ru.site.gameoneandzero;

import java.util.Scanner;

public class Actions {

	int motion = 0;

	int[] field = new int[9];

	String attention = "!!!! В этой ячейке уже есть значение. Выберите другую ячейку.";

	Scanner Motion = new Scanner(System.in);

	public void field() {
		System.out.println("Добро пожаловать в игру нолики-единицы!\n");
		System.out.println("Поле для игры ниже:");
		System.out.println("* | * | *   =>   1 | 2 | 3 ");
		System.out.println("* | * | *   =>   4 | 5 | 6 ");
		System.out.println("* | * | *   =>   7 | 8 | 9 ");
	}

	public void playerOne() {
		System.out.println("---------");
		System.out.println("Первый игрок. Укажите пустую ячейку с 1 по 9.");
		motion = Motion.nextInt();
		if (motion == 1) {
			if (field[0] == 0) {
				field[0] = 1;
			} else {
				System.out.println(attention);
				playerOne();
			}
		} else if (motion == 2) {
			if (field[1] == 0) {
				field[1] = 1;
			} else {
				System.out.println(attention);
				playerOne();
			}
		} else if (motion == 3) {
			if (field[2] == 0) {
				field[2] = 1;
			} else {
				System.out.println(attention);
				playerOne();
			}
		} else if (motion == 4) {
			if (field[3] == 0) {
				field[3] = 1;
			} else {
				System.out.println(attention);
				playerOne();
			}
		} else if (motion == 5) {
			if (field[4] == 0) {
				field[4] = 1;
			} else {
				System.out.println(attention);
				playerOne();
			}
		} else if (motion == 6) {
			if (field[5] == 0) {
				field[5] = 1;
			} else {
				System.out.println(attention);
				playerOne();
			}
		} else if (motion == 7) {
			if (field[6] == 0) {
				field[6] = 1;
			} else {
				System.out.println(attention);
				playerOne();
			}
		} else if (motion == 8) {
			if (field[7] == 0) {
				field[7] = 1;
			} else {
				System.out.println(attention);
				playerOne();
			}
		} else if (motion == 9) {
			if (field[8] == 0) {
				field[8] = 1;
			} else {
				System.out.println(attention);
				playerOne();
			}
		}
		System.out.println(field[0] + " | " + field[1] + " | " + field[2]);
		System.out.println(field[3] + " | " + field[4] + " | " + field[5]);
		System.out.println(field[6] + " | " + field[7] + " | " + field[8]);
		System.out.println();
	}

	public void playerTwo() {
		System.out.println("---------");
		System.out.println("Второй игрок. Укажите пустую ячейку с 1 по 9.");
		motion = Motion.nextInt();
		if (motion == 1) {
			if (field[0] == 0) {
				field[0] = 2;
			} else {
				System.out.println(attention);
				playerTwo();
			}
		} else if (motion == 2) {
			if (field[1] == 0) {
				field[1] = 2;
			} else {
				System.out.println(attention);
				playerTwo();
			}
		} else if (motion == 3) {
			if (field[2] == 0) {
				field[2] = 2;
			} else {
				System.out.println(attention);
				playerTwo();
			}
		} else if (motion == 4) {
			if (field[3] == 0) {
				field[3] = 2;
			} else {
				System.out.println(attention);
				playerTwo();
			}
		} else if (motion == 5) {
			if (field[4] == 0) {
				field[4] = 2;
			} else {
				System.out.println(attention);
				playerTwo();
			}
		} else if (motion == 6) {
			if (field[5] == 0) {
				field[5] = 2;
			} else {
				System.out.println(attention);
				playerTwo();
			}
		} else if (motion == 7) {
			if (field[6] == 0) {
				field[6] = 2;
			} else {
				System.out.println(attention);
				playerTwo();
			}
		} else if (motion == 8) {
			if (field[7] == 0) {
				field[7] = 2;
			} else {
				System.out.println(attention);
				playerTwo();
			}
		} else if (motion == 9) {
			if (field[8] == 0) {
				field[8] = 2;
			} else {
				System.out.println(attention);
				playerTwo();
			}
		}
		System.out.println(field[0] + " | " + field[1] + " | " + field[2]);
		System.out.println(field[3] + " | " + field[4] + " | " + field[5]);
		System.out.println(field[6] + " | " + field[7] + " | " + field[8]);
		System.out.println();
	}

	public void conditionsWin() {

		String notificationPlayerOne = "\nПобедил первый игрок.";
		String notificationPlayerTwo = "\nПобедил второй игрок.";
		String notificationPlayerOneAndTwo = "\nНикто не победил.";

		int one = 1;
		int two = 2;

		if ((field[0] == one && field[1] == one && field[2] == one)
				| (field[6] == one && field[7] == one && field[8] == one)
				| (field[0] == one && field[3] == one && field[6] == one)
				| (field[2] == one && field[5] == one && field[8] == one)
				| (field[2] == one && field[4] == one && field[6] == one)
				| (field[0] == one && field[4] == one && field[8] == one)) {
			System.out.println(notificationPlayerOne);
			System.exit(0);
		}

		if ((field[0] == two && field[1] == two && field[2] == two)
				| (field[6] == two && field[7] == two && field[8] == two)
				| (field[0] == two && field[3] == two && field[6] == two)
				| (field[2] == two && field[5] == two && field[8] == two)
				| (field[2] == two && field[4] == two && field[6] == two)
				| (field[0] == two && field[4] == two && field[8] == two)) {
			System.out.println(notificationPlayerTwo);
			System.exit(0);
		}

		if (!(field[0] == 0) && !(field[1] == 0) && !(field[2] == 0) && !(field[3] == 0) && !(field[4] == 0)
				&& !(field[5] == 0) && !(field[6] == 0) && !(field[7] == 0) && !(field[8] == 0)) {
			System.out.println(notificationPlayerOneAndTwo);
		}

	}

}
