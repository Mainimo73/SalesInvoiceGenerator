/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sig.model;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author LAPTOP
 */
public class InvoiceHeader {
    
      private int num;
    private String customer;
    private Date date;
    
    private ArrayList <InvoiceLine> Lines ;

    public InvoiceHeader(int num, String customer, Date date) {
        this.num = num;
        this.customer = customer;
        this.date = date;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public ArrayList <InvoiceLine> getLines() {
        return Lines;
    }

    public void setLines(ArrayList <InvoiceLine> Lines) {
        this.Lines = Lines;
    }
    
    
    
}
