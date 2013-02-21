package com.acmccny.intro;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		// Create a reference to the object in the layout file with id "button1"
		// and type "Button"
		Button button = (Button) findViewById(R.id.button1);
		// Attach a listener of type "OnClick" to the button to handle clicks
		button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                System.out.println("You clicked button1!");
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
