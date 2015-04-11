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

public class CallRecordBaseAdapter extends BaseAdapter{

    ArrayList myList = new ArrayList();
    LayoutInflater inflater;
    Context context;
    
    public CallRecordBaseAdapter(Context context, ArrayList myList) {
        this.myList = myList;
        this.context = context;
        inflater = LayoutInflater.from(this.context);        // only context can also be used
        Log.d("aa gya baseadapter me", "ds");
    }
 
	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return myList.size();
	}

	@Override
	public CallRecordData getItem(int position) {
		// TODO Auto-generated method stub
		return (CallRecordData)myList.get(position);
		
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
            convertView = inflater.inflate(R.layout.custom_call_record, null);
            mViewHolder = new MyViewHolder();
            convertView.setTag(mViewHolder);
	    }
	    else
	    {
	    	mViewHolder=(MyViewHolder)convertView.getTag();
	    }
	      mViewHolder.phoneNumber = detail(convertView, R.id.text_phoneNumber, ((CallRecordData) myList.get(position)).getphoneNumber());
          mViewHolder.sentCount= detail(convertView, R.id.textView_sent_count,  ((CallRecordData) myList.get(position)).getSentCount());
          mViewHolder.recvCount= detail(convertView, R.id.textView_recv_count,  ((CallRecordData) myList.get(position)).getRecvCount());
    
	    
	    
    return convertView;
	
	}
	 private TextView detail(View v, int resId, String text) {
     
		 TextView tv = (TextView) v.findViewById(resId);
         tv.setText(text);
         return tv;
 }
	
	 private class MyViewHolder {

			
			public TextView phoneNumber;
			public TextView sentCount;
			public TextView recvCount;
			}	

}
