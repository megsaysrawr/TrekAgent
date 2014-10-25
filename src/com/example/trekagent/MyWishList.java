package com.example.trekagent;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class MyWishList extends Activity {
 	final Context context = this;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_my_wish_list);

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.my_wish_list, menu);
		
		View.OnClickListener handler = new View.OnClickListener(){
	        public void onClick(View v) {
	            //we will use switch statement and just
	            //get thebutton's id to make things easier
	            switch (v.getId()) {
	                case R.id.Arusha:
	                    Intent intentArusha = new Intent(context, Arusha.class);
	                    startActivity(intentArusha);
	                    break;
	                case R.id.HongKong:
	                    Intent intentHongKong = new Intent(context, HongKong.class);
	                	startActivity(intentHongKong);
	                	break;
	                case R.id.LosAngeles:
	                	Intent intentLosAngeles = new Intent(context, LosAngeles.class);
	                	startActivity(intentLosAngeles);
	                    break;
	            }
	        }
		};
	        
	    //we will set the listeners
	    findViewById(R.id.Arusha).setOnClickListener(handler);
	    findViewById(R.id.HongKong).setOnClickListener(handler);
	    findViewById(R.id.LosAngeles).setOnClickListener(handler);
	    
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
