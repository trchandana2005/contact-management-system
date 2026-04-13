package com.payment;

public class Payment {
    private String cardNumber;
    private double amount;
    private String status;

    public Payment(String cardNumber, double amount, String status) {
        this.cardNumber = cardNumber;
        this.amount = amount;
        this.status = status;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public double getAmount() {
        return amount;
    }

    public String getStatus() {
        return status;
    }
}