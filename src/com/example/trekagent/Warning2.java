package com.example.trekagent;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class Warning2 extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_warning2);
	 	final Context context = this;

		 View.OnClickListener handler = new View.OnClickListener(){
		        public void onClick(View v) {
		            //we will use switch statement and just
		            //get thebutton's id to make things easier
		            switch (v.getId()) {
		                case R.id.OK:
		                    Intent intentCurrentLocation = new Intent(context, MainActivity.class);
		                    startActivity(intentCurrentLocation);
		                    break;
		            }
		        }
		 };
		 
		 findViewById(R.id.OK).setOnClickListener(handler);

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.warning2, menu);
		return true;
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
