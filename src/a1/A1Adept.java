package a1;

import java.util.Scanner;

public class A1Adept {
	

	public static void main(String[] args) {

		

		Scanner scan = new Scanner(System.in);



		int nItems = scan.nextInt();

		

		//Initializing arrays

		String[] prodNames = new String [nItems];

		double[] prodPrices = new double [nItems];

		

		//Taking in values for the arrays

		for (int j=0; j<nItems; j++) {

			prodNames[j] = scan.next();

			prodPrices[j] = scan.nextDouble();

		}

		

		//Number of customers

		int nCustomers = scan.nextInt();

		

		//Initializing the arrays for the prices and customers

		String[] names = new String[nCustomers];

		double[] totalCosts = new double[nCustomers];

		

		//Initializing variables

		String fName = "";

		String lName = "";

		int cartSize = 0;

		double totalCost = 0.00;

		String prodName = "";

		int prodQuant = 0;

		

		//Taking in customer's values

		for (int j=0; j<nCustomers; j++) {

			fName = scan.next();

			lName = scan.next();

			names[j] = fName + " " + lName;

			cartSize = scan.nextInt();

			totalCost = 0.00;

			

		//Taking in items from customers shopping cart

			for (int k=0; k<cartSize; k++) {

				prodQuant = scan.nextInt();

				prodName = scan.next();

				

		//Prices for each product

			for (int l=0; l<nItems; l++) {

				if (prodName.equals(prodNames[l])) {

					totalCost = (prodQuant*prodPrices[l]) +totalCost;

					l = nItems+1;		

					}

				}

			}

			totalCosts[j]=totalCost;

		}


		//Calculating max


		double maxCost = searchValMax(totalCosts);

		String maxSpender = "";

		for (int a=0; a<nCustomers; a++) {

			if(maxCost == (totalCosts[a])) {

				maxSpender = names [a];

			}

		}


		System.out.println("Largest: " + maxSpender + " ("+String.format("%.2f", maxCost)+")");

		// Calculating min 

		double minCost = searchValMin(totalCosts);

		String minSpender = "";

		for (int b=0; b<nCustomers; b++) {

			if(minCost == (totalCosts[b])) {

				minSpender = names[b];

			}

		}

	
		System.out.println("Smallest: " + minSpender + " ("+String.format("%.2f",minCost)+")");
		
		// Calculating average

		double avgCost = (calculateValSum(totalCosts)/nCustomers);

		System.out.println("Average: " +String.format("%.2f",avgCost));

	}

		// calculateValueSum 

		// Calculates the sum of an array of numbers

		// Inputs are an array of integers nums

		// Outputs integer sum of the values in nums

		// Assumptions:

		// Input array must not be null.


		static double calculateValSum(double[] nums) {
			
			double sum = 0;

			for (int j=0; j<nums.length; j++) {

				sum = sum+nums[j];

			}

			return sum;

		}

		// searchValMin

		// searches and finds the smallest value in an array of integers

		// Inputs array of integers nums

		// Outputs minimum number found within the array

		// Assumptions:

		// Input array must not be null and it has to contain at least one value.

		static double searchValMin(double[] nums) {

		// Initializing the current minimum to the first value in array.

			double a_min = nums[0];

		// Beginning with second value if applicable then compare each value

		// Inside the array with the current minimum, substitute if value is smaller.
			
			for (int i=1; i < nums.length; i++) {

				if (nums[i] < a_min) {

					a_min = nums[i];

				}

			}

			return a_min;

		}

			// searchValMax

			// searches and finds the largest value in an array of integers

			// Inputs array of integers nums

			// Outputs maximum number found within the array

			// Assumptions:

			// Input array must not be null and it has to contain at least one value.

		static double searchValMax(double[] vals) {

			// Initialize current min to first value in array.

			double a_max = vals[0];
			
			// Beginning with second value if applicable then compare each value

			// Inside the array with the current minimum, substitute if value is smaller.

			for (int i=1; i < vals.length; i++) {

				if (vals[i] > a_max) {

					a_max = vals[i];

				}

			}

			return a_max;

		}

	}