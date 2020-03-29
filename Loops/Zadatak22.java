package test1_02_24;

import java.util.Scanner;

public class Zadatak22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		String unos, unos_l;
		boolean pogodak = false;
		int j = 1; // brojac pokusaja

		System.out.println("Pogadjajte zamisljenu rec! Imate 5 pokusaja!");
		;

		do {
			System.out.println("Unesite rec: ");
			unos = sc.nextLine();
			unos_l=unos.toLowerCase();
			if (unos_l.equals("flasa")) {
				System.out.println("Pogodili ste rec!");
				pogodak = true;
			} else {
				System.out.println("Niste pogodili! ");
			}
			j++;
			if (j > 5) {
				System.out.println("Nemate vise pokusaja");
			}

		} while (!pogodak && j <= 5);

		sc.close();
	}

}
