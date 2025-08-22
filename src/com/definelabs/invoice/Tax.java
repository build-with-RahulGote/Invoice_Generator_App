package com.definelabs.invoice;

public class Tax {

	
	private String name;
	private double percent;
	
	
	public Tax(String name,double percent)
	{
		this.name=name;
		this.percent=percent;
		
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public double getPercent() {
		return percent;
	}


	public void setPercent(double percent) {
		this.percent = percent;
	}


	@Override
	public String toString() {
		return "Tax{name='" + name + "', percent=" + percent + "%}";
	}


	
}
