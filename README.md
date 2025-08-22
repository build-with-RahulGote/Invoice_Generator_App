# Invoice_Generator_App
This project is developed as part of the Java Developer Test - Define Labs.   It demonstrates how to build an Invoice Generation System in Java using object-oriented programming concepts like classes, objects, and data structures.

## 📌 Features
- Store **Taxes** (e.g., VAT, SGST, CGST) with their applicable percentages.
- Combine multiple taxes into a **Tax Group** (e.g., GST = SGST + CGST).
- Store **Products** with price and applicable tax group.
- Generate an **Invoice** that:
  - Lists each product with its price and calculated tax.
  - Shows the **Total**, **Total Tax**, and **Grand Total**.

## 🏗️ Project Structure

InvoiceGenerator/
└── src/com/definelabs/invoice/
├── Tax.java # Stores individual tax
├── TaxGroup.java # Combines multiple taxes
├── Product.java # Stores product with price & tax group
├── Invoice.java # Manages invoice and generates bill
└── Main.java # Entry point with sample execution
