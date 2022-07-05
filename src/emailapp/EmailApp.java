package emailapp;

import java.util.Scanner;

public class EmailApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("First Name :");
		Scanner scan = new Scanner(System.in);
		String firstName = scan.nextLine();
		System.out.println("Last Name : ");
		String lastName = scan.nextLine();
		Email email = new Email(firstName, lastName);
		
	}

}
