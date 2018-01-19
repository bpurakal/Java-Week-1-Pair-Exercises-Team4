package com.techelevator;

import java.util.Scanner;

/*
 Write a command line program which prompts the user for the total bill, and the amount tendered. It should then display the change required.
 
 Example:
 
 Please enter the amount of the bill: 23.65
 Please enter the amount tendered: 100.00
 The change required is 76.35
 */
public class MakeChange {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the amount of the bill: ");
		String amountOfBill = input.nextLine();
		System.out.println("Please enter the amount tendered: ");
		String amountTendered = input.nextLine();
		
		double actualAmount = Double.parseDouble(amountOfBill);
		double actualAmountTendered = Double.parseDouble(amountTendered);
		double change = actualAmountTendered - actualAmount;
		
		
		System.out.print("Change required is " +change );

	}

}
