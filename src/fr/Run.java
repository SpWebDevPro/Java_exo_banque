package fr;

import fr.banque.Client;
import fr.banque.Compte;
import fr.banque.CompteRemunere;

public class Run {

	public static void main(String[] args) {

		Compte compte1 = new Compte(123123, 0);
		Compte compte2 = new Compte(456456, 0);
		Compte compte3 = new Compte(789789, 0);
		Compte compte4 = new Compte(234234, 0);
		Compte compte5 = new Compte(345345, 0);
		Compte compte6 = new Compte(678678, 50);

		Client clientA = new Client("Durand", "Pierre", 25, 1);
		Client clientB = new Client("Dupont", "Paul", 30, 2);

		System.out.println(clientA.getComptes().length);

		System.out.println(clientA.toString());
		System.out.println(clientB.toString());

		clientA.ajouterCompte(compte2);
		clientA.ajouterCompte(compte1);
		clientA.ajouterCompte(compte6);

		System.out.println(clientA.toString());

		compte1.ajouter(30);
		compte1.retirer(10);
		System.out.println(compte1.toString());

		CompteRemunere compteRem1 = new CompteRemunere(333333, 50, 0.1);
		CompteRemunere compteRem2 = new CompteRemunere(888888, 30, 0.1);
		System.out.println(compteRem1.toString());
		compteRem1.verserInterets();
		compteRem2.verserInterets();
		System.out.println(compteRem1.toString());
		System.out.println(compteRem2.toString());

//		CompteASeuil compteSeuil1 = new CompteASeuil();
//		System.out.println(compteSeuil1.toString());
//		compteSeuil1.setSeuil(10);
//		CompteASeuil compteSeuil2 = new CompteASeuil(121212, 50, 10);
//		System.out.println(compteSeuil2.toString());
//		compteSeuil1.retirer(10);
//		compteSeuil2.retirer(10);
//		System.out.println(compteSeuil2.toString());

		clientA.ajouterCompte(compteRem1);
		clientA.ajouterCompte(compteRem2);
//		clientA.ajouterCompte(compteSeuil2);
		System.out.println(clientA.toString());
//		System.out.println(clientA.getComptesRemuneres());
//		clientA.verserInteretsComptesRemuneres();
//		System.out.println(clientA.getComptesRemuneres());
		clientA.verserInteretsComptes();
		System.out.println(clientA.toString());

	}

}
