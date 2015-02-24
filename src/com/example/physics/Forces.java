package com.example.physics;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Forces extends ActionBarActivity {
	TextView tvMas, tvAcc;
	EditText etMas, etAcc, etAnsMas;
	Button btnMas, btnBack;
	ForcesCalc cal;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.forces);
		etMas=(EditText)findViewById(R.id.etMass);
		tvMas=(TextView)findViewById(R.id.tvMass);
		tvAcc=(TextView)findViewById(R.id.tvAccel);
		etAcc=(EditText)findViewById(R.id.etAccel);
		etAnsMas=(EditText)findViewById(R.id.etAnsMass);
		btnMas=(Button)findViewById(R.id.btnMass);
		btnMas.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				calforces();
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
	public void calforces(){
		int input1 = Integer.parseInt(etMas.getText().toString());
		int input2 = Integer.parseInt(etAcc.getText().toString());
		cal = new ForcesCalc (input1, input2);
		etAnsMas.setText(Integer.toString(cal.forces()));
	}
	
	
}
