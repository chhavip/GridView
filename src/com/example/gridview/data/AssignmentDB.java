package com.example.gridview.data;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

public class AssignmentDB extends SQLiteOpenHelper {

	public static final String DATABASE="assignment";
	public static final String ASSIGNMENT_TABLE_NAME="assignment";
	public static final String ASSIGNMENT_NAME_COLUMN="name";
	public static final String ASSIGNMENT_DESCRIPTION_COLUMN="description";
	public static final String ASSIGNMENT_ID="id";
	public static final String ASSIGNMENT_DATE_COLUMN="date";
	public static final int VERSION=1;
	
	public AssignmentDB(Context context) {
		
		super(context,DATABASE,null,VERSION);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void onCreate(SQLiteDatabase db) {
		// TODO Auto-generated method stub
		Log.i("in Oncreate","of OpenHelper");		
		db.execSQL("CREATE TABLE"+" "+ASSIGNMENT_TABLE_NAME+"("+ASSIGNMENT_ID+
				   " "+"INTEGER PRIMARY KEY,"
		+" "+ASSIGNMENT_NAME_COLUMN+" "+"TEXT,"+" "
				+ASSIGNMENT_DESCRIPTION_COLUMN+" "+"TEXT,"
				+ASSIGNMENT_DATE_COLUMN+" "+"TEXT"+")");
		ContentValues cv=new ContentValues();
		cv.put(ASSIGNMENT_NAME_COLUMN," db  number one");
		cv.put(ASSIGNMENT_DESCRIPTION_COLUMN,"description 1");
		cv.put(ASSIGNMENT_DATE_COLUMN, "2001/01/02");
		//cv.put(ASSIGNMENT_DATE_COLUMN,"2000/20/01");
		db.insert(AssignmentDB.ASSIGNMENT_TABLE_NAME, null,cv);
		cv.clear();
		
		cv.put(ASSIGNMENT_NAME_COLUMN,"db no 2");
		cv.put(ASSIGNMENT_DESCRIPTION_COLUMN,"description 2");
		cv.put(ASSIGNMENT_DATE_COLUMN,"2000/20/02");
		db.insert(AssignmentDB.ASSIGNMENT_TABLE_NAME, null,cv);
		cv.clear();		
	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		// TODO Auto-generated method stub

	}

}
