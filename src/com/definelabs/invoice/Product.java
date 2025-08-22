package com.definelabs.invoice;

public class Product {
	
	  // Product name
	private String name;
	
    // Product base price (without tax)
	private double price;
	
	 // Tax group applied to this product
	private TaxGroup taxGroup;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public TaxGroup getTaxGroup() {
		return taxGroup;
	}

	public void setTaxGroup(TaxGroup taxGroup) {
		this.taxGroup = taxGroup;
	}

	public Product(String name, double price, TaxGroup taxGroup) {
		super();
		this.name = name;
		this.price = price;
		this.taxGroup = taxGroup;
	}
	
	/**
     * Calculate total tax for this product.
     * - If tax group exists → calculate using tax group
     * - If no tax group → return 0
     */
	public double calculateTax()
	{
		return taxGroup !=null ? taxGroup.calculateTax(price):0.0;
	}

	@Override
	public String toString() {
		return "Product [name=" + name + ", price=" + price + ", taxGroup=" + taxGroup + "]";
	}

}
