package com.example.smaretparentalcare;

import java.util.ArrayList;

import com.example.smaretparentalcare.ListData;
import android.app.Activity;
import android.app.ListActivity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class Stats extends Activity {

	ListView lvDetail;
    Context context = Stats.this;
    ArrayList myList = new ArrayList();
    
    String[] names = new String[] {
                    "Ali", "Ahmad", "Faraz", "Alia",
                    "Alisha"
    };
    String[] location  = new String[] {
                    "Ichra, Lahore", "Jain-mandar, Lahore", "Kohat", "F/8, ISD",
                    "Ichra, Lahore"
    };
    
    String[] stats  = new String[] {
            "Call:13 | SMS: 28", "Call:5 | SMS: 18", "Call:31 | SMS: 118", "Call:3 | SMS: 2",
            "Call:43 | SMS: 128"
};

    int[]    img   = new int[]          {
    		  R.drawable.c1, R.drawable.c2, R.drawable.c3, R.drawable.c4,
              R.drawable.c5
    };
	
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_stats);
		
		lvDetail = (ListView) findViewById(R.id.lvCustomList);
        // insert data into the list before setting the adapter
        // otherwise it will generate NullPointerException  - Obviously
        getDataInList();
        lvDetail.setAdapter(new MyBaseAdapter(context, myList));
        
        
        lvDetail.setOnItemClickListener(new OnItemClickListener(){

			@Override
			public void onItemClick(AdapterView<?> parent, View view,
					int position, long id) {
				// TODO Auto-generated method stub
				Intent i= new Intent(context,DetailActivity.class);
				
				startActivity(i);	
			}
        });
            	
        	
	}
/*        lvDetail.setOnItemSelectedListener(new OnItemSelectedListener() {
      
			@Override
			public void onItemSelected(AdapterView<?> parent, View view,
					int position, long id) {
			
				// TODO Auto-generated method stub
				Log.d("list Cliked", "ho gayaa ");
	        	TextView textView = (TextView) findViewById( android.R.id.text1 );
	        	toast( (String) textView.getText() );
			}

			@Override
			public void onNothingSelected(AdapterView<?> parent) {
				// TODO Auto-generated method stub
				
			}
        });
	}*/

	
	protected void onListItemClick(ListView l, View v, int position, long id) {
		// TODO Auto-generated method stub
		//super.onListItemClick(l, v, position, id);
		
		Log.d("list Cliked", "ho gayaa :P");
	    TextView textView = (TextView) v.findViewById( android.R.id.text1 );
	    toast( (String) textView.getText() );
	}
	
	private void toast( String text )
	{
	    Toast.makeText( this,
	        String.format( "Item clicked: %s", text ), Toast.LENGTH_SHORT )
	        .show();
	}
	
	
	@SuppressWarnings("unchecked")
	  private void getDataInList() {
          for(int i=0;i<5;i++) {
                  // Create a new object for each list item
                  ListData ld = new ListData();
                  ld.setChildName(names[i]);
                  ld.setChildLocation(location[i]);
                  ld.setStats(stats[i]);
                  ld.setImgResId(img[i]);
                  // Add this object into the ArrayList myList
                  myList.add(ld);
          }
  }
	
	 
}


 





