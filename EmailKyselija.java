package Workshop_E_Methods;

import java.util.Scanner;

public class EmailKyselija {

	public static void main(String[] args) {

		String sposti = kysyEmail();
		System.out.println(sposti);
	}

	public static String kysyEmail() {
		Scanner lukija = new Scanner(System.in);
		boolean loytyi;
		String email;
		
		do {
			System.out.print("Anna email: ");
			email = lukija.nextLine();
			loytyi = (email.indexOf('@') >= 0);
		} while (loytyi != true);
		
		return email;
	}

}
