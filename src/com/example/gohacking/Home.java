package com.example.gohacking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class Home extends Activity {
ListView lv;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_home);
		final ListView lv = (ListView) findViewById(R.id.list_catg);
		String[] fruits = new String[] {
                "Network Hacking",
                "Password Hacking",
                "Email Hacking",
                "Wireless Hacking",
                "Cool Hacks"
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
                if(selectedItem=="Network Hacking")
                {
                	Intent i=new Intent(Home.this,NetworkHacking.class);
                	startActivity(i);
                }
                if(selectedItem == "Password Hacking")
                {
                	Intent i=new Intent(Home.this,PasswordHacking.class);
                	startActivity(i);
                }
                if(selectedItem == "Email Hacking")
                {
                	Intent i=new Intent(Home.this,EmailHacking.class);
                	startActivity(i);
                }
                if(selectedItem == "Wireless Hacking")
                {
                	Intent i=new Intent(Home.this,WirelessHacking.class);
                	startActivity(i);
                }
                if(selectedItem == "Cool Hacks")
                {
                	Intent i=new Intent(Home.this,CoolHacks.class);
                	startActivity(i);
                }
                
            }
        });
    
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.home, menu);
		return true;
	}

}
