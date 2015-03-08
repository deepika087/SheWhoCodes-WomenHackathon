package com.example.dataHolders;

public class FamousTechnologistsInfo {
	
	private String Name;
	private String CurrentDesignation;
	private int Photo;
	private String introduction;
	private String currentOpenings;
	
	public FamousTechnologistsInfo() {}
	
	public FamousTechnologistsInfo(String name, String currentDesignation,
			int photo, String introduction, String currentOpenings) {
		Name = name;
		CurrentDesignation = currentDesignation;
		Photo = photo;
		this.introduction = introduction;
		this.currentOpenings = currentOpenings;
	}

	public void setName(String name) {
		Name = name;
	}

	public void setCurrentDesignation(String currentDesignation) {
		CurrentDesignation = currentDesignation;
	}

	public String getName() {
		return Name;
	}

	public String getCurrentDesignation() {
		return CurrentDesignation;
	}
	
	public int getPhoto() {
		return Photo;
	}

	public void setPhoto(int photo) {
		Photo = photo;
	}

	public String getIntroduction() {
		return introduction;
	}


	public void setIntroduction(String introduction) {
		this.introduction = introduction;
	}

	public String getCurrentOpenings() {
		return currentOpenings;
	}

	public void setCurrentOpenings(String currentOpenings) {
		this.currentOpenings = currentOpenings;
	}

	@Override
	public String toString() {
		
		return "[Name = " +  Name + "Current Designation = " + CurrentDesignation + "]";
	}
}
