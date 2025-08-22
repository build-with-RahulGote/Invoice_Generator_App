package com.definelabs.invoice;

import java.util.ArrayList;
import java.util.List;

public class TaxGroup {
	
	 // Name of the tax group (e.g., "GST", "NO_TAX")
	private String name;
	
	   // List of individual taxes in this group
	private List<Tax> taxes=new ArrayList<>();
	
	
	@Override
	public String toString() {
		return "TaxGroup [name=" + name + ", taxes=" + taxes + "]";
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public List<Tax> getTaxes() {
		return taxes;
	}


	public void setTaxes(List<Tax> taxes) {
		this.taxes = taxes;
	}


	public TaxGroup(String name, List<Tax> taxes) {
		super();
		this.name = name;
		this.taxes = taxes;
	}

	
	
	public double calculateTax(double price)
	{
		double totalTax=0.0;
		  // Loop through each tax in the group and calculate contribution
		for(Tax t:taxes)
		{
			totalTax +=(price*t.getPercent()/100);
		}
		return totalTax;
	}
}
