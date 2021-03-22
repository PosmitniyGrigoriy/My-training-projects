// ”рок от Book Yakov Fine

package ru.site.todaydate;

import java.text.SimpleDateFormat;
import java.util.Date;

// ≈сть 2 класса, которые охватывают большую часть потребностей при работе с датами и временем
// import java.util.Date; и import java.util.SimpleDateFormat;
// ¬ первом варианте будет подробна€ дата типа Fri Mar 12 11:20:25 VLAT 2021.
// ¬о втором случае можно укорачивать дату
// Ќиже написаны разные версии вериантов вывода даты и времени. “акже есть другие варианты в документации. ƒополнительные методы еще есть в java.util.Calendar.

public class Start {

	public static void main(String[] args) {
		
		// v1
		Date today = new Date();
		System.out.println("—егодн€: " + today);
		
		// v2
		SimpleDateFormat today2 = new SimpleDateFormat("dd-MM-yyyy");
		String formattedDate = today2.format(today);
		System.out.println(formattedDate);
		
		// v3
		today2 = new SimpleDateFormat("EEE, d MMMM yyyy");
		formattedDate = today2.format(today);
		System.out.println(formattedDate);
		
		// v4 (AM - с 00:00 до 12:00 - это день, PM - вечер).
		today2 = new SimpleDateFormat("hh:mm:ss a");
		formattedDate = today2.format(today);
		System.out.println(formattedDate);
		
		
	}

}
