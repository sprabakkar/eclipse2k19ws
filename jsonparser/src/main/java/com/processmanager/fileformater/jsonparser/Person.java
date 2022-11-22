package com.processmanager.fileformater.jsonparser;

public class Person {
	private String firstName;
	private String lastName;
	private String alias;
	private int age;
	private Boolean isMale;
	private Address address;

	public Person(String firstName, String lastName, String alias, int age, boolean isMale, Address address) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.alias = alias;
		this.age = age;
		this.isMale = isMale;
		this.address = address;
	}

	public Person() {
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getAlias() {
		return alias;
	}

	public void setAlias(String alias) {
		this.alias = alias;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public boolean isMale() {
		return isMale;
	}

	public Boolean getIsMale() {
		return isMale;
	}

	public void setIsMale(Boolean isMale) {
		this.isMale = isMale;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Person [firstName=" + firstName + ", lastName=" + lastName + ", alias=" + alias + ", age=" + age
				+ ", isMale=" + isMale + ", address=" + address + "]";
	}
}
