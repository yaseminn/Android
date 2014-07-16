package com.example.newboston;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class Love extends Activity{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.love);
		Thread timer = new Thread(){
			public void run(){
				try{
					sleep(5000);
				}catch(InterruptedException e){
					e.printStackTrace();
					
				}finally{
					Intent openStartingPoint = new Intent("com.example.newboston.MENU");
					startActivity(openStartingPoint);
				}
				
			}
			
			
		};
		timer.start();
		
	}
	

}
