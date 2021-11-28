package com.greatlearning.main;

import java.util.Scanner;
import com.greatlearning.model.*;
import com.greatlearning.service.*;

public class Driver {
//Declare main method
	private static Scanner sc = new Scanner(System.in);

	public static void display_menu() {
		System.out.println("Please enter the department from the following: ");
		System.out.println("1. Technical \n2. Admin \n3. Human Resource \n4. Legal \n ");
		System.out.print("Selection: ");
	}

	public static void main(String[] args) {
		Employee emp = new Employee("", "", "");
		Scanner choice = new Scanner(System.in);

		// Take input from user for firstName , lastName , choice - department
		System.out.println("Please enter your First Name: ");
		String firstNameInput = sc.next();

//		System.out.println("Entered First Name is : " + firstNameInput);

		System.out.println("Please enter the Last Name: ");
		String lastNameInput = sc.next();

//		System.out.println("Entered Last Name is : " + lastNameInput);

		// Switch case and create an object of employee passing the firstName ,
		// lastName, department - "tech" , "adm" , "hr" , "lg"

		display_menu();
		switch (choice.nextInt()) {
		case 1:
//			System.out.println("You picked option 1. Technical");
			// Create an object
			emp = new Employee(firstNameInput, lastNameInput, "tech");
			break;
		case 2:
//			System.out.println("You picked option 2. Admin");
			emp = new Employee(firstNameInput, lastNameInput, "adm");

			break;
		case 3:
//			System.out.println("You picked option 3. Human Resource");
			emp = new Employee(firstNameInput, lastNameInput, "hr");
			break;
		case 4:
//			System.out.println("You picked option 4. Legal");
			emp = new Employee(firstNameInput, lastNameInput, "lg");
			break;
		default:
			System.err.println("Unrecognized option");
			break;
		}
//		System.out.println("Your Credentials are ");
		CredentialService cs = new CredentialService();
		String email = cs.generateEmailAddress(emp);
//		System.out.println("Email address : " + email);
		String password = cs.generatePassword();
//		System.out.println("Password : " + password);
		cs.showCredential(emp, email, password);
	}

}
