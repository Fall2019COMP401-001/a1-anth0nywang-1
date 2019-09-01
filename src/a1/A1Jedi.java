package a1;

import java.util.Scanner;

public class A1Jedi {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

int nItems = scan.nextInt();

		// Initializing the arrays

		String[] prodNames = new String[nItems];

		int[] prodTotal = new int [nItems];

		int[] custTotal = new int [nItems];

		int[] custItems = new int [nItems];

		double skip = 0.00;


		// Filling in the arrays with items and prices

		for (int j=0; j<nItems; j++) {

			prodNames[j] = scan.next();

			skip = scan.nextDouble();

			prodTotal[j] = 0;

			custTotal[j] = 0;

			custItems[j] = 0;

		}


		int nCustomers = scan.nextInt();


		// Initializing the arrays for names and costs

		String[] names = new String[nCustomers];


		// Initializing each variable

		String fName = "";

		String lName = "";

		int cartSize = 0;

		String prodName = "";

		int prodNum = 0;


		// Each customer

		for (int j=0; j<nCustomers; j++) {

			fName = scan.next();

			lName = scan.next();

			names[j] = fName + " " + lName;

			cartSize = scan.nextInt();

			for (int k =0; k<nItems; k++) {

				custItems[k] = 0;

			}

		// Each item that is added to a customer's shopping cart

			for (int l=0; l<cartSize; l++) {

				prodNum = scan.nextInt();

				prodName = scan.next();

				

		// To find the price of each item

				for (int m=0; m<nItems; m++) {

					if (prodName.equals(prodNames[m])) {

						if (custItems[m] == 0) {

							custItems[m] += 1;

						}

						prodTotal[m] += prodNum;

						m = nItems + 1;

					}

				}

			}

			for (int n=0; n<nItems; n++) {

				custTotal[n] += custItems[n];

			}

		}

		for (int o=0; o<nItems; o++) {

			if (prodTotal[o] == 0) {

				System.out.println("No customers bought " + prodNames[o]);

			} else {

				System.out.println(custTotal[o] + " customers bought " + prodTotal[o] + " " + prodNames[o]);

			}
		}

	}
}