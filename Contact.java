package com.example.physics;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Contact extends ActionBarActivity{
	//declaring all fields in xml
	EditText toField, subjectField, messageField, edTestOne;
	String msg ="android";
	Button send, mainMenu;
	//declaring variables needed
	String email, subject, message;
	
	protected void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		//set page to open contactus xml
		setContentView(R.layout.contactus);
		//call prepopulate and setUp methods
        prePopulateFields();
        toField = (EditText) findViewById(R.id.etTo);
        edTestOne = (EditText) findViewById(R.id.edTest);
        subjectField = (EditText) findViewById(R.id.etSubject);
        messageField = (EditText) findViewById(R.id.etMessage);
        Log.d(msg, "inside here");
        edTestOne.setText("test".toString());
        send = (Button) findViewById(R.id.btnSend);
        send.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                sendEmail();
            }
        });
        mainMenu=(Button)findViewById(R.id.btnMain);
        mainMenu.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                setContentView(R.layout.activity_main);
            }
        });

	
	}

//private void setUp() {
		// TODO Auto-generated method stub
	//setting all variables to the actual id given to fields in xml

//}
//public void onClick(View v){
	//switch (v.getId()){
	//if select the variable assigned to send the button then call sendEmail method then stop working
	//case R.id.btnSend:
		//sendEmail();
		//break;
	//case R.id.btnHome:
		//if user selects the home button display home xml
		//startActivity(new Intent("com.example.physics.SPLASH"));
		//break;
		
	//default:
		//break;
	//}
//}
private void prePopulateFields() {
	//asking it to always populate this field with my email
	toField.setText("louisedjones@gmail.com");
}

private void sendEmail() {
		// TODO Auto-generated method stub
		if (toField.getText().toString().length()==0){
			//if to field empty display message
			Toast.makeText(Contact.this,
					"An e-mail address must be entered", Toast.LENGTH_SHORT).show();
			//if subject field empty display message
		}else if (subjectField.getText().toString().length() == 0){
			
			Toast.makeText(Contact.this,
					"A Subject must be entered", Toast.LENGTH_SHORT).show();
		//if message field empty display message
		}else if (messageField.getText().toString().length() == 0){
			
			Toast.makeText(Contact.this,
					"A message must be entered", Toast.LENGTH_SHORT).show();
			
		}else {
			//call details from form method
			detailsFromForm();
			String emailAddress[] = { email };
			//new intent to send email
			Intent sendEmail = new Intent (android.content.Intent.ACTION_SEND);
			sendEmail.putExtra(android.content.Intent.EXTRA_EMAIL, emailAddress);
			sendEmail.putExtra(android.content.Intent.EXTRA_SUBJECT, emailAddress);
			sendEmail.putExtra(android.content.Intent.EXTRA_TEXT, emailAddress);
			sendEmail.setType("Plain/text");
			//start send email activity
			startActivity(sendEmail);
			
		}
	}

private void detailsFromForm() {
	// TODO Auto-generated method stub
	//store in email what the user enters in the to field
	email = toField.getText().toString();
	subject = subjectField.getText().toString();
	message = messageField.getText().toString();
}




}
