package ru.site.atmmachine;

import java.util.ArrayList;
import java.util.List;

public class Options {
	
	private int cash;
	private int total;

	private List<Integer> myCash = new ArrayList<>();

	public void setCash(int cash) {
		
		if (cash <= 0) {
			System.out.println("Введите корректную сумму.");
		} else {
			this.cash = cash;
			myCash.add(cash);
			total = 0;
			for (int i = 0; i < myCash.size(); i++) {
				total = total + myCash.get(i);
			}
			System.out.println("На вашем счете " + total + " руб.");
		}

	}
	
	

	public void getCash(int cash) {
		total = 0;
		for (int i = 0; i < myCash.size(); i++) {
			total = total + myCash.get(i);
		}
		if (cash > total) {
			System.out.println("У вас не достаточно средств на счете.");
		} else {
			myCash.clear();
			myCash.add(total - cash);
			total = 0;
			for (int i = 0; i < myCash.size(); i++) {
				total = total + myCash.get(i);
			}
			System.out.println("Остаток на счете " + total + " руб.");
		}
	}
	
	public void balance() {
		System.out.println("Ваш баланс: " + total + " руб.");
	}

}
