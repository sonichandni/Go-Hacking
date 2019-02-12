package com.example.gohacking;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.ImageButton;

public class Dashboard extends Activity {
	ImageButton db,dic,ns;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_dashboard);
		db = (ImageButton) findViewById(R.id.img_cat);
		dic = (ImageButton) findViewById(R.id.img_hdic);
		ns = (ImageButton) findViewById(R.id.img_news);
		db.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent i=new Intent(Dashboard.this,Home.class);
				startActivity(i);
				
			}
		});
		
		dic.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent i=new Intent(Dashboard.this,HackDictionary.class);
				startActivity(i);
				
			}
		});
		
		ns.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Uri uri = Uri.parse("https://thehackernews.com/");
				Intent intent = new Intent(Intent.ACTION_VIEW, uri);
				startActivity(intent);
				
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.dashboard, menu);
		return true;
	}

}
