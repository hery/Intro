package com.acmccny.intro;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		// Create a reference to the object in the layout file with id "button1"
		Button button1 = (Button) findViewById(R.id.button1);
		// Attach a listener of type "OnClick" to the button to handle clicks
		button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
            	// Output message to LogCat
                System.out.println("You clicked me! Click me again!");
            }
        });
		
		// Create a reference to the object in the layout file with id "button1"
		Button button2 = (Button) findViewById(R.id.button2);
		// Attach a listener of type "OnClick" to the button to handle clicks
		button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
            	Intent intent = new Intent(MainActivity.this, AnotherActivity.class);
                //EditText editText = (EditText) findViewById(R.id.edit_message);
                //String message = editText.getText().toString();
                //intent.putExtra(EXTRA_MESSAGE, message);
                startActivity(intent);
            }
        });
				
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
