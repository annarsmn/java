package org.example;

import java.util.Scanner;

public class InvoiceTest {
    public static void main(String[] args) {
        Invoice invoice = new Invoice("1212", "Drill", 5, 19.99);
        System.out.printf("Part number: %s%nPart description: %s%nQuantity: %d%nPrice per item: %.2f%nInvoice amount: %.2f%n%n",
                invoice.getPartNumber(), invoice.getPartDescription(), invoice.getQuantity(), invoice.getPricePerItem(), invoice.getInvoiceAmount());

        Scanner input = new Scanner(System.in);
        System.out.print("Enter new quantity: ");
        int newQuantity = input.nextInt();
        invoice.setQuantity(newQuantity);

        System.out.print("Enter new price per item: ");
        double newPrice = input.nextDouble();
        invoice.setPricePerItem(newPrice);

        System.out.printf("%nUpdated Invoice: %nPart number: %s%nPart description: %s%nQuantity: %d%nPrice per item: %.2f%nInvoice amount: %.2f%n%n",
                invoice.getPartNumber(), invoice.getPartDescription(), invoice.getQuantity(), invoice.getPricePerItem(), invoice.getInvoiceAmount());
    }
}
