// Урок от Book Yakov Fine

package ru.site.threadsone;

import javax.swing.*;

public class Start {
	public static void main(String[] args) {
		
		// Работает в 1 потоке. Если нажать на кнопку, то пока цикл не выполнится (с 1 по 9999), то в текстовое поле нельзя вводить ничего, а когда цикл выполнится, то в текстовое поле можно вводить
		
		// Создать окно
		OneThread myWindow = new OneThread();
		// Убедиться, что окно закрывается при нажатии на крестик в углу
		myWindow.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		// Установить размеры окна – координаты левого верхнего
		// угла и высоту с шириной
		myWindow.setBounds(0, 0, 350, 100);
		// Сделать окно видимым
		myWindow.setVisible(true);
	}
}