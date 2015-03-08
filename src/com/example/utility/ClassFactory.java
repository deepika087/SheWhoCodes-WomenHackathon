package com.example.utility;

import com.example.R;

public class ClassFactory {

	public static String getClassName(final int code) {

		String ClassName = "";
		switch (code) {
			case R.id.becomeMentor:
				ClassName = "com.example.womenhackathon.BecomeAMentor";
				break;
	
			case R.id.findMentor:
				ClassName = "com.example.womenhackathon.SearchAMentor";
				break;
	
			case R.id.postProject:
				ClassName = "com.example.womenhackathon.PostProjectOrIdea";
				break;
	
			case R.id.viewProject:
				ClassName = "com.example.womenhackathon.ViewProjects";
				break;
	
			case R.id.shopAtDiscount:
				ClassName = "com.example.womenhackathon.DiscountProducts";
				break;
	
			case R.id.meetTechnologists:
				ClassName = "com.example.womenhackathon.FamousWomen";
				break;
		}
		return ClassName;
	}
}