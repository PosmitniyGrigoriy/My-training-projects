// Урок от Java Blogger 007

package ru.site.constants;

import java.sql.SQLOutput;

public class Start {

	public static void main(String[] args) {
		
		// Константы пишутся с больших букв
		
		// Если так заносить данные, то пользователь может поменять логин и пароль и будут новые логины и пароль, по старым логину уже не сможет войти, так как система не увидит аккаунт. Чтобы логин нельзя было поменять, нужно по другому код делать.
//		String USERNAME = "IvanPetrov";
//		int PASSWORD = 123456;
//		
//		USERNAME = "NewLogin";
//		PASSWORD = 9478;
//				
//		System.out.println(USERNAME);
//		System.out.println(PASSWORD);
		
		
		
		// Когда добавил в логин final, то если ввести команду USERNAME = "NewLogin";, то уже пишет ошибку на этой строке, так как нельзя менять логин. final устанавливает 1 раз значение и его нельзя менять пользователю. В данном случае пользователь может поменять только пароль, и пароль меняется.
		final String USERNAME = "IvanPetrov";
		int PASSWORD = 123456;
		
		PASSWORD = 9478;
				
		System.out.println(USERNAME);
		System.out.println(PASSWORD);
		
		
	}
	
}
