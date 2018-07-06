package com.celmam.ocaj.chapter3;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class DatesAndTimes {

	public static void main(String... strings) {

		// Current Date Times
		LocalDate date = LocalDate.now();
		LocalTime time = LocalTime.now();
		LocalDateTime datetime = LocalDateTime.now();

		System.out.println(date);
		System.out.println(time);
		System.out.println(datetime);

		// set specific dates

		System.out.println(LocalDate.of(2018, 1, 30));
		System.out.println(LocalDate.of(2018, Month.JULY, 30));

		// System.out.println(LocalTime.of(18,69,25,500));

		//

		date = date.plusDays(2).minusDays(3);
		date = date.plusWeeks(1);
		System.out.println(date);

		// Periods
		LocalDateTime fechaCumple = LocalDateTime.of(1993, 07, 13, 13, 30, 12, 500);
		System.out.println("Fecha Cumple==>" + fechaCumple);

		Period periodo = Period.ofDays(3);

		fechaCumple = fechaCumple.plus(periodo);
		System.out.println("Fecha Cumple Correjida====>" + fechaCumple);
		System.out.println("Naci un dia====>" + fechaCumple.getDayOfWeek());

		// Formating
		System.out.println("Formato Basico====>" + fechaCumple.format(DateTimeFormatter.BASIC_ISO_DATE));
		System.out.println("Formato Basico====>" + fechaCumple.format(DateTimeFormatter.ISO_DATE));
		System.out.println("Formato Basico====>" + fechaCumple.format(DateTimeFormatter.ISO_DATE_TIME));
		System.out.println("Formato Basico====>" + fechaCumple.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));

		DateTimeFormatter formatoPeru = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);
		System.out.println("Formato Corto====>" + fechaCumple.format(formatoPeru));

		LocalDate dates = LocalDate.parse("2018-04-30", DateTimeFormatter.ISO_LOCAL_DATE);
		dates.plusDays(2);

		System.out.println(dates.getYear() + " " + dates.getMonth() + " " + dates.getDayOfMonth());

	}

}
