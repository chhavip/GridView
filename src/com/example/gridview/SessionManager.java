package com.example.gridview;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;

public class SessionManager extends Activity {

	SharedPreferences pref;
	Boolean isFirst;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		pref=getSharedPreferences("User_Details",Context.MODE_PRIVATE);
		isFirst=pref.getBoolean("Is First",true);
		
		if(isFirst)
		{
			Class nextClass;
			try {
				nextClass = Class.forName("com.example.gridview.data.UserData");
				Intent ourIntent=new Intent(SessionManager.this,nextClass);
				startActivity(ourIntent);
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		else
		{
			Class nextClass;
			try {
				nextClass = Class.forName("com.example.gridview.Table");
				Intent ourIntent=new Intent(SessionManager.this,nextClass);
				startActivity(ourIntent);
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}
		
		
		
		
	}
	

}
