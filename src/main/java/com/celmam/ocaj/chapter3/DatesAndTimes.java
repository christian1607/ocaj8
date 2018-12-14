package com.celmam.ocaj.chapter3;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class DatesAndTimes {

	public static void main(String... strings) {

		// Current Date Times
		LocalDate date = LocalDate.now();
		LocalTime time = LocalTime.now();
		LocalDateTime datetime = LocalDateTime.now();

		System.out.println("Fecha actual: "+date);
		System.out.println("Hora actual: "+time);
		System.out.println("Fecha y Hora actual: "+datetime);


		System.out.println("Restando un dia: "+date.plusDays(-1));

		
		
		// set specific dates

		int diaAnio=144;
		int anio=2018;
		System.out.println("El dia "+diaAnio+ " del anio "+anio+" fue: "+LocalDate.ofYearDay(anio,diaAnio));
		
		//You can specific year month and day
		System.out.println(LocalDate.of(2018, 1, 30));
		System.out.println("Maxima fecha soportada: "+LocalDate.MAX);
		System.out.println("Minima fecha soportada: "+LocalDate.MIN);
		System.out.println(LocalDate.of(2018, Month.JULY, 30));
		
		// You can set a date from another Date Time or DateTime
		System.out.println("from date: "+LocalDate.from(date));
		
		
		// In this case when the LocalDate.from(time), the parameter is an LocalTime, we get a exception
		// java.time.DateTimeException: Unable to obtain LocalDate from TemporalAccessor: 
		//System.out.println("from time: "+LocalDate.from(time));

		 
		// Get a exception when the minutes introduced is a invalid
		//System.out.println(LocalTime.of(18,69,25,500));

		// LocalTime

		System.out.println("Midnight: "+LocalTime.MIDNIGHT);
		System.out.println("Noon: "+LocalTime.NOON);
		System.out.println("Max Time: "+LocalTime.MAX);
		System.out.println("Min Time: "+LocalTime.MIN);
		
		int segundo=65555;
		System.out.println("El segundo "+ segundo+" del dia, es igual a "+LocalTime.ofSecondOfDay(segundo));
		
		
		
		
		//LocalDateTime
		
		//Can be composed from a date a time
		System.out.println("LocalDateTime compuesto: "+LocalDateTime.of(date, time));
			
		
		//OPERATIONS WITH DATES AND TIMES
		
		date = date.plusDays(2).minusDays(3);
		date = date.plusWeeks(1);
		System.out.println(date);
		//Metodo que retorna true si el la fecha corresponde a un anio bisiesto
		date.isLeapYear();
		System.out.println(date.isLeapYear());
		
		
		System.out.println(date.getDayOfMonth());
		System.out.println(date.getDayOfWeek());
		System.out.println(date.getDayOfYear());
		
		//Before or After Jesuscrist
		System.out.println(date.getEra());
		
		
		// Periods
		LocalDateTime fechaCumple = LocalDateTime.of(1993, 07, 13, 13, 30, 12, 500);
		System.out.println("Fecha Cumple==>" + fechaCumple);

		Period periodo = Period.ofDays(3);

		fechaCumple = fechaCumple.plus(periodo);
		System.out.println("Fecha Cumple Correjida====>" + fechaCumple);
		System.out.println("Naci un dia====>" + fechaCumple.getDayOfWeek());

		// Formating
		System.out.println("Formato Basico====>" + fechaCumple.format(DateTimeFormatter.BASIC_ISO_DATE));
		System.out.println("Formato ISO DATE====>" + fechaCumple.format(DateTimeFormatter.ISO_DATE));
		System.out.println("Formato ISO DATETIME====>" + fechaCumple.format(DateTimeFormatter.ISO_DATE_TIME));
		System.out.println("Formato Custom====>" + fechaCumple.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));

		DateTimeFormatter formatoPeru = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);
		System.out.println("Formato Corto====>" + fechaCumple.format(formatoPeru));


		//Parsing dates from String
		
		System.out.println(LocalDate.parse("1993-05-07").format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		
		LocalDate dates = LocalDate.parse("2018-04-30", DateTimeFormatter.ISO_LOCAL_DATE);
		System.out.println(dates);
		System.out.println(dates.getYear() + " " + dates.getMonth() + " " + dates.getDayOfMonth());

	}

}
