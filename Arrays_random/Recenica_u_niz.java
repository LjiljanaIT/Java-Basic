package stringovi_i_nizovi;

import java.util.Arrays;
import java.util.Scanner;

public class Recenica_u_niz {

	public static void main(String[] args) {
		
		//Prebrojati reci u unesenoj recenici.
		
		Scanner sc = new Scanner(System.in);

		String recenica;
		String[] unosi;
		int duzina;

		System.out.println("Unesite jednu recenicu: ");
		recenica = sc.nextLine();

		unosi = recenica.split(" ");
		duzina = unosi.length;
		System.out.println("Unesena recenica se sastoji od " + duzina+" rec/i.");
		System.out.println(Arrays.toString(unosi));
		
	}

}
