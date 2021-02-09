/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author rocha
 */
public class savings {
    
     private String bankName;
    private String routingNumber;
    private String accountNumber;
    private double accountbalance;
    


    public double getAccountbalance() {
        return accountbalance;
    }

    public void setAccountbalance(double accountbalance) {
        this.accountbalance = accountbalance;
    }

   

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getRoutingNumber() {
        return routingNumber;
    }

    public void setRoutingNumber(String routingNumber) {
        this.routingNumber = routingNumber;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    

    
}
