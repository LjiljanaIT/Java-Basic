package test1_02_24;

import java.util.Scanner;

public class Zadatak1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Napisati program u programskom jeziku java koji: - Od korisnika trazi da
		 * unosi mesecne plate koje je zaradio u prethodnih 7 meseci. - Racuna i ispise
		 * prosek primanja.
		 */

		Scanner sc = new Scanner(System.in);

		float plata, suma, prosek;//prosek suvisna promenljiva - "sum"
		suma = 0;
		plata = 0;
		System.out.print("Unesite iznos mesecnih plata zaradjenih u prethodnih 7 meseci");

		for (int j = 0; j <= 6; j++) {

			do {
				plata = sc.nextFloat();
				if (plata < 0) {
					System.out.print("Unesite pozitivnu vrednost");
				}
			} while (plata < 0);
			suma = suma + plata; //ili: suma += plata
		}
		prosek = suma / 7;//moglo se odmah na print suma/7
		System.out.println("Prosek Vasih primanja u prethodnih 7 meseci iznosi " + prosek + " dinara.");

		sc.close();
	}

}
