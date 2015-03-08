package com.example.dataHolders;

public class SpecialDiscountProducts {

	private String description;
	private String originalPrice;
	private int photo;
	private String discountPercentage;
	private String finalPrice;
	private int sponseredBy;
	
	public SpecialDiscountProducts(String description, String originalPrice,
			int photo, String discountPercentage, String finalPrice,
			int sponseredBy) {
		super();
		this.description = description;
		this.originalPrice = originalPrice;
		this.photo = photo;
		this.discountPercentage = discountPercentage;
		this.finalPrice = finalPrice;
		this.sponseredBy = sponseredBy;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getOriginalPrice() {
		return originalPrice;
	}

	public void setOriginalPrice(String originalPrice) {
		this.originalPrice = originalPrice;
	}

	public int getPhoto() {
		return photo;
	}

	public void setPhoto(int photo) {
		this.photo = photo;
	}

	public String getDiscountPercentage() {
		return discountPercentage;
	}

	public void setDiscountPercentage(String discountPercentage) {
		this.discountPercentage = discountPercentage;
	}

	public String getFinalPrice() {
		return finalPrice;
	}

	public void setFinalPrice(String finalPrice) {
		this.finalPrice = finalPrice;
	}

	public int getSponseredBy() {
		return sponseredBy;
	}

	public void setSponseredBy(int sponseredBy) {
		this.sponseredBy = sponseredBy;
	}
	
	@Override
	public String toString() {
		
		return "[Description = " +  description + "Final Price = " + finalPrice + "]";
	}
	
}
