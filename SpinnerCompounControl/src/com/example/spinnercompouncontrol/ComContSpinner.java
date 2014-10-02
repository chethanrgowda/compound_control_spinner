package com.example.spinnercompouncontrol;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;

public class ComContSpinner extends Spinner {
	private SelectCompany selectListener ;
    private String[] items = { 
    		"Google", "IBM", "Microsoft", "Accenture", "Cisco", "Dell", "Oracle", "Facebook"
    };
	public ComContSpinner(Context context, AttributeSet attrs) {
		super(context, attrs);
		this.setAdapter(new ArrayAdapter(context, android.R.layout.simple_spinner_item, items));
		this.setOnItemSelectedListener(new OnItemSelectedListener(){

			@Override
			public void onItemSelected(AdapterView<?> parent, View view,
					int position, long id) {
				//Log.d("Select", "item: " + parent.getItemAtPosition(position).toString());
				Adapter adpt = parent.getAdapter();
				String item = (String) adpt.getItem(position);
	            
				selectListener.onSelection(item); // crashing line
				
			}

			@Override
			public void onNothingSelected(AdapterView<?> parent) {
				// TODO Auto-generated method stub
				
			}
			
		});
	}

}
