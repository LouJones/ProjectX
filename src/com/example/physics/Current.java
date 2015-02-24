package com.example.physics;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Current extends ActionBarActivity{
	TextView tvCharge, tvTi, tvCurAns;
	EditText etChar, etTi;
	Button btnCur, btnBack;
	CurrentCalc cal;
	String msg= "Android;";
	
	
	protected void onCreate (Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.current);
		etChar=(EditText)findViewById(R.id.etCharge);
		tvCharge=(TextView)findViewById(R.id.tvTextCharge);
		tvTi=(TextView)findViewById(R.id.tvTime);
		etTi=(EditText)findViewById(R.id.etTime);
		tvCurAns=(TextView)findViewById(R.id.tvCurrentAns);
		btnCur=(Button)findViewById(R.id.btnCurrent);
		btnCur.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				calcurrent();
			}
		});
		btnBack=(Button)findViewById(R.id.btnHome);
		btnBack.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				startActivity(new Intent("com.example.physics.SPLASH"));
			}
		});
	}


public void calcurrent(){
	Log.d(msg,"in on calcurrent");
	int input1 = Integer.parseInt(etChar.getText().toString());
	int input2 = Integer.parseInt(etTi.getText().toString());
	cal = new CurrentCalc (input1, input2);
	tvCurAns.setText(Integer.toString(cal.current()));
	//error tracker will say in on create
}
}
