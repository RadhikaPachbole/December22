package com.Exercise.Author;

public class TestAuthor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Author n1 = new Author();
		Author n2 = new Author("Abdul", "kalam", "Wings of Fire");
		Author n3 = new Author("Abdul", "kalam", "Wings of Fire");
		System.out.println("/n Author's First Name :" + n2.getFirstName());
		System.out.println("/n Author's Last Name :" + n2.getLastName());
		System.out.println("/n Author's Name : " + n3.getBookName());
	}

}
