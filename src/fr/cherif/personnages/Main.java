package fr.cherif.personnages;

import fr.cherif.personnages.selection.Mage;
import fr.cherif.personnages.selection.Ranger;
import fr.cherif.personnages.selection.Rogue;
import fr.cherif.personnages.selection.Warrior;

public class Main {

	public static void main(String[] args) {

		Mage mag = new Mage(600, 1000, 150, "Arkan", "Baton et sortilèges", "Eau,Air,Terre,Feu");
		Warrior war = new Warrior(1100, 150, 1000, "Kanor", "Espadon", "Terre");
		Ranger ran = new Ranger(800, 400, 750, "Falk", "Arc de glace", "Air et Eau");
		Rogue rog = new Rogue(750, 350, 800, "Shade", "Dagues", "Feu et air");

		mag.Manger();
		mag.attaquer();
		mag.voler();

		war.Sauter();
		war.attaquer();

		System.out.println(ran.getArme());
		ran.changerArme("épée d'air");
		System.out.println(ran.getArme());
		ran.attaquer();

		rog.seCacher();
		rog.attaquer();

	}

}
