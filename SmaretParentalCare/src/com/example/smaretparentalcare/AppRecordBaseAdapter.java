package com.example.smaretparentalcare;

import java.util.ArrayList;



import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class AppRecordBaseAdapter extends BaseAdapter{

    ArrayList myList = new ArrayList();
    LayoutInflater inflater;
    Context context;
    
    public AppRecordBaseAdapter(Context context, ArrayList myList) {
        this.myList = myList;
        this.context = context;
        inflater = LayoutInflater.from(this.context);        // only context can also be used
     
    }
 
	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return myList.size();
	}

	@Override
	public AppRecordData getItem(int position) {
		// TODO Auto-generated method stub
		return (AppRecordData)myList.get(position);
		
	}

	@Override
	public long getItemId(int position) {
		// TODO Auto-generated method stub
		return 0;
	}
	

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		// TODO Auto-generated method stub
		  MyViewHolder mViewHolder;
          
	    if(convertView == null) {
            convertView = inflater.inflate(R.layout.custom_app_record, null);
            mViewHolder = new MyViewHolder();
            convertView.setTag(mViewHolder);
	    }
	    else
	    {
	    	mViewHolder=(MyViewHolder)convertView.getTag();
	    }
	      mViewHolder.date = detail(convertView, R.id.text_phoneNumber, ((AppRecordData) myList.get(position)).getDate());
          mViewHolder.duration= detail(convertView, R.id.textView_sent_count,  ((AppRecordData) myList.get(position)).getDuration());
          	    
	    
    return convertView;
	
	}
	 private TextView detail(View v, int resId, String text) {
     
		 TextView tv = (TextView) v.findViewById(resId);
         tv.setText(text);
         return tv;
 }
	
	 private class MyViewHolder {

			
			public TextView date;
			public TextView duration;

	 }
 	}	
