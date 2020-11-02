package com.cybage;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.TemporalAdjusters;
import java.util.Calendar;
import java.util.Date;

//Write a Java program to get the last date of the month also get current full date and time.(use
//java 8 date time api)
public class Assignment1 {

	public static void main(String[] args) {
		
		//current date and time
		LocalDate date = LocalDate.now();
		LocalTime time = LocalTime.now();
		System.out.println("current date "+date + " current time "+ time);
		
		// last day of current month      
        LocalDate lastDay =  
                  date.with(TemporalAdjusters. 
                            lastDayOfMonth()); 
          
        System.out.println("lastDayOfMonth : " +  
                            lastDay); 
	}
}
