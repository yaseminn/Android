package com.example.newboston;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Email extends Activity implements View.OnClickListener{

	EditText email,intro,name,surname,collego,gpa;
	String emailAd,sIntro,sName,sSurname,sCollego,sGpa;
	Button sendMail;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.email);
		initializeVars();
		sendMail.setOnClickListener(this);
	}
	private void initializeVars() {
		// TODO Auto-generated method stub
		
		email = (EditText)findViewById(R.id.etEmails);
		intro = (EditText)findViewById(R.id.etIntro);
		name = (EditText)findViewById(R.id.etName);
		surname = (EditText)findViewById(R.id.etSurname);
		collego = (EditText)findViewById(R.id.etCollege);
		gpa = (EditText)findViewById(R.id.etGpa);
	}
	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		convertEditTextToString();
		String emailAddress[] = {emailAd};
		String message = "hello guyss"
				+ name
				+"My name "
				+surname;
		
		Intent emailIntent = new Intent(android.content.Intent.ACTION_SEND);
		emailIntent.putExtra(android.content.Intent.EXTRA_EMAIL, emailAddress);
		emailIntent.putExtra(android.content.Intent.EXTRA_SUBJECT, "i hate u :)");
		emailIntent.setType("plain/text");
		emailIntent.putExtra(android.content.Intent.EXTRA_TEXT, message);
		startActivity(emailIntent);
		
	}
	public void convertEditTextToString(){
		emailAd = email.getText().toString();
		sIntro= intro.getText().toString();
		sName = name.getText().toString();
		sSurname = surname.getText().toString();
		sCollego = collego.getText().toString();
		sGpa = gpa.getText().toString();
	}
	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
		finish();
	}
	

	
}


