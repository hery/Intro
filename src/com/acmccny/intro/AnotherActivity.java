package com.acmccny.intro;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class AnotherActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_another);
		
		Button backButton = (Button) findViewById(R.id.back);
		// Attach a listener of type "OnClick" to the button to handle clicks
		backButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
            	// Terminate this activity
                AnotherActivity.this.finish();
            }
        });
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.another, menu);
		return true;
	}

}
