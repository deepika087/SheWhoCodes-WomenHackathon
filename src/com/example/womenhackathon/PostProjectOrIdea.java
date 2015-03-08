package com.example.womenhackathon;

import com.example.R;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class PostProjectOrIdea extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.project_idea_post);
		
		Button postIt = (Button) findViewById(R.id.postProjectOrIdea);
		postIt.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				Toast.makeText(getBaseContext(), "Thanks for sharing your idea ! !", Toast.LENGTH_SHORT).show();
			}
		});
	}
}
