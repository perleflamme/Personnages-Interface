package fr.cherif.personnages.selection;

public class Warrior extends actions implements CombatStyleClose {

	public Warrior() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Warrior(int sante, int puissanceMagique, int puissancePhysique, String nom, String arme, String element) {
		super(sante, puissanceMagique, puissancePhysique, nom, arme, element);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void attaquer() {
		System.out.println("Prends ca dans la gueule!");
	}

}
