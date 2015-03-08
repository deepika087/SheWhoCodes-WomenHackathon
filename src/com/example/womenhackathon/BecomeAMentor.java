package com.example.womenhackathon;

import com.example.R;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class BecomeAMentor extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.become_a_mentor);
		
		Button becomeMentor = (Button) findViewById(R.id.becomeMentor);
		becomeMentor.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				Toast.makeText(getBaseContext(), "Your response has been saved. Thanks for registering ! ", Toast.LENGTH_SHORT).show();
			}
		});
	}
}
