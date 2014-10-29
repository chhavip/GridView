package com.example.gridview;

import java.util.List;



import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

public class CustomArrayAdapter extends ArrayAdapter<AssignmentObject> {

	private Context context;
	
	public CustomArrayAdapter(Context context, int resource,
			List<AssignmentObject> objects) {
				super(context, resource, objects);
				// TODO Auto-generated constructor stub
				this.context=context;	
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		// TODO Auto-generated method stub
		View output=convertView;
		if(output==null)
		{
			LayoutInflater inflator = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
			output=inflator.inflate(R.layout.assignment_view,null);
		}
		TextView Name=(TextView)output.findViewById(R.id.Name);
		TextView Description=(TextView)output.findViewById(R.id.Description);
		TextView Date=(TextView)output.findViewById(R.id.Date);
		AssignmentObject ob=this.getItem(position);
		Name.setText(ob.name);
		Description.setText(ob.Description);
		Date.setText(ob.lastdate+"");
		
		return output;
	}

	
}
