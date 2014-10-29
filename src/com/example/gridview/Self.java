package com.example.gridview;


import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.widget.TextView;
import java.util.ArrayList;

import android.support.v7.app.ActionBarActivity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.GridView;
import com.example.gridview.data.*;

public class Self extends ActionBarActivity{
	String name,university,batch,branch;

SharedPreferences pref;
@Override
protected void onCreate(Bundle savedInstanceState) {
	super.onCreate(savedInstanceState);
	setContentView(com.example.gridview.R.layout.selfie);
	SharedPreferences sp = getSharedPreferences("User_Details",  Context.MODE_PRIVATE); 
	
	name=sp.getString("Name",name);
	university=sp.getString("University",university);
	batch=sp.getString("Batch",batch);
	branch=sp.getString("Branch",branch);
	TextView t1=(TextView)findViewById(com.example.gridview.R.id.editText4);
	TextView t2=(TextView)findViewById(com.example.gridview.R.id.editText1);
	TextView t3=(TextView)findViewById(com.example.gridview.R.id.editText2);
	TextView t4=(TextView)findViewById(com.example.gridview.R.id.editText3);
	Log.i(name,"archit");

	t1.setText(name);
	Log.i(name,t1.getText().toString());
	t2.setText(university);
	t3.setText(batch);
	t4.setText(branch);

}
}
