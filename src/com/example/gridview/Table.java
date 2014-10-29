package com.example.gridview;




import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class Table extends ActionBarActivity {
	  TextView first;
	    TextView second;
	    TextView third;
	    TextView fourth;
	    TextView fifth;
	    TextView sixth;
	    TextView seventh;
	    TextView eighth;
	  
	    
	    
	    int flag1 = 0, flag2 = 0, flag3 = 0,flag4 = 0,flag5 = 0,flag6 = 0,flag7 = 0,flag8 = 0;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.table);
		Log.i("1","before");
		SharedPreferences sp=getSharedPreferences("User_Details",0);
		String msg=sp.getString("Name", "hahaha");
		Log.i("log",msg+"1");
		Log.i("2","after");
		 first = (TextView)findViewById(R.id.first_desc);
         second = (TextView)findViewById(R.id.second_desc);
         third = (TextView)findViewById(R.id.third_desc);
         fourth = (TextView)findViewById(R.id.fourth_desc);
         fifth = (TextView)findViewById(R.id.fifth_desc);
         sixth = (TextView)findViewById(R.id.sixth_desc);
         seventh = (TextView)findViewById(R.id.seventh_desc);
         eighth = (TextView)findViewById(R.id.eighth_desc);
         
         
         first.setOnLongClickListener(new View.OnLongClickListener() {
				
				@Override
				public boolean onLongClick(View arg0) {
					// TODO Auto-generated method stub
					first.setBackgroundResource(R.drawable.text_back);
					flag1 = 0;
					return true;
					
				}
			});
         first.setOnClickListener(new View.OnClickListener() {
				
				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					if(flag1 == 0){
					first.setBackgroundResource(R.drawable.text_back_click);
					flag1 = 1;
					}
					else{
						first.setBackgroundResource(R.drawable.text_double_click);
						
						
					}
				}
			});
         
         
         second.setOnLongClickListener(new View.OnLongClickListener() {
				
				@Override
				public boolean onLongClick(View arg0) {
					// TODO Auto-generated method stub
					second.setBackgroundResource(R.drawable.text_back);
					flag2 = 0;
					return true;
					
				}
			});
         second.setOnClickListener(new View.OnClickListener() {
				
				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					if(flag2 == 0){
					second.setBackgroundResource(R.drawable.text_back_click);
					flag2 = 1;
					}
					else{
						second.setBackgroundResource(R.drawable.text_double_click);
						
						
					}
				}
			});
         
         
         third.setOnLongClickListener(new View.OnLongClickListener() {
				
				@Override
				public boolean onLongClick(View arg0) {
					// TODO Auto-generated method stub
					third.setBackgroundResource(R.drawable.text_back);
					flag3 = 0;
					return true;
					
				}
			});
         third.setOnClickListener(new View.OnClickListener() {
				
				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					if(flag3 == 0){
					third.setBackgroundResource(R.drawable.text_back_click);
					flag3 = 1;
					}
					else{
						third.setBackgroundResource(R.drawable.text_double_click);
						
						
					}
				}
			});
         
         
         fourth.setOnLongClickListener(new View.OnLongClickListener() {
				
				@Override
				public boolean onLongClick(View arg0) {
					// TODO Auto-generated method stub
					fourth.setBackgroundResource(R.drawable.text_back);
					flag4 = 0;
					return true;
					
				}
			});
         fourth.setOnClickListener(new View.OnClickListener() {
				
				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					if(flag4 == 0){
					fourth.setBackgroundResource(R.drawable.text_back_click);
					flag4 = 1;
					}
					else{
						fourth.setBackgroundResource(R.drawable.text_double_click);
						
						
					}
				}
			});
         
         
         fifth.setOnLongClickListener(new View.OnLongClickListener() {
				
				@Override
				public boolean onLongClick(View arg0) {
					// TODO Auto-generated method stub
					fifth.setBackgroundResource(R.drawable.text_back);
					flag5 = 0;
					return true;
					
				}
			});
         fifth.setOnClickListener(new View.OnClickListener() {
				
				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					if(flag5 == 0){
					fifth.setBackgroundResource(R.drawable.text_back_click);
					flag5 = 1;
					}
					else{
						fifth.setBackgroundResource(R.drawable.text_double_click);
						
						
					}
				}
			});
         
         
         sixth.setOnLongClickListener(new View.OnLongClickListener() {
				
				@Override
				public boolean onLongClick(View arg0) {
					// TODO Auto-generated method stub
					sixth.setBackgroundResource(R.drawable.text_back);
					flag6 = 0;
					return true;
					
				}
			});
         sixth.setOnClickListener(new View.OnClickListener() {
				
				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					if(flag6 == 0){
					sixth.setBackgroundResource(R.drawable.text_back_click);
					flag6 = 1;
					}
					else{
						sixth.setBackgroundResource(R.drawable.text_double_click);
						
						
					}
				}
			});
         
         
         seventh.setOnLongClickListener(new View.OnLongClickListener() {
				
				@Override
				public boolean onLongClick(View arg0) {
					// TODO Auto-generated method stub
					seventh.setBackgroundResource(R.drawable.text_back);
					flag7 = 0;
					return true;
					
				}
			});
         seventh.setOnClickListener(new View.OnClickListener() {
				
				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					if(flag7 == 0){
					seventh.setBackgroundResource(R.drawable.text_back_click);
					flag7 = 1;
					}
					else{
						seventh.setBackgroundResource(R.drawable.text_double_click);
						
						
					}
				}
			});
         
         
         eighth.setOnLongClickListener(new View.OnLongClickListener() {
				
				@Override
				public boolean onLongClick(View arg0) {
					// TODO Auto-generated method stub
					eighth.setBackgroundResource(R.drawable.text_back);
					flag8 = 0;
					return true;
					
				}
			});
         eighth.setOnClickListener(new View.OnClickListener() {
				
				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					if(flag8 == 0){
					eighth.setBackgroundResource(R.drawable.text_back_click);
					flag8 = 1;
					}
					else{
						eighth.setBackgroundResource(R.drawable.text_double_click);
						
						
					}
				}
			});
     }
 
		
	

	@Override
	public boolean onCreateOptionsMenu(android.view.Menu menu) {
		// TODO Auto-generated method stub
		 super.onCreateOptionsMenu(menu);
		MenuInflater menuInflater=getMenuInflater();
		 menuInflater.inflate(R.menu.new_menu,menu);
		 
		 return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// TODO Auto-generated method stub
		switch(item.getItemId())
		{
		case R.id.contact_us:
			/*Class ourClass;
			try {
				ourClass = Class.forName("com.example.gridview.ContactUs");
				Intent ourIntent=new Intent(Table.this,ourClass);
				startActivity(ourIntent);
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}*/
			Intent i = new Intent();
			i.setAction(Intent.ACTION_VIEW);
			Uri mail = Uri.parse("mailto:akshayprshr95@gmail.com.com");
			i.setData(mail);
			startActivity(i);
			break;
		case R.id.options_menu:
			
			Class nextClass;
			try {
				nextClass = Class.forName("com.example.gridview.MainActivity");
				Intent ourIntent=new Intent(Table.this,nextClass);
				startActivity(ourIntent);
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
			break;
		}
		return true;
	}

}
