package com.valerio.cursojava.aula53.labs;

public class Contact {
	private String name;
	private String phone;
	private int id;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		String description = ":::::::::::::::::::::::";
		description += "\nName: " + this.name;
		description += "\nPhone number: " + this.phone;
		description += "\nID: " + this.id;
		return description;
	}

}
