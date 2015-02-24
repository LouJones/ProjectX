package com.example.physics;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
//this is used every time create an activity (screen)
public class Splash extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.splashactivity);
		Thread logoTimer = new Thread(){
        	public void run(){
        		try{sleep(5000);
        		Intent menuIntent = new Intent("com.example.physics.SPLASH");
        		startActivity(menuIntent);
        		}catch (InterruptedException e) {
        		e.printStackTrace();
        		}
        	finally{
        		finish();
        	}
        	}
    };
    logoTimer.start();
    };
	}


