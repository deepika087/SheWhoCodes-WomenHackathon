package com.example.fullScreenHandlers;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.R;
import com.example.utility.IntentFields;

public class ViewProjectsAndRate extends Activity {

	private String title;
	private String tags;
	private String rating;
	private String description;
	private String comment;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.view_project_full_screen);
		
		Bundle extras = getIntent().getExtras();
		if (extras != null) {
			title = extras.getString(IntentFields.PROJECT_TITLE);
			tags = extras.getString(IntentFields.PROJECT_TAG);
			rating = extras.getString(IntentFields.PROJECT_RATING);
			description = extras.getString(IntentFields.PROJECT_DESCRIPTION);
			comment = extras.getString(IntentFields.PROJECT_COMMENT);
		}
		
		final TextView fullScreenTitle = (TextView) findViewById(R.id.fullScreenPostTitle);
		fullScreenTitle.setText(title);
		
		final TextView fullScreenTags = (TextView) findViewById(R.id.fullScreenTags);
		fullScreenTags.setText(tags);
		
		final TextView fullScreenDescription = (TextView) findViewById(R.id.fullScreenPostdescription);
		fullScreenDescription.setText(description);
		
		final TextView fullScreenRating = (TextView) findViewById(R.id.fullScreenPlusOrMinus);
		fullScreenRating.setText(rating);

		final TextView comments = (TextView) findViewById(R.id.commentsArea);
		comments.setText(comment);
		
		Button thumbsUp = (Button) findViewById(R.id.thumbsUp);
		thumbsUp.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				//Toast.makeText(getBaseContext(), "+1 for this idea/project added to DB", Toast.LENGTH_SHORT).show();
				int positive = (rating.charAt(1) - '0') + 1;
				rating = "+".concat(String.valueOf(positive)).concat(rating.substring(2, rating.length()));
				fullScreenRating.setText(rating);
				
			}
		});
		
		Button thumbsDown = (Button) findViewById(R.id.thumbsDown);
		thumbsDown.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				//Toast.makeText(getBaseContext(), "-1 for this project/idea updated in the DB", Toast.LENGTH_SHORT).show();
				int negative = (rating.charAt(4) -'0') + 1;
				rating = rating.substring(0,4).concat(String.valueOf(negative));
				fullScreenRating.setText(rating);
			}
		});
		
		Button commentStore = (Button) findViewById(R.id.fullScreenPostComment);
		commentStore.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Toast.makeText(getBaseContext(), "Thanks for your comment ! !", Toast.LENGTH_SHORT).show();
			}
		});
	}
}
