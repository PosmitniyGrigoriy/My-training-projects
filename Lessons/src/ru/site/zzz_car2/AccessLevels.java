// Урок от Book Yakov Fine

package ru.site.car2;

public class AccessLevels {

	// Эта private переменная может использоваться только внутри класса
	private String brakesCondition;

	// public метод brake() вызывает private методы, чтобы решить, какие тормоза использовать
	public void brake(int pedalPressure) {
		boolean useRegularBrakes;
		useRegularBrakes = checkForAntiLockBrakes(pedalPressure);
		if (useRegularBrakes == true) {
			useRegularBrakes();
		} else {
			useAntiLockBrakes();
		}
	}

	// Этот private метод, проверяющий тормоза с авто-блокировкой может быть вызван только внутри этого класса
	private boolean checkForAntiLockBrakes(int pressure) {
		if (pressure > 100) {
			return true;
		} else {
			return false;
		}
	}

	// Этот private метод может быть вызван только внутри этого класса
	private void useRegularBrakes() {
		// здесь будет код, который посылает сигнал обычным тормозам
	}

	// Этот private метод может быть вызван только внутри этого класса
	private void useAntiLockBrakes() {
		// код, который посылает сигнал антиблокировочным тормозам
	}

}
