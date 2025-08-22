package com.definelabs.invoice;

import java.util.ArrayList;
import java.util.List;

public class Invoice {
	
	
	private List<Product> products=new ArrayList<>();     // List to hold all products added to the invoice
	
	 
	public void  addProduct(Product product)     // Method to add a product to the invoice
	{
		products.add(product);
	}
	
	
	public  void generateInvoice()      // Method to generate and print the invoice
	{
		double totalPrice=0.0,totalTax=0.0;
		
		System.out.println("-----------------------------");
        System.out.println("Product\t\tPrice\tTax");
        
        for (Product p : products) {
            double tax = p.calculateTax();
            System.out.printf("%-15s %-10.2f %-10.2f%n", p.getName(), p.getPrice(), tax);
            totalPrice += p.getPrice();
            totalTax += tax;
        }
        
        System.out.println("\nTotal\t\t" + totalPrice + "\t" + totalTax);
        System.out.println("Grand Total : " + (totalPrice + totalTax));
        System.out.println("-----------------------------");
    
	}
	

}
