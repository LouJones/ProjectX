package com.example.physics;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Distance extends ActionBarActivity {
	TextView tvSpd, tvTim;
	EditText etSpd, etTim, etAnsD;
	Button btnDis, btnBack;
	DistanceCalc caldis;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.distance);
		etSpd=(EditText)findViewById(R.id.etSpeed);
		tvSpd=(TextView)findViewById(R.id.tvSpeed);
		tvTim=(TextView)findViewById(R.id.tvTime);
		etTim=(EditText)findViewById(R.id.etTime);
		etAnsD=(EditText)findViewById(R.id.etAnsSpeed);
		btnDis=(Button)findViewById(R.id.btnDistance);
		btnDis.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				caldistance();
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
public void caldistance(){
	int input1 = Integer.parseInt(etSpd.getText().toString());
	int input2 = Integer.parseInt(etTim.getText().toString());
	caldis = new DistanceCalc (input1, input2);
	etAnsD.setText(Integer.toString(caldis.distance()));

}

}
