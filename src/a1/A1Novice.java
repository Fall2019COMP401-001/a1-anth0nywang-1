package a1;

import java.util.Scanner;

public class A1Novice {
	
	public static void main(String[] args) {	

		Scanner scan = new Scanner(System.in);

		// Creating a counter for the number of customers

		int countCust = scan.nextInt ();


		//Initializing variable names for the customers

		String fName = "";

		String lName = "";

		int nItems = 0;

		int items = 0;

		double price = 0.00;

		double totalCost = 0.00;

		String itemName = "";


		//Taking in values for the variables of the customers

		for (int j=0; j<countCust; j++) {

			totalCost = 0.00;

			fName = scan.next();

			lName = scan.next();

			nItems = scan.nextInt();	

		//Customer purchases item

		for (int k=0; k<nItems; k++) {

			items = scan.nextInt();

			itemName = scan.next();

			price = scan.nextDouble();

			totalCost = (items*price)+totalCost; 

		}

		//Outputting the totals for each of the customers

		String answer = fName.charAt(0) + ". " + lName + ": " + String.format("%.2f", totalCost);

		System.out.println(answer);
		
		}
	}

}