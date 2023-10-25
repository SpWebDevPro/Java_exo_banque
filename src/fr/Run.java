package fr;

import fr.banque.Client;
import fr.banque.Compte;
import fr.banque.CompteASeuil;
import fr.banque.CompteASeuilRemunere;
import fr.banque.CompteRemunere;

public class Run {

	public static void main(String[] args) {

		// creation de comptes simples
		Compte compte1 = new Compte(123123, 0);
		Compte compte2 = new Compte(456456, 0);
		// Compte compte3 = new Compte(789789, 0);
		// Compte compte4 = new Compte(234234, 0);
		// Compte compte5 = new Compte(345345, 0);
		// Compte compte6 = new Compte(678678, 50);

		// creation de client
		Client clientA = new Client("Durand", "Pierre", 25, 1);
		Client clientB = new Client("Dupont", "Paul", 30, 2);

		// nombre de comptes du client quand pas de compte associé
		System.out.println(clientA.getComptes().length);

		// affichage infos client
		System.out.println(clientA.toString());
		System.out.println(clientB.toString());

		// ajout d'un compte au client
		clientA.ajouterCompte(compte2);
		// clientA.ajouterCompte(compte1);
		// clientA.ajouterCompte(compte6);
		System.out.println(clientA.toString());

		// ajouter et retirer de l'argent
		compte1.ajouter(30);
		compte1.retirer(10);
		System.out.println(compte1.toString());

		// creation compte remunéré
		CompteRemunere compteRem1 = new CompteRemunere(555555, 50, 0.1);
		CompteRemunere compteRem2 = new CompteRemunere(666666, 30, 0.1);
		System.out.println(compteRem1.toString());

		// verser les intérêts sur le compte remunere
		compteRem1.verserInterets();
		compteRem2.verserInterets();
		System.out.println(compteRem1.toString());
		System.out.println(compteRem2.toString());

		// creation compte seuil
		CompteASeuil compteSeuil1 = new CompteASeuil();
		System.out.println(compteSeuil1.toString());
		compteSeuil1.setSeuil(10);
		CompteASeuil compteSeuil2 = new CompteASeuil(121212, 50, 10);
		System.out.println(compteSeuil2.toString());

		// retirer sur le compte seuil
		compteSeuil1.retirer(10);
		compteSeuil2.retirer(10);
		System.out.println(compteSeuil2.toString());

		// ajouter compte remunéré et comptes seuil au client
		clientA.ajouterCompte(compteRem1);
		clientA.ajouterCompte(compteRem2);
		clientA.ajouterCompte(compteSeuil2);
		System.out.println(clientA.toString());

		// test 1ere façon de verser les intérêts
		System.out.println(clientA.getComptesRemuneres());
		clientA.verserInteretsComptesRemuneres();
		System.out.println(clientA.getComptesRemuneres());

		// test 2eme façon de verser les intérêts
		clientA.verserInteretsComptes();
		System.out.println(clientA.toString());

		// creation compteAseuilRemunere
		CompteASeuilRemunere compteASeuilRem1 = new CompteASeuilRemunere(333333, 100, 0.1, 10);
		CompteASeuilRemunere compteASeuilRem2 = new CompteASeuilRemunere(888888, 200, 0.1, 20);

		// ajouter compteAseuilRemunere au client
		clientA.ajouterCompte(compteASeuilRem1);
		clientA.ajouterCompte(compteASeuilRem2);

		// tester versement interet suite à implementation de l'interface
		clientA.verserInteretsComptesUsingInterface();
		System.out.println(clientA.toString());

		// tester calculer interets
		CompteRemunere compteRem3 = new CompteRemunere(999999, 200, 0.1);
		System.out.println(compteRem3.toString());

	}

}
