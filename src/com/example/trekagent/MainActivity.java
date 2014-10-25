//this is a comment
package com.example.trekagent;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;
 
public class MainActivity extends Activity {
/** Called when the activity is first created. */
@Override
public void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
     
    try {
    View.OnClickListener handler = new View.OnClickListener(){
        public void onClick(View v) {
            //we will use switch statement and just
            //get thebutton's id to make things easier
            switch (v.getId()) {
 
                case R.id.CurrentLocation:
                    Toast.makeText(getBaseContext(), "You Clicked Current Location!", Toast.LENGTH_SHORT).show();
                    break;
                case R.id.MyWishList:
                	Toast.makeText(getBaseContext(),  "You Clicked My Wish List!", Toast.LENGTH_SHORT).show();
                    break;
                case R.id.Search:
                	Toast.makeText(getBaseContext(),  "You Clicked Search!", Toast.LENGTH_SHORT).show();
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
}