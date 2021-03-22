// Урок от Java Blogger 007

package ru.site.atmmachine;

import java.util.Scanner;

public class Start {

	public static void main(String[] args) {
		
		int menu, money;

		Options topUpAndWithdraw = new Options();
		Scanner atmMenu = new Scanner(System.in);
		
		while (true) {
			
			System.out.println("---------------------");
			System.out.println("Банк Мифин\n");
			System.out.println("Меню:");
			System.out.println("1. Пополнить карту");
			System.out.println("2. Снять с карты");
			System.out.println("3. Узнать баланс");
			System.out.println("4. Забрать карту\n");
			System.out.println("Какую операцию хотите выполнить?");

			menu = atmMenu.nextInt();

			if (menu == 1) {
				System.out.println("Введите сумму для пополнения.");
				money = atmMenu.nextInt();
				topUpAndWithdraw.setCash(money);
			} else if (menu == 2) {
				System.out.println("Введите сумму для снятия.");
				money = atmMenu.nextInt();
				topUpAndWithdraw.getCash(money);
			} else if (menu == 3) {
				topUpAndWithdraw.balance();
			} else if (menu == 4) {
				System.out.println("Заберите карту.");
				System.exit(0);
			} else {
				System.out.println("Такой команды нет. Заберите карту.");
				System.exit(0);
			}
			
		}

	}

}
