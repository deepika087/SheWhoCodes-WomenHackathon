package com.example.fullScreenHandlers;

import com.example.utility.IntentFields;
import com.example.R;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class TechnologistScreen extends Activity {

	private TextView Name;
	private TextView Designation;
	private ImageView Photo;
	private TextView Introduction;
	private TextView CurrentOpening;

	private String name;
	private String designation;
	private int photoid;
	private String introduction;
	private String currentOpenings;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		
		super.onCreate(savedInstanceState);
		setContentView(R.layout.famous_technologists_full_screen);

		/**
		 * Get the Data to be displayed
		 */
		Bundle extras = getIntent().getExtras();
		if (extras != null) {
			name = extras.getString(IntentFields.NAME);
			designation = extras.getString(IntentFields.DESIGNATION);
			photoid = extras.getInt(IntentFields.PHOTO);
			introduction = extras.getString(IntentFields.INTRODUCTION);
			currentOpenings = extras.getString(IntentFields.CURRENT_OPENINGS);
		}

		Name = (TextView) findViewById(R.id.technologist_name);
		Name.setText(name);

		Designation = (TextView) findViewById(R.id.technologist_designation);
		Designation.setText(designation);
		
		Photo = (ImageView) findViewById(R.id.ItemIcon);
		Photo.setImageResource(photoid);

		Introduction = (TextView) findViewById(R.id.introduction);
		Introduction.setText(introduction);

		CurrentOpening = (TextView) findViewById(R.id.current_openings);
		CurrentOpening.setText(currentOpenings);
	}
}