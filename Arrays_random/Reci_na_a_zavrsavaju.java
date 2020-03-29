package stringovi_i_nizovi;

import java.util.Arrays;
import java.util.Scanner;

public class Reci_na_a_zavrsavaju {

	public static void main(String[] args) {
		// u unesenoj recenici, prebrojati reci koje se zavrsavaju na slovo "a".
		// Pretpostavka: korisnik ne unosi znake interpunkcije

		Scanner sc = new Scanner(System.in);

		String recenica;

		System.out.println("Unesite jednu recenicu: ");
		recenica = sc.nextLine();

		System.out.println("Unesena recenica sadrzi " + prebrojiReci(recenica) + " rec/i koje se zavrsavaju na 'a'.");

	}

	public static int prebrojiReci(String recenica) {
		String[] unosi;
		int duzina, brojac = 0;
		recenica = recenica.toLowerCase();
		unosi = recenica.split(" ");
		duzina = unosi.length;
		for (int i = 0; i < duzina; i++) {
			if (unosi[i].endsWith("a")) {
				brojac++;
			}

		}
		return brojac;

	}

}
