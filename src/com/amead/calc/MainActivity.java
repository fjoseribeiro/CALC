package com.amead.calc;

import android.app.Activity;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {
	MediaPlayer bs1;
	MediaPlayer bs2;
	MediaPlayer bs3;
	MediaPlayer bs4;
	MediaPlayer bs5;
	MediaPlayer bs6;
	MediaPlayer bs7;
	MediaPlayer bs8;
	MediaPlayer bs9;
	MediaPlayer bs0;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		// Button Sound
        bs1 = MediaPlayer.create(this,R.raw.btn1);
        bs2 = MediaPlayer.create(this,R.raw.btn2);
        bs3 = MediaPlayer.create(this,R.raw.btn3);
        bs4 = MediaPlayer.create(this,R.raw.btn4);
        bs5 = MediaPlayer.create(this,R.raw.btn5);
        bs6 = MediaPlayer.create(this,R.raw.btn6);
        bs7 = MediaPlayer.create(this,R.raw.btn7);
        bs8 = MediaPlayer.create(this,R.raw.btn8);
        bs9 = MediaPlayer.create(this,R.raw.btn9);
        bs0 = MediaPlayer.create(this,R.raw.btn0);
        // Setting up the button references
        Button btn1 = (Button) findViewById(R.id.btn1);
        Button btn2 = (Button) findViewById(R.id.btn2);
        Button btn3 = (Button) findViewById(R.id.btn3);
        Button btn4 = (Button) findViewById(R.id.btn4);
        Button btn5 = (Button) findViewById(R.id.btn5);
        Button btn6 = (Button) findViewById(R.id.btn6);
        Button btn7 = (Button) findViewById(R.id.btn7);
        Button btn8 = (Button) findViewById(R.id.btn8);
        Button btn9 = (Button) findViewById(R.id.btn9);
        Button btn0 = (Button) findViewById(R.id.btn0);
        //
        btn1.setOnClickListener(new View.OnClickListener() {
        	            public void onClick(View v) {
        	                bs1.start();
        	            }
        	        });
        //
        btn2.setOnClickListener(new View.OnClickListener() {
        	            public void onClick(View v) {
        	                bs2.start();
        	            }
        	        });
        //
        btn3.setOnClickListener(new View.OnClickListener() {
        	            public void onClick(View v) {
        	                bs3.start();
        	            }
        	        });
        //
        btn4.setOnClickListener(new View.OnClickListener() {
        	            public void onClick(View v) {
        	                bs4.start();
        	            }
        	        });
        //
        btn5.setOnClickListener(new View.OnClickListener() {
        	            public void onClick(View v) {
        	                bs5.start();
        	            }
        	        });
        //
        btn6.setOnClickListener(new View.OnClickListener() {
        	            public void onClick(View v) {
        	                bs6.start();
        	            }
        	        });
        //
        btn7.setOnClickListener(new View.OnClickListener() {
        	            public void onClick(View v) {
        	                bs7.start();
        	            }
        	        });
        //
        btn8.setOnClickListener(new View.OnClickListener() {
        	            public void onClick(View v) {
        	                bs8.start();
        	            }
        	        });
        //
        btn9.setOnClickListener(new View.OnClickListener() {
        	            public void onClick(View v) {
        	                bs9.start();
        	            }
        	        });
        //
        btn0.setOnClickListener(new View.OnClickListener() {
        	            public void onClick(View v) {
        	                bs0.start();
        	            }
        	        });
	}

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
}
