package com.repo.javaLib;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormat {

	static String dateAndTime(){
		/*
		 * To DO: check for parsing date
		 */
		SimpleDateFormat pattern = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		String date = pattern.format(new Date());
		return date;
	}
	
	static Date parsingDate(){
		String pattern = "yyyy-MM-dd";
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
		Date date = null;
		try {
			date = simpleDateFormat.parse("2012-12-24");
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return date;
	}
	
	public static void main(String[] args){
		System.out.println(parsingDate());
	}
}
