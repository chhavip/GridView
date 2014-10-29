package com.example.gridview;

import java.util.ArrayList;
import java.util.List;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;

public class GridAdapter extends ArrayAdapter  {

	public GridAdapter(Context context, int resource, int textViewResourceId,
			ArrayList<GridViewItem> list ) {
		super(context, resource, textViewResourceId,list);
		// TODO Auto-generated constructor stub
		this.context=context;
	}

	private Context context;
	private String[] gridItemValues;
	ImageView ivImage;
	TextView tvText;
	ArrayList<GridViewItem> list;
	View gridView;
	LayoutInflater inflator;
	
	
	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		// TODO Auto-generated method stub
		Log.i("inside adapter","2");
		inflator=(LayoutInflater)context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
		
		if(convertView==null)
		{
			gridView=new View(context);
			gridView=inflator.inflate(R.layout.custom_grid_view, null);
			initialise();
			GridViewItem gotItem=(GridViewItem) this.getItem(position);
			tvText.setText(gotItem.itemName);
			ivImage.setImageResource(gotItem.imagePath);
			
			
		}
		
		return gridView;
	}

	private void initialise() {
		// TODO Auto-generated method stub
		tvText=(TextView) gridView.findViewById(R.id.tvText);
		ivImage=(ImageView) gridView.findViewById(R.id.ivImage);
	}

}
