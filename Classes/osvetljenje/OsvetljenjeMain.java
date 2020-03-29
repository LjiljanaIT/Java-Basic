package osvetljenje;

public class OsvetljenjeMain {

	public static void main(String[] args) {
		/*
		 * Lampa ima svoj status (on ili off) i boju kojom svetli. Bicikl ima svoj tip,
		 * boju, visinu sedista koja moze da se podesava i moze da sadrzi lampe. Moguce
		 * je procitati stanje svih lampica. Podrazumevati da ih ima najvise 3.
		 * Testirati prethodno napisane klase. 
		 * Pretpostavka: Lampe mogu samo da se dodaju na
		 * bicikl. Trenutno resenje zadatka ne predvidja skidanje ili zamenu.
		 */

		Lampa l1 = new Lampa("crvena");//kreiramo lampu

		System.out.println("Status " + l1.getStatus());//palimo i gasimo lampu

		l1.changeStatus();

		System.out.println("Status " + l1.getStatus());

		l1.changeStatus();

		System.out.println("Status " + l1.getStatus());

		Lampa l2 = new Lampa("plava");
		Lampa l3 = new Lampa("zelena");
		Lampa l4 = new Lampa("narandzasta");

		Bicikl b1 = new Bicikl("tip1", "metalik", 16);//kreiramo bicikl

		b1.dodajLampe(l1);//dodajemo lampe
		b1.dodajLampe(l2);
		b1.dodajLampe(l3);
		b1.dodajLampe(l4);//pokusaj dodavanja vise od 3 lampe

		System.out.println(b1);

		l1.changeStatus();
		System.out.println(b1);
		
		b1.skloniLampu(l1);//sklanjanje lampi sa bicikla, i postojecih i nepostojecih....
		
		b1.skloniLampu(l1);
		b1.skloniLampu(l2);
		b1.skloniLampu(l3);
		b1.skloniLampu(l4);
		
		b1.dodajLampe(l1);
		b1.dodajLampe(l1);
		b1.dodajLampe(l1);
		
		System.out.println(b1);
		
		l1.changeStatus();//kad se ugasi crvena lampa, promjeni se status svih lampica montiranih na bicikl. 
		                  //Sad bi bilo interesantno napraviti da se mijenja status pojedinih lampica na bisiklu, ali o tom po tom....
		
		System.out.println(b1);
		

	}

}
