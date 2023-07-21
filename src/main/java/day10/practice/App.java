package day10.practice;

import java.util.Scanner;

public class App {

	public static void main(String[] args) throws InvalidEmailException {
		Scanner get = new Scanner(System.in);

		System.out.println("Enter Email:");
		String email = get.next();
		
		EmailValidator.isValidEmail(email);
	}

}
