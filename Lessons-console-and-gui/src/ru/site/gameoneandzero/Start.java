// Урок от себя

package ru.site.gameoneandzero;

public class Start {

	public static void main(String[] args) {

		// Игра работает 1 раз. Чтобы второй раз запустить, нужно повторно main запускать. Делал зацикливание через for - получилось, но было 3 бага выявлено, поэтому убрал зацикливание. Делал через white (true), но не получилось, но это со старым кодом. С новым кодом может и работало бы.

		int[] playerOne = new int[5];
		int[] playerTwo = new int[4];

		Actions on = new Actions();

		on.field();

		if (playerOne[0] == 0) {
			on.playerOne();
		}

		if (playerTwo[0] == 0) {
			on.playerTwo();
		}

		if (playerOne[1] == 0) {
			on.playerOne();
		}

		if (playerTwo[1] == 0) {
			on.playerTwo();
		}

		if (playerOne[2] == 0) {
			on.playerOne();
			on.conditionsWin();
		}

		if (playerTwo[2] == 0) {
			on.playerTwo();
			on.conditionsWin();
		}

		if (playerOne[3] == 0) {
			on.playerOne();
			on.conditionsWin();
		}

		if (playerTwo[3] == 0) {
			on.playerTwo();
			on.conditionsWin();
		}

		if (playerOne[4] == 0) {
			on.playerOne();
			on.conditionsWin();
		}

	}

}
