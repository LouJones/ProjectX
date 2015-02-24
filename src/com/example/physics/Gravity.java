package com.example.physics;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Gravity extends ActionBarActivity {
	TextView tvMasG, tvGrav;
	EditText etMassG, etGrav, etAnsG;
	Button btnGrav, btnBack;
	GravityCalc gravcal;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.gravity);
		tvMasG=(TextView)findViewById(R.id.tvMassG);
		tvGrav=(TextView)findViewById(R.id.tvGravity);
		etMassG=(EditText)findViewById(R.id.etMassG);
		etGrav=(EditText)findViewById(R.id.etGravity);
		etAnsG=(EditText)findViewById(R.id.etAnsGravity);
		btnGrav=(Button)findViewById(R.id.btnGravity);
		btnGrav.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				gravcal();
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
	public void gravcal(){
		int input1 = Integer.parseInt(etMassG.getText().toString());
		int input2 = Integer.parseInt(etGrav.getText().toString());
		gravcal = new GravityCalc (input1, input2);
		etAnsG.setText(Integer.toString(gravcal.gravity()));
	}
	
	
}

