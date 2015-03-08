package com.example.dataHolders;

public class ProjectsDetails {

	private String title;
	private String tags;
	private String description;
	private String comments;
	private String ratings;

	public ProjectsDetails(String title, String tags, String description,
			String comments, String ratings) {
		this.title = title;
		this.tags = tags;
		this.description = description;
		this.comments = comments;
		this.ratings = ratings;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getTags() {
		return tags;
	}

	public void setTags(String tags) {
		this.tags = tags;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public String getRatings() {
		return ratings;
	}

	public void setRatings(String ratings) {
		this.ratings = ratings;
	}

}
