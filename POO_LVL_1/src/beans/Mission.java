package beans;

public class Mission {

	private String nom;

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
		return true;
	}

	public void terminer(Brigade brigade) {
		brigade.setMission(null);
	}

}
