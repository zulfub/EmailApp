package emailapp;

import java.util.Scanner;

public class Email {
	private String firstName;
	private String lastName;
	private String password;
	private String department;
	private String email;
	private int defaultPasswordLenght =10;
	private int mailboxCapacity=500;
	private String alternateEmail;
	private String companySuffix = "skuld.com";
	
	//Constructor for receive first name and last name
	public Email(String firstName , String lastName) {
		// 'This' for class level variable 
		this.firstName = firstName;
		this.lastName = lastName;	
		//Calling a method for asking for department - return the department
		this.department = setDepartment();
		
		//Call a method - return a random password
		this.password = randPassWord(defaultPasswordLenght);
		System.out.println("Your Password is : " + this.password);
		
		//Combine elements to generate mail
		email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department.toLowerCase() + "." + companySuffix;
		
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
	public void setMailBoxCapacity(int capacity) {
		this.mailboxCapacity = capacity;
	}
	//Set the alternate Email
	public void setAlternateEmail(String alterEmail) {
		this.alternateEmail = alternateEmail;
		
	}
	//Change Password
	public void setPassword(String passwrd) {
		this.password = passwrd;
		
	}
	public int getMailBoxCapacity() {
		return mailboxCapacity;	
		}
	public String getAlternateEmail() {
		return alternateEmail;
	}
	public String getPassword() {
		return password;
	}
	public String getPersonInfo() {
		
		return "Display Name : " + firstName + " " + lastName +
				"\nCompany Email : " + email + 
				"\nMailBox Capacity : " + mailboxCapacity + "MB";
		
	}
}
