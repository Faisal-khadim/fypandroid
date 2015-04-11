package com.example.smaretparentalcare;

import java.util.ArrayList;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;

public class CallRecord extends Activity {

	
	ListView lvDetail;
    Context context = this;
    ArrayList<CallRecordData> myList = new ArrayList<CallRecordData>();
    
    String[] phoneNumber = new String[] {
            "03241113123", "023314122", "34314341123", "0031313133",
            "413453134"
    };
    
    String[]  sentCount  = new String[] {
            "23", "33", "11", "33",
            "2"
    };

    String[]  recvCount  = new String[] {
    		"41", "33", "23", "33", "12"
    };

    
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_call_record);
		
		lvDetail = (ListView) findViewById(R.id.list_callRecord);
        // insert data into the list before setting the adapter
        // otherwise it will generate NullPointerException  - Obviously
	    Log.d("yahan me", "nkk");
		getDataInList();
         lvDetail.setAdapter(new CallRecordBaseAdapter(context, myList));
	}
	
	void getDataInList(){
		for (int i=0;i<5;i++){
		CallRecordData d=new CallRecordData();
		d.setPhoneNumber(phoneNumber[i]);
		d.setSentCount(sentCount[i]);
		d.setRecvCount(recvCount[i]);
			myList.add(d);
			}
		
		}
		
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.call_record, menu);
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
