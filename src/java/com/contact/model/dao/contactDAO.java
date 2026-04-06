package com.contact.dao;

import com.contact.model.Contact;
import java.util.*;

public class ContactDAO {

    private static List<Contact> contacts = new ArrayList<>();
    private static int idCounter = 1;

    // CREATE
    public void addContact(Contact c) {
        c.setId(idCounter++);
        contacts.add(c);
    }

    // READ
    public List<Contact> getAllContacts() {
        return contacts;
    }

    // DELETE
    public void deleteContact(int id) {
        contacts.removeIf(c -> c.getId() == id);
    }
}