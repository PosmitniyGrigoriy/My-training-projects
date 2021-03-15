package ru.site.calculator2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;

public class CalculatorEngine implements ActionListener {
	public void actionPerformed(ActionEvent e){
		
		// Получаем источник события
		JButton clickedButton = (JButton)e.getSource();

		// Получаем надпись на кнопке
		String clickedButtonLabel = clickedButton.getText();
		
		// Добавляем надпись на кнопке к тексту окна сообщения
		JOptionPane.showConfirmDialog(null,"Something happened...", "Just a test", JOptionPane.PLAIN_MESSAGE);
		
		}
	}
