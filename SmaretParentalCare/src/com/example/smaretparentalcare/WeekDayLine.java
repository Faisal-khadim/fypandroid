package com.example.smaretparentalcare;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;

import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.widget.ToggleButton;

public class WeekDayLine extends LinearLayout{
	private ToggleButton mon,tue,wed,thu,fri,sat,sun;
	@SuppressLint("InflateParams")
	public WeekDayLine(Context context, AttributeSet attrs) {
		super(context, attrs);
		// TODO Auto-generated constructor stub
	

	
	
		// TODO Auto-generated constructor stub
	


		// TODO Auto-generated constructor stub
		//setOrientation(LinearLayout.HORIZONTAL);
	   // setGravity(Gravity.CENTER_VERTICAL);

	    LayoutInflater inflater = (LayoutInflater) context
	            .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
	    
	        inflater.inflate(R.layout.weekdayline, this);
	
	    
	    
	        
	        mon = (ToggleButton) getChildAt(0);
	        tue = (ToggleButton) getChildAt(1);
	        wed = (ToggleButton) getChildAt(2);
	        thu = (ToggleButton) getChildAt(3);
	        fri = (ToggleButton) getChildAt(4);
	        sat = (ToggleButton) getChildAt(5);
	        sun = (ToggleButton) getChildAt(6);
	        
	        mon.setTextOff("Mon");
	        tue.setTextOff("Tue");
	        wed.setTextOff("Wed");
	        thu.setTextOff("Thu");
	        fri.setTextOff("Fri");
	        sat.setTextOff("Sat");
	        sun.setTextOff("Sun");

	}


		} 
 


