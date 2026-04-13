package com.payment;

public class PaymentTest {
    public static void main(String[] args) {

        PaymentDAO dao = new PaymentDAO();

        boolean result = dao.processPayment("1234567890123456", 500);

        if (result) {
            System.out.println("Payment Success");
        } else {
            System.out.println("Payment Failed");
        }
    }
}