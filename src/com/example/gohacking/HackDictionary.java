package com.example.gohacking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class HackDictionary extends Activity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_hack_dictionary);
		
		final ListView lv = (ListView) findViewById(R.id.lv_dict);
		String[] fruits = new String[] {
                "Bug","Botnet","Chip-off","Cracker","Attribution"
        };
		// Create a List from String Array elements
        List<String> fruits_list = new ArrayList<String>(Arrays.asList(fruits));

        // Create an ArrayAdapter from List
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>
                (this, android.R.layout.simple_list_item_1, fruits_list){
            @Override
            public View getView(int position, View convertView, ViewGroup parent){
                // Get the Item from ListView
                View view = super.getView(position, convertView, parent);

                // Initialize a TextView for ListView each Item
                TextView tv = (TextView) view.findViewById(android.R.id.text1);

                // Set the text color of TextView (ListView Item)
                tv.setTextColor(Color.GREEN);

                // Generate ListView Item using TextView
                return view;
            }
        };

        // DataBind ListView with items from ArrayAdapter
        lv.setAdapter(arrayAdapter);
     // Set an item click listener for ListView
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                // Get the selected item text from ListView
                String selectedItem = (String) parent.getItemAtPosition(position);

                // Display the selected item text on TextView
                //Toast.makeText(getApplicationContext(), selectedItem, Toast.LENGTH_LONG).show();
                if(selectedItem=="Bug")
                {
                	AlertDialog alertDialog = new AlertDialog.Builder(HackDictionary.this).create();
                	alertDialog.setTitle("Bug");
                	alertDialog.setMessage("A software bug is an error, flaw, failure or fault in a computer program or system that causes it to produce an incorrect or unexpected result, or to behave in unintended ways");
                	alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "OK",
                	    new DialogInterface.OnClickListener() {
                	        public void onClick(DialogInterface dialog, int which) {
                	            dialog.dismiss();
                	        }
                	    });
                	alertDialog.show();
                }
                if(selectedItem == "Botnet")
                {
                	AlertDialog alertDialog = new AlertDialog.Builder(HackDictionary.this).create();
                	alertDialog.setTitle("Botnet");
                	alertDialog.setMessage("A botnet is a number of Internet-connected devices, each of which is running one or more bots. Botnets can be used to perform distributed denial-of-service attack, steal data, send spam, and allows the attacker to access the device and its connection.");
                	alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "OK",
                	    new DialogInterface.OnClickListener() {
                	        public void onClick(DialogInterface dialog, int which) {
                	            dialog.dismiss();
                	        }
                	    });
                	alertDialog.show();
                }
                if(selectedItem == "Chip-off")
                {
                	AlertDialog alertDialog = new AlertDialog.Builder(HackDictionary.this).create();
                	alertDialog.setTitle("Chip-off");
                	alertDialog.setMessage("Chip-off forensics is an advanced digital data extraction and analysis technique which involves physically removing flash memory chip(s) from a subject device and then acquiring the raw data using specialized equipment.");
                	alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "OK",
                	    new DialogInterface.OnClickListener() {
                	        public void onClick(DialogInterface dialog, int which) {
                	            dialog.dismiss();
                	        }
                	    });
                	alertDialog.show();
                }
                if(selectedItem == "Cracker")
                {
                	AlertDialog alertDialog = new AlertDialog.Builder(HackDictionary.this).create();
                	alertDialog.setTitle("Cracker");
                	alertDialog.setMessage("Crackers, also known as malicious hackers and black-hat hackers, are different because although they have the same skills as a hacker, they use their power to commit criminal acts.");
                	alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "OK",
                	    new DialogInterface.OnClickListener() {
                	        public void onClick(DialogInterface dialog, int which) {
                	            dialog.dismiss();
                	        }
                	    });
                	alertDialog.show();
                }
                if(selectedItem == "Attribution")
                {
                	AlertDialog alertDialog = new AlertDialog.Builder(HackDictionary.this).create();
                	alertDialog.setTitle("Attribution");
                	alertDialog.setMessage("Attribution is the process of tracking, identifying and laying blame on the perpetrator of a cyberattack or other hacking exploit.");
                	alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "OK",
                	    new DialogInterface.OnClickListener() {
                	        public void onClick(DialogInterface dialog, int which) {
                	            dialog.dismiss();
                	        }
                	    });
                	alertDialog.show();
                }
                
            }
        });
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.hack_dictionary, menu);
		return true;
	}

}
