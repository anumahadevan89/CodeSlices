package com.example.myapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;

public class MainActivity extends Activity {
	int i=0;
	public static final String EXTRA_MESSAGE="The total number of taps";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
    public void countTaps(View view){
    	
    	i++;
    	Intent intent= new Intent(this, DisplayMessageActivity.class);
    	intent.putExtra(EXTRA_MESSAGE, i);
    }
    
}
