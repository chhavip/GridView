package com.example.gridview;



import java.util.ArrayList;


import com.example.gridview.data.AssignmentDB;

import android.app.AlertDialog;
import android.content.ContentValues;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;

public class Assignment extends ActionBarActivity {

	ListView lv;
	ArrayList<AssignmentObject> list;
	CustomArrayAdapter ad;
	AssignmentDB mhelper=new AssignmentDB(this);
	public static SQLiteDatabase database;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.assignment);
		
		lv=(ListView) findViewById(R.id.lvAssignment);
		list=new ArrayList<AssignmentObject>();
		
		String[] assign={"no 1","no 2","no 3"};
		for(String s:assign)
		{
			if(s.equals("no 1"))
			{
				AssignmentObject ob=new AssignmentObject("no 1","this is 1","10","21","2014");
				list.add(ob);
			}
			if(s.equals("no 2"))
			{
				AssignmentObject ob=new AssignmentObject("no 2","this is 2","11","02","1998");
				list.add(ob);
			}
		}
		ad=new CustomArrayAdapter(this,0,list);
		lv.setAdapter(ad);
		
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// TODO Auto-generated method stub
		MenuInflater inflater=getMenuInflater();
		inflater.inflate(R.menu.assignment_menu, menu);
		
		return super.onCreateOptionsMenu(menu);
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// TODO Auto-generated method stub
		int id = item.getItemId();
		if(id==R.id.add)
		{
			AlertDialog.Builder b=new AlertDialog.Builder(this);
			b.setTitle("Add New Assignment:");
			Log.i("inside ","builder");
			LayoutInflater inflator=(LayoutInflater)this.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
			final View output=inflator.inflate(R.layout.add_new_assignment,null);
			Log.i("view ","inflated");
			b.setView(output);
			Log.i("view ","set");
			b.setPositiveButton("add",new OnClickListener(){

				@Override
				public void onClick(DialogInterface dialog, int which) {
					// TODO Auto-generated method stub
				
					EditText edName=(EditText) output.findViewById(R.id.etAssignmentName);
					EditText edDesc=(EditText) output.findViewById(R.id.etAssignmentDescription);
					EditText edMonth=(EditText) output.findViewById(R.id.etMonth);
					EditText edDay=(EditText) output.findViewById(R.id.etDate);
					EditText edYear=(EditText) output.findViewById(R.id.etYear);
					String date=edYear.getText().toString()+"/"
						+edMonth.getText().toString()+"/"
						+edDay.getText().toString();
				
					database=mhelper.getWritableDatabase();
					ContentValues cv=new ContentValues();
					cv.put(mhelper.ASSIGNMENT_NAME_COLUMN,edName.getText().toString());
					cv.put(mhelper.ASSIGNMENT_DESCRIPTION_COLUMN,edDesc.getText().toString());
					cv.put(mhelper.ASSIGNMENT_DATE_COLUMN,date);
					database.insert(AssignmentDB.ASSIGNMENT_TABLE_NAME, null,cv);
					cv.clear();
						
					readFromDatabase();
		
				}
			});
			b.create().show();
		}
		
		return super.onOptionsItemSelected(item);
	}
	void readFromDatabase()
	{
	
		list.clear();
		SQLiteDatabase db=mhelper.getReadableDatabase();
		String columns[]={mhelper.ASSIGNMENT_NAME_COLUMN,mhelper.ASSIGNMENT_DESCRIPTION_COLUMN,mhelper.ASSIGNMENT_DATE_COLUMN};
		Cursor c=db.query(true,mhelper.ASSIGNMENT_TABLE_NAME,columns,null,null,null,null,null,null);
		while(c.moveToNext())
		{
			String name=c.getString(c.getColumnIndexOrThrow(mhelper.ASSIGNMENT_NAME_COLUMN));
			String des=c.getString(c.getColumnIndexOrThrow(mhelper.ASSIGNMENT_DESCRIPTION_COLUMN));
			String date=c.getString(c.getColumnIndexOrThrow(mhelper.ASSIGNMENT_DATE_COLUMN));
		
			list.add(new AssignmentObject(name,des,date));
			ad.notifyDataSetChanged();
	
		
		}
	}
}
