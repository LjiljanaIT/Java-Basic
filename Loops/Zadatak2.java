package test1_02_24;

import java.util.Scanner;

public class Zadatak2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Napisati program u programskom jeziku Java koji ispunjava sledece
		 * funkcionalnosti: - Sacuva jednu rec proizvoljno odabranu u jednoj
		 * promeljivoj. Omogucava korisniku da unosi reci sve dok ne pogodi rec koja je
		 * odabrana u prethodnom koraku. Nakon svakog korisnickog unosa ispisati poruku
		 * da li je pogodio rec ili nije
		 */

		Scanner sc = new Scanner(System.in);

		String unos, unos_l;
		boolean pogodak = false;
		System.out.println("Pogadjajte zamisljenu rec!");
		;

		do {
			System.out.println("Unesite rec: ");
			unos = sc.nextLine();
			unos_l=unos.toLowerCase();
			if (unos_l.equals("flasa")) {
				System.out.println("Pogodili ste rec!");
				pogodak = true;
			} else {
				System.out.println("Niste pogodili! Pokusajte ponovo!");
			}
		} while (!pogodak);

		sc.close();
	}
}
