package ru.site.threadsone;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class OneThread extends JFrame implements ActionListener {
	// Конструктор
	OneThread() {
		// Создать окно с кнопкой и текстовым полем
		GridLayout gl = new GridLayout(2, 1);
		this.getContentPane().setLayout(gl);
		JButton myButton = new JButton("Kill Time");
		myButton.addActionListener(this);
		this.getContentPane().add(myButton);
		this.getContentPane().add(new JTextField());
	}

	// Обработчик нажатия кнопки
	public void actionPerformed(ActionEvent e) {
		// Просто заморозить на некоторое время,
		// чтобы показать, что окно заблокировано
		for (int i = 0; i < 10000; i++) {
			this.setTitle("i=" + i);
		}
	}
}