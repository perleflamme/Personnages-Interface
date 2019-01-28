package fr.cherif.personnages.selection;

public class Mage extends actions implements CombatStyleMagic, Voler {

	public Mage() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Mage(int sante, int puissanceMagique, int puissancePhysique, String nom, String arme, String element) {
		super(sante, puissanceMagique, puissancePhysique, nom, arme, element);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void attaquer() {
		System.out.println("Goute à la magie pure");

	}

	@Override
	public void voler() {
		System.out.println("Par les airs");
	}

}