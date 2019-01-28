package fr.cherif.personnages.selection;

public class Rogue extends actions implements CombatStyleClose {

	public Rogue() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Rogue(int sante, int puissanceMagique, int puissancePhysique, String nom, String arme, String element) {
		super(sante, puissanceMagique, puissancePhysique, nom, arme, element);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void attaquer() {
		System.out.println("Ca va saigner");
	}
}
