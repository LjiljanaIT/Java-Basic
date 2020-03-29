package osvetljenje;

import java.util.ArrayList;

public class Bicikl {
	private String tip;
	private String boja;
	private int visina;
	private ArrayList<Lampa> lampe;

	public Bicikl(String tip, String boja, int visina) {

		this.tip = tip;
		this.boja = boja;
		this.visina = visina;
		lampe = new ArrayList<>();
	}

	public String getTip() {
		return tip;
	}

	public String getBoja() {
		return boja;
	}

	public int getVisina() {
		return visina;
	}

	public void setVisina(int visina) {
		this.visina = visina;
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Bicikl \nTip: ").append(tip).append(", Boja: ").append(boja).append("\n");
		sb.append("Lampice: \n");
		for (int i = 0; i < lampe.size(); i++) {
			sb.append((i + 1) + ". " + lampe.get(i).toString());
		}
		return sb.toString();
	}

	public void dodajLampe(Lampa lampa) {

		if (lampe.size() < 3) {
			lampe.add(lampa);
			System.out.println(lampa.getColour() + " lampica je dodana.");

		} else {
			System.out.println("Nema prostora, " + lampa.getColour() + "  lampica nije dodana.");

		}
	}

	public void skloniLampu(Lampa lampa) {
		if(proveriLampu(lampa)==-1) {
			System.out.println(lampa.getColour()+" lampica nije montirana na bicikl, pa ne moze ni biti uklonjena.");
			System.out.println("Broj lampica na biciklu je nepromijenjen: "+lampe.size());
		}else {
			lampe.remove(proveriLampu(lampa));
			System.out.println(lampa.getColour()+" lampica je uklonjena.");
			System.out.println("Trenutni broj lampica na biciklu je "+lampe.size());
			
		}

	}

	public int proveriLampu(Lampa lampa) {
		int index=-1;
		for (int i = 0; i < lampe.size(); i++) {
			if (lampa.equals(lampe.get(i))) {
				index=i;
			}
		}
		return index;
	}

}


