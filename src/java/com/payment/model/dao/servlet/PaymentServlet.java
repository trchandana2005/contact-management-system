package com.payment;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/payment")
public class PaymentServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();

        out.println("<h2>Payment Processing System</h2>");
        out.println("<form method='post'>");
        out.println("Amount: <input type='text' name='amount'/><br>");
        out.println("Card Number: <input type='text' name='card'/><br>");
        out.println("<input type='submit' value='Pay Now'/>");
        out.println("</form>");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        String amount = req.getParameter("amount");
        String card = req.getParameter("card");

        PrintWriter out = resp.getWriter();

        if (amount == null || card == null || amount.isEmpty() || card.isEmpty()) {
            out.println("❌ Invalid payment details!");
            return;
        }

        if (card.length() != 16) {
            out.println("❌ Invalid card number!");
            return;
        }

        out.println("✅ Payment of ₹" + amount + " processed successfully!");
    }
}
PaymentDAO dao = new PaymentDAO();

boolean status = dao.processPayment(card, Double.parseDouble(amount));

if (status) {
    out.println("✅ Payment Successful!");
} else {
    out.println("❌ Payment Failed!");
}