package fr.cherif.personnages.selection;

public class actions {

	protected int Sante;
	protected int PuissanceMagique;
	protected int PuissancePhysique;
	protected String nom;
	protected String Arme;
	protected String Element;

	public int getSante() {
		return Sante;
	}

	public void setSante(int sante) {
		Sante = sante;
	}

	public int getPuissanceMagique() {
		return PuissanceMagique;
	}

	public void setPuissanceMagique(int puissanceMagique) {
		PuissanceMagique = puissanceMagique;
	}

	public int getPuissancePhysique() {
		return PuissancePhysique;
	}

	public void setPuissancePhysique(int puissancePhysique) {
		PuissancePhysique = puissancePhysique;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getArme() {
		return Arme;
	}

	public void setArme(String arme) {
		Arme = arme;
	}

	public String getElement() {
		return Element;
	}

	public void setElement(String element) {
		Element = element;
	}

	public actions() {
		super();
		// TODO Auto-generated constructor stub
	}

	public actions(int sante, int puissanceMagique, int puissancePhysique, String nom, String arme, String element) {
		super();
		this.Sante = sante;
		this.PuissanceMagique = puissanceMagique;
		this.PuissancePhysique = puissancePhysique;
		this.nom = nom;
		this.Arme = arme;
		this.Element = element;
	}

	public void Attaquer() {
		System.out.println("Prends Ca!");
	}

	public void Manger() {
		System.out.println("De l'énergie!");
	}

	public void Sauter() {
		System.out.println("Jump!");
	}

	public void seCacher() {
		System.out.println("Discretion");
	}

	public void changerArme(String nouvelleArme) {
		System.out.println("Essayons autre chose!");
		Arme = nouvelleArme;
	}

}
