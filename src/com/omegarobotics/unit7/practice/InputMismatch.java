package com.omegarobotics.unit7.practice;

/*
 * Prompt the user to enter an integer continuously.
 * If an InputMismatchException occurs, print an error message
 * and keep asking them for an int. If an int has been
 * successfully entered, stop asking the user for input
 * and print the int.
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputMismatch {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		boolean continueInput = true;

		do {
			try {
				System.out.print("Enter an integer: ");
				int number = input.nextInt();

				// Display the result
				System.out.println("The number entered is " + number);

				continueInput = false;
			} catch (InputMismatchException ex) {
				System.out.println("Try again. (Incorrect input: an integer is required)");
				input.nextLine(); // discard input
			}
		} while (continueInput);
	}
}
