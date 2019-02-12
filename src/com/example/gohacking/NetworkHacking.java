package com.example.gohacking;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.widget.TextView;

public class NetworkHacking extends Activity {
TextView tv;
String nh;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_network_hacking);
		tv = (TextView) findViewById(R.id.nwhc);
		nh="network hacking is the process of recovering secret passwords from data that has been stored in or transmitted by a computer system. A common approach is to repeatedly try guesses for the password. Most passwords can be cracked by using following techniques :"
+" 1)Hashing :" +
           " Here we will refer to the one way function (which may be either an encryption function or cryptographic hash) employed as a hash and its output as a hashed password. If a system uses a reversible function to obscure stored passwords, exploiting that weakness can recover even 'well-chosen' passwords.One example is the LM hash that Microsoft Windows uses by default to store user passwords that are less than 15 characters in length. LM hash breaks the password into two 7-character fields which are then hashed separately, allowing each half to be attacked separately.";
            		
		tv.setText(nh);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.network_hacking, menu);
		return true;
	}

}
