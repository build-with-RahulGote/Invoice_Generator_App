package com.definelabs.invoice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void  main(String [] arg)
	{
		Scanner sc = new Scanner(System.in);
		// Define individual taxes
        Tax vat = new Tax("VAT", 2);
        Tax sgst = new Tax("SGST", 5);
        Tax cgst = new Tax("CGST", 5);

        // Define TaxGroups
        TaxGroup noTax = new TaxGroup("No Tax",new ArrayList<Tax>());
        TaxGroup vatGroup = new TaxGroup("VAT Only", Arrays.asList(vat));
        TaxGroup gstGroup = new TaxGroup("GST", Arrays.asList(sgst, cgst));

        
     // Map categories for quick lookup
        Map<Integer, TaxGroup> taxOptions = new HashMap<>();
        taxOptions.put(1, noTax);
        taxOptions.put(2, vatGroup);
        taxOptions.put(3, gstGroup);

        Invoice invoice = new Invoice();

        // Take user input for products
        while (true) {
            System.out.print("\nEnter Product Name (or type 'exit' to finish): ");
            String name = sc.nextLine();
            if (name.equalsIgnoreCase("exit")) break;

            System.out.print("Enter Product Price: ");
            double price = sc.nextDouble();

            System.out.println("Select Tax Group: ");
            System.out.println("1. No Tax");
            System.out.println("2. VAT Only");
            System.out.println("3. GST (SGST+CGST)");
            int choice = sc.nextInt();
            sc.nextLine(); 

            TaxGroup selectedTaxGroup = taxOptions.getOrDefault(choice, noTax);

            // Create product and add to invoice
            Product p = new Product(name, price, selectedTaxGroup);
            invoice.addProduct(p);

            System.out.println(" Product added successfully!");
        }

        // Generate Invoice
        invoice.generateInvoice();

        sc.close();
	}
}
