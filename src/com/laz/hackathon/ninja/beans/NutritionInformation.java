package com.laz.hackathon.ninja.beans;

public class NutritionInformation {
	Integer calories;
	Mass carbohydrateContent;
	Mass cholesterolContent;
	Mass fatContent;
	Mass fiberContent;
	Mass proteinContent;
	Mass saturatedFatContent;
	String servingSize;
	Mass sodiumContent;
	Mass sugarContent;
	Mass transFatContent;
	Mass unsaturatedFatContent;
	public NutritionInformation(Integer calories, Mass carbohydrateContent, Mass cholesterolContent, Mass fatContent,
			Mass fiberContent, Mass proteinContent, Mass saturatedFatContent, String servingSize, Mass sodiumContent,
			Mass sugarContent, Mass transFatContent, Mass unsaturatedFatContent) {
		super();
		this.calories = calories;
		this.carbohydrateContent = carbohydrateContent;
		this.cholesterolContent = cholesterolContent;
		this.fatContent = fatContent;
		this.fiberContent = fiberContent;
		this.proteinContent = proteinContent;
		this.saturatedFatContent = saturatedFatContent;
		this.servingSize = servingSize;
		this.sodiumContent = sodiumContent;
		this.sugarContent = sugarContent;
		this.transFatContent = transFatContent;
		this.unsaturatedFatContent = unsaturatedFatContent;
	}
	public Integer getCalories() {
		return calories;
	}
	public void setCalories(Integer calories) {
		this.calories = calories;
	}
	public Mass getCarbohydrateContent() {
		return carbohydrateContent;
	}
	public void setCarbohydrateContent(Mass carbohydrateContent) {
		this.carbohydrateContent = carbohydrateContent;
	}
	public Mass getCholesterolContent() {
		return cholesterolContent;
	}
	public void setCholesterolContent(Mass cholesterolContent) {
		this.cholesterolContent = cholesterolContent;
	}
	public Mass getFatContent() {
		return fatContent;
	}
	public void setFatContent(Mass fatContent) {
		this.fatContent = fatContent;
	}
	public Mass getFiberContent() {
		return fiberContent;
	}
	public void setFiberContent(Mass fiberContent) {
		this.fiberContent = fiberContent;
	}
	public Mass getProteinContent() {
		return proteinContent;
	}
	public void setProteinContent(Mass proteinContent) {
		this.proteinContent = proteinContent;
	}
	public Mass getSaturatedFatContent() {
		return saturatedFatContent;
	}
	public void setSaturatedFatContent(Mass saturatedFatContent) {
		this.saturatedFatContent = saturatedFatContent;
	}
	public String getServingSize() {
		return servingSize;
	}
	public void setServingSize(String servingSize) {
		this.servingSize = servingSize;
	}
	public Mass getSodiumContent() {
		return sodiumContent;
	}
	public void setSodiumContent(Mass sodiumContent) {
		this.sodiumContent = sodiumContent;
	}
	public Mass getSugarContent() {
		return sugarContent;
	}
	public void setSugarContent(Mass sugarContent) {
		this.sugarContent = sugarContent;
	}
	public Mass getTransFatContent() {
		return transFatContent;
	}
	public void setTransFatContent(Mass transFatContent) {
		this.transFatContent = transFatContent;
	}
	public Mass getUnsaturatedFatContent() {
		return unsaturatedFatContent;
	}
	public void setUnsaturatedFatContent(Mass unsaturatedFatContent) {
		this.unsaturatedFatContent = unsaturatedFatContent;
	}
	
	
	

}
