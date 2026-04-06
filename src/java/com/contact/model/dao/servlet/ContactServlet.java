package com.contact.servlet;

import com.contact.dao.ContactDAO;
import com.contact.model.Contact;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/contacts")
public class ContactServlet extends HttpServlet {

    ContactDAO dao = new ContactDAO();

    // 👉 GET → View all contacts
    protected void doGet(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {

        res.setContentType("text/html");
        PrintWriter out = res.getWriter();

        out.println("<h2>Contact List</h2>");

        for (Contact c : dao.getAllContacts()) {
            out.println(c.getId() + " " + c.getName() + " " + c.getEmail() + "<br>");
        }
    }

    // 👉 POST → Add new contact
    protected void doPost(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {

        String name = req.getParameter("name");
        String email = req.getParameter("email");
        String phone = req.getParameter("phone");

        Contact c = new Contact();
        c.setName(name);
        c.setEmail(email);
        c.setPhone(phone);

        dao.addContact(c);

        res.sendRedirect("contacts");
    }
}