package com.Exercise.Author;

public class Author {

	 String firstName;
	 String lastName;
	 String bookName;
	public  Author()
	 {
		 
	 }
	
	public Author(String name, String lastName) {
		this.firstName=name;
		this.lastName=lastName;
		
	}
	

	public Author(String firstName, String lastName, String bookName) {
		
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

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	@Override
	public String toString() {
		return "Author [firstName=" + firstName + ", lastName=" + lastName + ", bookName=" + bookName + "]";
	}
	
}
