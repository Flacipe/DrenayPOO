package launch;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import beans.Brigade;
import beans.Mission;
import beans.Poney;

public class test {

	static List<Poney> ListePoneys = new ArrayList();
	static List<Brigade> ListeBrigade = new ArrayList();
	static List<Mission> ListeMission = new ArrayList();

	public static void main(String[] args) {
		while (true) {
			String s = "a";
			String nom;
			String grade;
			String nomBrigade;
			Scanner in = new Scanner(System.in);
			System.out.println(
					"Que voulez vous faire ? Entrez 'P' pour acc�der au menu des poneys, 'B' pour acc�der au menu des brigades ou 'M' pour acc�der au menu des missions.");
			s = in.nextLine();
			System.out.println(s);
			if (s.equals("p") || s.equals("P")) {
				System.out.println("Entrez 'A' pour ajouter un poney");
				s = in.nextLine();
				if (s.equalsIgnoreCase("a")) {
					System.out.println("Pour ajouter un poney, merci d'entrer son Nom puis son grade.");
					nom = in.nextLine();
					grade = in.nextLine();
					ListePoneys.add(new Poney(nom, grade));
				}
			} else if (s.equalsIgnoreCase("b")) {
				System.out.println(
						"Entrez 'A' pour cr�er une nouvelle brigade, 'S' pour en supprimer une ou une autre touche pour recruter un poney dans une brigade");
				s = in.nextLine();
				if (s.equals('a') || s.equals('A')) {
					System.out.println("Entrez le nom de la nouvelle Brigade");
					nom = in.nextLine();
					ListeBrigade.add(new Brigade(nom));
				} else if (s.equals('s') || s.equals('S')) {
					System.out.println("Entrez le nom de la brigade � supprimer");
					nom = in.nextLine();
					ListeBrigade.remove(nom);
				}
				System.out.println("Entrez le nom de la brigade puis le nom du poney � ajouter");
				nom = in.nextLine();
				nomBrigade = in.nextLine();
				for (Brigade brigade : ListeBrigade) {
					if (brigade.getNom().equals(nomBrigade)) {
						for (Poney poney : ListePoneys) {
							if (poney.getNom().equals(nom)) {
								brigade.recruter(poney);
							}
						}
					}
				}
			}
			if (s.equalsIgnoreCase("m")) {
				System.out.println(
						"Pour cr�er une mission, entrez a, pour affecter une brigade � une mission entrez n ou entrez autre chose pour finir une mission");
				s = in.nextLine();
				if (s.equalsIgnoreCase("a")) {
					System.out.println("entrez le nom de la nouvelle mission");
					nom = in.nextLine();
					new Mission(nom);
				} else if (s.equalsIgnoreCase("n")) {
					System.out.println("Entrez le nom de la brigade, puis le nom de la mission � laquelle l'affecter");
					String nombrigade = in.nextLine();
					String nommission = in.nextLine();
					for (Mission mission : ListeMission) {
						if (mission.getNom().equalsIgnoreCase(nommission)) {
							for (Brigade brigade : ListeBrigade) {
								if (brigade.getNom().equalsIgnoreCase(nombrigade)) {
									mission.affecter(brigade);
								}
							}
						}
					}
				} else
					for (Brigade brigade : ListeBrigade) {
						nom = in.nextLine();
						if (brigade.getMission().equals(nom)) {
							brigade.mission.terminer();
						}
					}

			}
			for (Brigade brigade : ListeBrigade) {
				System.out.println(brigade.getNom());
				System.out.println(brigade.getMission());
			}
			for (Poney poney : ListePoneys) {
				System.out.println(poney.getNom());
				System.out.println(poney.getGrade());
				System.out.println(poney.getBrigade());
			}
		}
	}
}
