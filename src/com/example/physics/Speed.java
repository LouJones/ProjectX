package com.example.physics;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Speed extends ActionBarActivity{
	TextView tvSp, tvVel;
	EditText etSp, etVel, etAnsM;
	Button btnSp, btnBack;
	SpeedCalc speedcal;
	String msg= "Android;";
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.speed);
		tvSp=(TextView)findViewById(R.id.tvSpeed);
		tvVel=(TextView)findViewById(R.id.tvVelocity);
		etSp=(EditText)findViewById(R.id.etSpeed);
		etVel=(EditText)findViewById(R.id.etVelocity);
		etAnsM=(EditText)findViewById(R.id.etAnsMom);
		btnSp=(Button)findViewById(R.id.btnMomentum);
		btnSp.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				speedcal();
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
public void speedcal(){
	Log.d(msg,"in on speedcal");
	int input1 = Integer.parseInt(etSp.getText().toString());
	int input2 = Integer.parseInt(etVel.getText().toString());
	speedcal = new SpeedCalc (input1, input2);
	etAnsM.setText(Integer.toString(speedcal.Speed()));
	
}
	
}
