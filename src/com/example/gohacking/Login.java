package com.example.gohacking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;
import org.json.JSONException;
import org.json.JSONObject;

import android.app.Activity;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.itextpdf.text.List;

public class Login extends Activity {
EditText uid,pwd;
Button login,reg;


	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_login);
		uid = (EditText) findViewById(R.id.uid_login);
		pwd = (EditText) findViewById(R.id.pwd_login);
		login = (Button) findViewById(R.id.bt_login);
		reg = (Button) findViewById(R.id.bt_reg);
		
		login.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				//new sampleDemo().execute();
				Intent i=new Intent(Login.this,Dashboard.class);
				startActivity(i);
				
			}
		});
		reg.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent i=new Intent(Login.this,Registration.class);
				startActivity(i);
				
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.login, menu);
		return true;
	}
	
	private class sampleDemo extends AsyncTask<Object, Object, Object>
    {

		@Override
		protected Object doInBackground(Object... params) {
			// TODO Auto-generated method stub
			HttpClient client=new DefaultHttpClient();
			HttpPost post=new HttpPost("http://10.0.2.2/login.php");
			StringBuilder sb=new StringBuilder();
			HttpResponse response;
			try {
				
				JSONObject obj=new JSONObject();
				obj.put("userid",uid.getText().toString());
				
				obj.put("pwd", pwd.getText().toString());
				
				ArrayList<NameValuePair> namevaluepair=new ArrayList<NameValuePair>(2);
				
				namevaluepair.add(new BasicNameValuePair("webdata",obj.toString()));
				
				UrlEncodedFormEntity o=new UrlEncodedFormEntity(namevaluepair);
				post.setEntity(o);
				response = client.execute(post);
				BufferedReader br=new BufferedReader(new InputStreamReader(response.getEntity().getContent()));
				String s;
				while((s=br.readLine())!=null)
				{
					sb.append(s);
					
				}
					
				br.close();
				return sb.toString();
			} catch (ClientProtocolException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (JSONException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			return null;
		}
    	
    }
	
	 protected void onPostExecute(Object o)
		{//Toast.makeText(getApplicationContext(), "hello", Toast.LENGTH_LONG).show();
		
		
		 Toast.makeText(getApplicationContext(), o.toString(), Toast.LENGTH_LONG).show();
		 if(o.equals("Success"))
		 {
			 Intent i=new Intent(getApplicationContext(),Home.class);
			 startActivity(i);
		 }
			
		
			
		}
    
}
