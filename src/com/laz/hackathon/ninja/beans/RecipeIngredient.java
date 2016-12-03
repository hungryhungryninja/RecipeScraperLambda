package com.laz.hackathon.ninja.beans;

public class RecipeIngredient {
	String name;
	Mass amount;
	
	public RecipeIngredient(String name, Mass amount) {
		this.name = name;
		this.amount = amount;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Mass getAmount() {
		return amount;
	}
	public void setAmount(Mass ammount) {
		this.amount = ammount;
	}

}
