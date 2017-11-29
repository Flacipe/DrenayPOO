package beans;

public class Brigade {

	private String nom;
	public Mission mission;

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
