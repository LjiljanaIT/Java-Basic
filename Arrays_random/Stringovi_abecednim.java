package stringovi_i_nizovi;

import java.util.Arrays;
import java.util.Scanner;

public class Stringovi_abecednim {

	public static void main(String[] args) {
		//poredati uneseni niz reci abecednim redom

		Scanner sc = new Scanner(System.in);

		String rec;
		int duzina;
		String[] spisak;

		System.out.println("Koliko reci unosite? ");
		duzina = sc.nextInt();
		spisak=unosNiza(sc,duzina);
		
			
		}
		

	public static String[] unosNiza(Scanner sc, int duzina) {
		String[] spisak=new String[duzina];
		for(int i=0;i<duzina;i++) {
			System.out.println("Unesite "+(i+1)+". rec: ");
			spisak[i] = sc.next();
		}
		return spisak;
	}

}
