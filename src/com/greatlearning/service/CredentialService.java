package com.greatlearning.service;

import java.util.Random;
import com.greatlearning.model.*;

public class CredentialService {
	// generate email address
	public String generateEmailAddress(Employee emp) {
		return emp.getFirstName() + emp.getLastName() + "@" + emp.getDepartment() + ".company.com";
	}

	// generate password
	public String generatePassword() {
		// generate 8 digit password which can have capital letters , sall letters ,
		// numbers , special characters

		int length = 8;
		String capitalLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String smallLetters = "abcdefghijklmnopqrstuvwxyz";
		String specialCharacters = "!@#$%^&*_=+-/.?<>)";
		String numbers = "1234567890";
		String allowedChars = capitalLetters + smallLetters + numbers + specialCharacters;
		Random random = new Random();

		char[] password = new char[length];

		for (int i = 0; i < length; i++) {
			int idx = random.nextInt(allowedChars.length());
			password[i] = allowedChars.charAt(idx);
		}

		return new String(password);
	}

	public void showCredential(Employee emp, String email, String password) {
		System.out.println("Dear " + emp.getFirstName() + " here are your credentials");
		System.out.println("Email address --> : " + email);
		System.out.println("Password --> : " + password);
	}
}
