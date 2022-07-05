package emailapp;

import java.util.Scanner;

public class Email {
	private String firstName;
	private String lastName;
	private String password;
	private String department;
	private String email;
	private int defaultPasswordLenght =10;
	private int mailboxCapacity;
	private String alternateEmail;
	private String companySuffix = "skuld.com";
	
	//Constructor for receive first name and last name
	public Email(String firstName , String lastName) {
		// 'This' for class level variable 
		this.firstName = firstName;
		this.lastName = lastName;
		System.out.println("Email Created : " + this.firstName + " " +this.lastName );		
		//Calling a method for asking for department - return the department
		this.department = setDepartment();
		System.out.println("Department : " + this.department);
		
		//Call a method - return a random password
		this.password = randPassWord(defaultPasswordLenght);
		System.out.println("Your Password is : " + this.password);
		
		//Combine elements to generate mail
		email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department.toLowerCase() + "." + companySuffix;
		System.out.println("Your email is : " + email);
		
	}
	
	//Ask for department
	private String setDepartment() {
		System.out.println("Department Codes \n1 for Sales \n2 for Development \n3 for Accounting \n0 for none\nEnter the Department :");
		Scanner scan = new Scanner(System.in);
		int departChose = scan.nextInt();
		if(departChose == 1) return "sales";
		else if (departChose == 2) return "dev";
		else if (departChose == 3) return "Acct";
		else return "";		
	}
	//Generate a random password
	private String randPassWord(int lenght) {
		String passSet ="abcdefghijlkmnprotuvyzABCDEFGHIJLKMNPROTUVYZ0123456789!@#$½";
		char[] passwrd = new char[lenght];
		for(int i=0; i<lenght; i++) {			
			int rand = (int) (Math.random() * passSet.length());
			passwrd[i] = passSet.charAt(rand);
		}			
		
		return new String(passwrd);
	}
	
	//Set the mailbox capacity
	
	//Set the alternate Email
	
}
