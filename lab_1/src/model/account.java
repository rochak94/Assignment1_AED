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
public class account {
    
    private String bankName;
    private String routingNumber;
    private String accountNumber;
    private double accountbalance;
    
    
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

    public double getaccountBalance() {
        return accountbalance;
    }

    public void setaccountBalance(double balance) {
        this.accountbalance = accountbalance;
    }

    
    
}
