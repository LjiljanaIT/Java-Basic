package stringovi_i_nizovi;

public class Ascii_of_Char {

	public static void main(String[] args) {
		//Napisati metodu koja vraca ASCII code unesenog karaktera

		char unos='a';
		
		int integerValue = vratiASCII(unos);
		System.out.println(integerValue);
		
	}
	
	public static int vratiASCII(char a) {
		
		return (int) a;
	}

}
