package com.example.gridview;

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

public class MainActivity extends ActionBarActivity {
	
	GridView gridViewList;
	String[] gridItemNames={"Assignment","Self","Notifications","Calender"
			,"Events","About Us"};
	ArrayList<GridViewItem> list;
	String[] classes={"Assignment","Self","Notifications","Calender","Events","AboutUs"};
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		initialise();
		
		for(String s: gridItemNames)
		{
			if(s.equals("Assignment"))
			{
				GridViewItem item=new GridViewItem("Assignment",R.drawable.assignment);
				list.add(item);
			}
			if(s.equals("Self"))
			{
				GridViewItem item=new GridViewItem("Self",R.drawable.self);
				list.add(item);
			}
			if(s.equals("Notifications"))
			{
				GridViewItem item=new GridViewItem("Notifications",R.drawable.notification);
				list.add(item);
			}
			if(s.equals("Calender"))
			{
				GridViewItem item=new GridViewItem("Calender",R.drawable.calender);
				list.add(item);
			}
			if(s.equals("Events"))
			{
				GridViewItem item=new GridViewItem("Events",R.drawable.event);
				list.add(item);
			}
			if(s.equals("About Us"))
			{
				GridViewItem item=new GridViewItem("About Us",R.drawable.about);
				list.add(item);
			}
			
		}
		gridViewList.setAdapter(new GridAdapter(this,0,0,list));
		gridViewList.setOnItemClickListener(new OnItemClickListener(){

			@Override
			public void onItemClick(AdapterView<?> parent, View view,
					int position, long id) {
				// TODO Auto-generated method stub
				String open=classes[position];
				try {
					Class ourClass = Class.forName("com.example.gridview."+open);
					Intent ourIntent=new Intent(MainActivity.this,ourClass);
					startActivity(ourIntent);
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				
			}
		});
		
	}

	private void initialise() {
		// TODO Auto-generated method stub
		gridViewList=(GridView) findViewById(R.id.gvList);
		list=new ArrayList<GridViewItem>();
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}

}
