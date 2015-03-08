package com.example.womenhackathon;

import com.example.R;
import com.example.utility.ClassFactory;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity{

	Button shop, getInspired;
	Button becomeMentor, findMentor;
	Button postProject, viewProject;

	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        becomeMentor = (Button) findViewById(R.id.becomeMentor);
        becomeMentor.setOnClickListener(startTheActivity(R.id.becomeMentor));
        
        findMentor = (Button) findViewById(R.id.findMentor);
        findMentor.setOnClickListener(startTheActivity(R.id.findMentor));
        
        postProject =(Button) findViewById(R.id.postProject);
        postProject.setOnClickListener(startTheActivity(R.id.postProject));
        
        viewProject = (Button) findViewById(R.id.viewProject);
        viewProject.setOnClickListener(startTheActivity(R.id.viewProject));
        
        shop = (Button) findViewById(R.id.shopAtDiscount);
        shop.setOnClickListener(startTheActivity(R.id.shopAtDiscount));
        
        getInspired = (Button) findViewById(R.id.meetTechnologists);
        getInspired.setOnClickListener(startTheActivity(R.id.meetTechnologists));
        
    }
	
	private OnClickListener startTheActivity(final int code) {
		
		return new View.OnClickListener() {
        	
			@Override
			public void onClick(View arg0) {
				try {
					Intent ourIntent = new Intent(getApplicationContext(), Class.forName(ClassFactory.getClassName(code)));
					startActivity(ourIntent);
				} catch(ClassNotFoundException ex) {
					ex.printStackTrace();
				}
			}
		};
	}
}