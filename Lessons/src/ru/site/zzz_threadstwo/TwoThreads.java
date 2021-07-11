package ru.site.threadstwo;

import javax.swing.*;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

	public class TwoThreads extends JFrame implements ActionListener, Runnable {
		// Конструктор
		TwoThreads() {
			// Создать окно с кнопкой и текстовым полем
			GridLayout gl = new GridLayout(2, 1);
			this.getContentPane().setLayout(gl);
			JButton myButton = new JButton("Kill Time");
			myButton.addActionListener(this);
			this.getContentPane().add(myButton);
			this.getContentPane().add(new JTextField());
		}

		public void actionPerformed(ActionEvent e) {
			// Создать поток и выполнить “замораживающий” код без блокировки
			Thread worker = new Thread(this);
			worker.start(); // вызывает метод run()
		}

		public void run() {
			// Заморозить на некоторое время, чтобы показать, что элементы окна НЕ блокируются
			for (int i = 0; i < 10000; i++) {
				this.setTitle("i=" + i);
			}
		}
	}