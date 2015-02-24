package com.example.physics;

import android.support.v7.app.ActionBarActivity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {
	ImageButton btnForces, btnGravity, btnCurrent, btnSpeed, btnDistance;
	String msg= "Android;";
	//will hold name of class user wants to access its a default
	//default path that can be overwritten if user doesn't press a button
	String openMenu = "Forces";
	//. is path name example if forces after dot being looking for Forces file
	String myClass = "com.example.physics.";
	//creating the array which is a table with one column and multiple rows
	//data structure useful for assignment
	//case of name must be exactly the same
	String names[] = {"Forces", "Current", "Distance", "Gravity", "Speed"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //set view to activity_main xml
        setContentView(R.layout.activity_main);
        //error tracker will say in on create
        Log.d(msg, "in on create");
        //call to all methods
        gravityListenerOnButton();
        forcesListenerOnButton();
        currentListenerOnButton();        
        speedListenerOnButton();
        distanceListenerOnButton();
    };


	@Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
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
    private void gravityListenerOnButton() {
		// TODO Auto-generated method stub
    	//alloating btnGravity to previously named ibtnGravity in xml
		btnGravity = (ImageButton) findViewById(R.id.ibtnGravity);
		//setting on click listener for button to do something when clicked
		btnGravity.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				//message to say you clicked button
				Toast.makeText(MainActivity.this, "You clicked the button",Toast.LENGTH_SHORT).show();
				//open number 3 in the array
				openMenu = names[3];
				//open the activity number3
				openActivity();
			}
	});
    }
		private void speedListenerOnButton() {
			// TODO Auto-generated method stub
			btnSpeed = (ImageButton) findViewById(R.id.ibtnSpeed);
			btnSpeed.setOnClickListener(new OnClickListener(){

				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					Toast.makeText(MainActivity.this, "You clicked the Speed button",Toast.LENGTH_SHORT).show();
					openMenu = names[4];
					openActivity();
				}		
		});
		}

		private void currentListenerOnButton() {
			// TODO Auto-generated method stub
			btnCurrent = (ImageButton) findViewById (R.id.ibtnCurrent);
			btnCurrent.setOnClickListener(new OnClickListener(){

				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					Toast.makeText(MainActivity.this, "You clicked the Current button",Toast.LENGTH_SHORT).show();
					openMenu = names[1];
					openActivity();
				}
		});
		}

		private void forcesListenerOnButton() {
			// TODO Auto-generated method stub
			btnForces = (ImageButton) findViewById (R.id.ibtnForces);
			btnForces.setOnClickListener(new OnClickListener(){

				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					Toast.makeText(MainActivity.this, "You clicked the Forces button",Toast.LENGTH_SHORT).show();
					openMenu = names[0];
					openActivity();
				}
			});
		}
		private void distanceListenerOnButton(){
			btnDistance = (ImageButton) findViewById (R.id.ibtnDistance2);
			btnDistance.setOnClickListener (new OnClickListener(){

				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					Toast.makeText(MainActivity.this, "You clicked the Distance button",Toast.LENGTH_SHORT).show();
					openMenu = names[2];
					openActivity();
				}
			});	
				}
		
		public void openActivity(){
			Log.d(msg, "inside open");
			try{
				Class selected = Class.forName(myClass+openMenu);
				Intent selectedIntent = new Intent (this, selected);
				Log.d(msg, "intent created");
				startActivity (selectedIntent);
			}catch(ClassNotFoundException e){
				Log.d(msg, "Error" + e);
			}
    }
		protected void onPause(){
			super.onPause();
			finish();
		}
}
