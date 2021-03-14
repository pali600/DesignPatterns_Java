package com.activemesa.structural.proxy.exercise;

public class ResponsiblePerson {
	private Person person;

	public ResponsiblePerson( Person person ) {
		this.person = person;
	}

	public int getAge() {
		return person.getAge();
	}

	public void setAge( int age ) {
		person.setAge( age );
	}

	public String drink() {
		return getAge() > 18 ? person.drink() : "too young";
	}

	public String drive() {
		return getAge() > 16 ? person.drive() : "too young";
	}

	public String drinkAndDrive() {
		return "dead";
	}
}
