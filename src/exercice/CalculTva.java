package exercice;

import java.util.*;

public class CalculTva {

	class Vente {
		public double prix;
		public int quantite;
		public String description;
		double tht;
		double ttc;
		double tva;

	}

	static public void main(String[] args) {

		List<Vente> listeVente = new ArrayList<>();
		int i = 0;
		CalculTva ct = new CalculTva();

		Scanner sc = new Scanner(System.in);

		while (i < 3) {
			String input = sc.nextLine();
			if (input.isEmpty() == false) {

				if (i == 0) {
					Vente v = ct.new Vente();
					listeVente.add(v);
					double prixEntree = Double.parseDouble(input);
					v.prix = prixEntree;
					i++;

				} else if (i == 1) {

					int quantiteAchete = Integer.parseInt(input);
					Vente v = listeVente.get(listeVente.size() - 1);
					v.quantite = quantiteAchete;
					i++;

				} else {

					String description = input;
					Vente v = listeVente.get(listeVente.size() - 1);
					v.description = description;

					i = 0;
				}
			} else
				i = 3;

		}
		sc.close();
		double TotalTva = 0;
		double TotalHt = 0;
		double TTC = 0;
		System.out.println("prix|  quantité|  description|  TTC unitaire| TTC");
		for (Vente vt : listeVente) {
			System.out.println("--------------------------------------------");
			System.out.print(vt.prix + "|	");
			System.out.print(vt.quantite + "|	   ");
			System.out.print(vt.description + "|     	");
			double ttcUnitaire = vt.prix + ((vt.prix * 20) / 100);
			System.out.print(ttcUnitaire + "           	");
			vt.ttc = (vt.prix * vt.quantite) + ((vt.prix * vt.quantite * 20) / 100);
			System.out.println(vt.ttc);
			vt.tht = vt.prix * vt.quantite;
			vt.tva = ((vt.prix * vt.quantite * 20) / 100);
			TotalTva = TotalTva + vt.tva;
			TotalHt = TotalHt + vt.tht;
			TTC = TTC + vt.ttc;

		}
		System.out.print("										 ");
		System.out.println("totalHT|TotalTva| TTC");
		System.out.print("										 ");
		System.out.println(TotalHt + "|   " + TotalTva + "|    " + TTC);
		
	}

}
