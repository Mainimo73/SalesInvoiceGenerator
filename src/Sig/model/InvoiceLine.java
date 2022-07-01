/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sig.model;

/**
 *
 * @author LAPTOP
 */
public class InvoiceLine {
    
    private InvoiceHeader invoice;
    private String item;
    private double price;
    private int count;

    public InvoiceLine(InvoiceHeader invoice, String item, double price, int count) {
        this.invoice = invoice;
        this.item = item;
        this.price = price;
        this.count = count;
    }

    public InvoiceHeader getInvoice() {
        return invoice;
    }

    public void setInvoice(InvoiceHeader invoice) {
        this.invoice = invoice;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
    
    
    
}
