package com.example.smaretparentalcare;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.preference.Preference;
import android.preference.Preference.OnPreferenceChangeListener;
import android.preference.Preference.OnPreferenceClickListener;
import android.preference.PreferenceFragment;
import android.preference.PreferenceManager;
import android.preference.SwitchPreference;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class SetPrefs extends PreferenceFragment {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		addPreferencesFromResource(R.layout.pref_show);
		
		 
		
		SwitchPreference sp=(SwitchPreference)findPreference("keyToBlockCall");
		
		sp.setOnPreferenceChangeListener(new OnPreferenceChangeListener(){

			@Override
			public boolean onPreferenceChange(Preference preference,
					Object newValue) {
				// TODO Auto-generated method stub
				Boolean b=(Boolean)newValue;
				if(b==true){
					Intent i=new Intent(getActivity().getApplicationContext(),BlockTimeActivity.class);
					startActivity(i);

				}
				else
				{
					
				}
		return true;
			}
			
		});
	
		
		
		//		if(sp.isChecked())
//		{
//			
//		}
//		if(sp.isEnabled())
//		{
//			
//		}
		
		
//		sp.setOnPreferenceClickListener(new OnPreferenceClickListener(){
//
//			@SuppressLint("ShowToast") @Override
//			public boolean onPreferenceClick(Preference preference) {
//				// TODO Auto-generated method stub
//				Log.d("inside ", "Working");
//				
//				
//				return false;
//			}
//			
//		});
		
		
		int a=10;
		if(sp.getSwitchTextOn()!="ON"||a==10)
		{
			Toast.makeText(getActivity(),"Aaaaa", Toast.LENGTH_SHORT);	
		}
		else 
		{
			Toast.makeText(getActivity(),"sdfksd", Toast.LENGTH_SHORT);
		}
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
