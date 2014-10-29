package com.example.gridview.data;

import com.example.gridview.R;
import com.example.gridview.SessionManager;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class UserData extends Activity {

	EditText userName,universityName,batchName,branchName;
	Button btSave;
	String name,university,batch,branch;
	Boolean isFirst;
	public static SharedPreferences pref;
	Editor editor;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.user_data);
		initialize();
		btSave.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				saveDataToPreferences();	
				callNextClass();
			}
		});
		
		
		
	}

	private void saveDataToPreferences() {
		// TODO Auto-generated method stub
		editor.putString("Name",name);
		editor.putString("University",university);
		editor.putString("Batch",batch);
		editor.putString("Branch",branch);
		editor.putBoolean("Is First",isFirst);
	
		editor.commit();
		
		
	}

	private void callNextClass() {
		// TODO Auto-generated method stub
		Class nextClass;
		try {
			nextClass = Class.forName("com.example.gridview.Table");
			Intent ourIntent=new Intent(UserData.this,nextClass);
			startActivity(ourIntent);
			finish();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private void initialize() {
		// TODO Auto-generated method stub
		userName=(EditText) findViewById(R.id.etUserName);
		universityName=(EditText) findViewById(R.id.etUniversity);
		batchName=(EditText) findViewById(R.id.etBatch);
		branchName=(EditText) findViewById(R.id.etBranch);
		btSave=(Button) findViewById(R.id.btSet);
		isFirst=false;
		
		pref=this.getSharedPreferences("User_Details",0);
		editor=pref.edit();
		
		name=userName.getText().toString();
		university=universityName.getText().toString();
		batch=batchName.getText().toString();
		branch=branchName.getText().toString();
	}
	

}
