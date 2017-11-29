package beans;

import java.util.ArrayList;
import java.util.List;

public class Mission {

	private String nom;
	static List<Brigade> ListeBrigade = new ArrayList();

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public boolean affecter(Brigade brigade) {
		if (brigade.getMission() != null) {
			return false;
		}
		brigade.setMission(this);
		ListeBrigade.add(brigade);
		return true;
	}

	public Mission(String nom) {
		super();
		this.nom = nom;
	}

	public void terminer(Brigade brigade) {
		brigade.setMission(null);
	}

}
