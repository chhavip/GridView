package com.example.gridview;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import android.util.Log;

public class AssignmentObject {
	
	String name;
	String Description;
	Date lastdate;
	
	AssignmentObject(String name,String description,String mm,String dd,String yyyy)
	{
		this.name=name;
		this.Description=description;
		
		int month=Integer.parseInt(mm);
		int day=Integer.parseInt(dd);
		int year=Integer.parseInt(yyyy);
		SimpleDateFormat format=new SimpleDateFormat("yyyy-MM-dd");
		String dat=format.format(new Date(year,month,day));
		Log.i("date",dat);
		Log.i("year",""+year);
		try {
			Date date=format.parse(dat);
			this.lastdate=date;
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	AssignmentObject(String name,String description,String date)
	{
		this.name=name;
		this.Description=description;
		
		int dat=Integer.parseInt(date);
		SimpleDateFormat format=new SimpleDateFormat("yyyy-MM-dd");
		
		try {
			Date dated=format.parse(date);
			this.lastdate=dated;
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
