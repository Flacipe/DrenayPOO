package beans;

import java.util.ArrayList;
import java.util.List;

public class Brigade {

	private String nom;
	public Mission mission;
	public List<Poney> ListePoneys = new ArrayList();

	public Brigade(String nom) {
		super();
		this.nom = nom;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Mission getMission() {
		return mission;
	}

	public void setMission(Mission mission) {
		this.mission = mission;
	}

	public boolean recruter(Poney poney) {
		if (poney.getBrigade() != null) {
			return false;
		}
		poney.setBrigade(this);
		ListePoneys.add(poney);
		return true;
	}

	public boolean virer(Poney poney) {
		if (poney.getBrigade() != this) {
			return false;
		}
		poney.setBrigade(null);
		return true;
	}
}
