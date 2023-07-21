package day10.practice;

import java.util.regex.Pattern;

class EmailValidator {
	public static boolean isValidEmail(String emailId) throws InvalidEmailException {
		if (emailId == null) {
			throw new InvalidEmailException("Email cannot be null");
		}
		String regex = "^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$";
		Boolean isMatch = Pattern.matches(regex, emailId);
		if (!isMatch) {
			throw new InvalidEmailException("Invalid Email Id");
		}
		System.out.println("Valid Email Id");
		return true;
	}
}