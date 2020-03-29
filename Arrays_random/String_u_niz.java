package stringovi_i_nizovi;

import java.util.Arrays;
import java.util.Scanner;

public class String_u_niz {

	public static void main(String[] args) {
		// Ucitanu rec pretvoriti u niz i provjetiri broj karaktera

		Scanner sc = new Scanner(System.in);

		String unos;
		int duzina;
		char[] unosi;

		System.out.println("Unesite jednu rec: ");
		unos = sc.next();

		unosi = unos.toCharArray();
		duzina = unosi.length;
		System.out.println("Duzina unesene reci je " + duzina);
		System.out.println(Arrays.toString(unosi));

		
	  
	}

}
