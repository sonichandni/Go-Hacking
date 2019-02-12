package com.example.gohacking;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.TextView;

public class CoolHacks extends Activity {
	TextView tv;
	String nh;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_cool_hacks);
		tv = (TextView) findViewById(R.id.clhc);
		
		nh="Know the OS’s Hidden Features"+
		"Every operating system (OS) has its own tricks and features hidden under the hood. System tweakers such as OnyX for Mac and Ultimate Windown Tweaker are simply great for finding secret features. If you are a Windows user, you can learn how to hide secret data inside a file, cascade specific windows or undo an accidental file move."+

		"As a Mac user, discover how to create search tokens when searching for specific files, manage the privacy settings of an app or automatically restart your computer when it freezes.";
		
		tv.setText(nh);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.cool_hacks, menu);
		return true;
	}

}
