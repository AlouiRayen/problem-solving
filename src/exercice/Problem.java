package exercice;

import java.util.*;

public class Problem {

	public int nbrOccurrenceMin(String ch, List<String> l) {
		int i = 0;
		for (String s : l) {
			if (s.toLowerCase() == ch.toLowerCase())
				;
			i++;
		}
		return i;
	}

	public int nbrOccurrenceMaj(String ch, List<String> l) {
		int i = 0;
		for (String s : l) {
			if (s.toUpperCase() == ch.toUpperCase())
				;
			i++;
		}
		return i;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String chaine = new String();
		chaine = sc.nextLine();
		String motCherche = sc.nextLine();
		List<String> mots = new ArrayList<>();
		int j = 0;
		int i = 0;
		int k = 0;

		for (char c : chaine.toCharArray()) {

			i++;
			if (c == ' ') {
				mots.add(chaine.substring(k, chaine.indexOf(c)));
				k = chaine.indexOf(c)+1;
				j++;
			}

			System.out.println(i);
			System.out.println(j + 1);
			Problem p = new Problem();
			System.out.println(p.nbrOccurrenceMin(motCherche, mots));
			System.out.println(p.nbrOccurrenceMaj(motCherche, mots));

		}
	}

}
