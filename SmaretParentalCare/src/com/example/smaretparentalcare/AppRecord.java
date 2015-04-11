package com.example.smaretparentalcare;

import java.util.ArrayList;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;

public class AppRecord extends Activity {

	
	ListView lvDetail;
    Context context = this;
    ArrayList<AppRecordData> myList = new ArrayList<AppRecordData>();
    
    String[] date = new String[] {
            "03241113123", "023314122", "34314341123", "0031313133",
            "413453134"
    };
    
    String[]  duration  = new String[] {
            "23", "33", "11", "33",
            "2"
    };
 
    
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_app_record);
		
		lvDetail = (ListView) findViewById(R.id.list_appRecord);
        // insert data into the list before setting the adapter
        // otherwise it will generate NullPointerException  - Obviously
	    
		getDataInList();
         lvDetail.setAdapter(new AppRecordBaseAdapter(context, myList));
	}
	
	void getDataInList(){
		for (int i=0;i<5;i++){
		AppRecordData d=new AppRecordData();
		d.setDate(date[i]);
		d.setDuration(duration[i]);
			myList.add(d);
			}
		
		}
		
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.app_record , menu);
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
