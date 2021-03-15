// Урок от Book Yakov Fine

package ru.site.calculator;

import javax.swing.*;
import java.awt.*;

public class Start {

	public static void main(String[] args) {
		
		
		// Создаем панель
		JPanel windowContent = new JPanel();
		
		
		// Задаем менеджер отображения для этой панели
		
//		v1
//		FlowLayout fl = new FlowLayout();
//		windowContent.setLayout(fl);
		
		
//		v2
		GridLayout gl = new GridLayout(4,2,5,5);
		windowContent.setLayout(gl);
		
		
//		v3
//		BorderLayout bl = new BorderLayout();
//		windowContent.setLayout(bl);
		
		
		// Создаем компоненты в памяти
		JLabel label1 = new JLabel ("Number 1:");
		JTextField field1 = new JTextField(10);
		JLabel label2 = new JLabel ("Number 2:");
		JTextField field2 = new JTextField(10);
		JLabel label3 = new JLabel ("Sum:");
		JTextField result = new JTextField(10);
		JButton go = new JButton ("Add");
		
		

		// Добавляем компоненты на панель
		windowContent.add(label1);
		windowContent.add(field1);
		windowContent.add(label2);
		windowContent.add(field2);		
		windowContent.add(label3);
		windowContent.add(result);
		windowContent.add(go);
		

		

		
		// Создаем фрейм и задаем для него панель
		JFrame frame = new JFrame ("Мой первый калькулятор");
		frame.setContentPane(windowContent);
		

		// Задаем и размер и делаем фрейм видимым
		frame.setSize(400,200);
		frame.setVisible(true);
		
		
	}

}
