package com.payment;

import java.util.ArrayList;
import java.util.List;

public class PaymentDAO {

    private static List<Payment> payments = new ArrayList<>();

    public boolean processPayment(String card, double amount) {

        if (card.length() != 16 || amount <= 0) {
            payments.add(new Payment(card, amount, "FAILED"));
            return false;
        }

        payments.add(new Payment(card, amount, "SUCCESS"));
        return true;
    }

    public List<Payment> getAllPayments() {
        return payments;
    }
}

