// Урок от Book Yakov Fine

package ru.site.threadstwo;

import javax.swing.WindowConstants;

public class Start {

	public static void main(String[] args) {
		
		// Если нажать на кнопку, то будет работать 2 потока. Первый-главный. Доступен текст. Можно писать в текстовое поле. И далее второй поток включается - цикл. В заголовке программы пишет значение от 1 до 9999.
		
		TwoThreads myWindow = new TwoThreads();
		//Убедись,что окно закрывается по нажатию на крестик в углу
		myWindow.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		// Установи размеры окна и сделай его видимым
		myWindow.setBounds(0, 0, 350, 100);
		myWindow.setVisible(true);
	}
}
