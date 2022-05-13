package com.valerio.cursojava.aula53.labs;

import java.util.ArrayList;

public class Agenda {
	private ArrayList<Contact> contact;

	public ArrayList<Contact> getContact() {
		return contact;
	}

	public void setContact(ArrayList<Contact> contact) {
		this.contact = contact;
	}

	public void addContact(Contact contact) {
		this.contact.add(contact);
	}

	@Override
	public String toString() {
		return super.toString();
	}
}
