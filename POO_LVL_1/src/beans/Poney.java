package beans;

public class Poney {

	private String nom;
	private String grade;
	public Brigade brigade;

	public Poney(String nom, String grade) {
		super();
		this.nom = nom;
		this.grade = grade;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public Brigade getBrigade() {
		return brigade;
	}

	public void setBrigade(Brigade brigade) {
		this.brigade = brigade;
	}

}
