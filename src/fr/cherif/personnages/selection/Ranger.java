package fr.cherif.personnages.selection;

public class Ranger extends actions implements CombatStyleRanged {

	public Ranger() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Ranger(int sante, int puissanceMagique, int puissancePhysique, String nom, String arme, String element) {
		super(sante, puissanceMagique, puissancePhysique, nom, arme, element);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void attaquer() {
		System.out.println("Subit mon courroux");
	}

}
