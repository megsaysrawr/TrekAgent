//this is a comment
package com.example.trekagent;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import android.view.Menu;
import android.view.MenuInflater;
import android.content.Context;
 
public class MainActivity extends Activity {
/** Called when the activity is first created. */
	 private CountDownTimer countDownTimer;
	 public TextView text;
	 private final long startTime = 10 * 1000;
	 private final long interval = 1 * 1000;
 	 final Context context = this;
 	 static boolean warningFlag = false;

	@Override
	public void onCreate(Bundle savedInstanceState) {
	    super.onCreate(savedInstanceState);
	    setContentView(R.layout.activity_main);
	    if (!warningFlag)
	    {
	    	warningFlag = true;
	    	text = (TextView) this.findViewById(R.id.timer);
	   	 	countDownTimer = new MyCountDownTimer(startTime, interval);
	   	 	countDownTimer.start();
	    }
	    try {
	    View.OnClickListener handler = new View.OnClickListener(){
	        public void onClick(View v) {
	            //we will use switch statement and just
	            //get thebutton's id to make things easier
	            switch (v.getId()) {
	                case R.id.CurrentLocation:
	                    Toast.makeText(getBaseContext(), "You Clicked Current Location", Toast.LENGTH_SHORT).show();
	                    Intent intentCurrentLocation = new Intent(context, CurrentLocation.class);
	                    startActivity(intentCurrentLocation);
	                    break;
	                case R.id.MyWishList:
	                	Toast.makeText(getBaseContext(),  "You Clicked My Wish List", Toast.LENGTH_SHORT).show();
	                    Intent intentMyWishList = new Intent(context, MyWishList.class);
	                	startActivity(intentMyWishList);
	                	break;
	                case R.id.Search:
	                	Toast.makeText(getBaseContext(),  "You Clicked Search", Toast.LENGTH_SHORT).show();
	                    break;
	            }
	        }
	        
	    };
	         
	    //we will set the listeners
	    findViewById(R.id.CurrentLocation).setOnClickListener(handler);
	    findViewById(R.id.MyWishList).setOnClickListener(handler);
	    findViewById(R.id.Search).setOnClickListener(handler);
	     
	    }catch(Exception e){
	         Log.e("ERROR", e.toString());
	    } 
	}
	
	 public class MyCountDownTimer extends CountDownTimer {
		 public MyCountDownTimer(long startTime, long interval) {
		super(startTime, interval);
		 }
		
		 @Override
		public void onFinish() {
            Intent intentMyWishList = new Intent(context, Warning.class);
         	startActivity(intentMyWishList);
		 }

		@Override
		public void onTick(long arg0) {
			// TODO Auto-generated method stub
			
		}
	 }
		
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main, menu);
        return true;
    }
}