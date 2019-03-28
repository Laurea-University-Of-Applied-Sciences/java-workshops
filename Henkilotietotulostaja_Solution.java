package Workshop_C_Reading;

import java.util.Scanner;

public class Henkilotietotulostaja {

	public static void main(String[] args) {

		Scanner lukija = new Scanner(System.in);

		// Reading input from the user

		System.out.println("FILL IN YOUR PERSONAL DETAILS:");
		System.out.println("--------------------\n");

		System.out.println("First name:");
		String etunimet = lukija.nextLine();

		System.out.println("Last name:");
		String sukunimi = lukija.nextLine();

		System.out.println("Phone number:");
		String puhelin = lukija.nextLine();
		
		System.out.println("Email address:");
		String email = lukija.nextLine();
				
		System.out.println("Year of Birth:");
		int svuosi = lukija.nextInt();
		
		lukija.close(); // Closing the "lukija" object so that Eclipse does not a warning about a scanner not being closed 
		
		// Printing the results
		System.out.println("\nThank you!\n\n");
		System.out.println("YOUR PERSONAL DETAILS: ");
		System.out.println("--------------------\n");
		System.out.println("NAME: ");
		System.out.println("\t" + sukunimi + ", " + etunimet);
		System.out.println("PHONE NUMBER: ");
		System.out.println("\t" + puhelin);
		System.out.println("E-MAIL: ");
		System.out.println("\t" + email);
		System.out.println("AGE: ");
		System.out.println("\t" + (2017 - svuosi));
	}
}
