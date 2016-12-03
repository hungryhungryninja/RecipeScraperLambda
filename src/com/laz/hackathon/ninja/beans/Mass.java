package com.laz.hackathon.ninja.beans;

import java.math.BigDecimal;

public class Mass {
	String unitOfMeasure;
    BigDecimal measurement;
    
    public Mass(String unitOfMeasure, BigDecimal measurement) {
		super();
		this.unitOfMeasure = unitOfMeasure;
		this.measurement = measurement;
	}
	
    public String getUnitOfMeasure() {
		return unitOfMeasure;
	}
	
    public void setUnitOfMeasure(String unitOfMeasure) {
		this.unitOfMeasure = unitOfMeasure;
	}
	
    public BigDecimal getMeasurement() {
		return measurement;
	}
	
    public void setMeasurement(BigDecimal weight) {
		this.measurement = weight;
	}

}
