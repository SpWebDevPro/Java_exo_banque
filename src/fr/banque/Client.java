package fr.banque;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Client {

	private String nom;
	private String prenom;
	private int age;
	private int numero;
	private Compte[] comptes = new Compte[5];
	private int compteur = 0;

	public Client() {
		this("", "", 0, 0);
	}

	public Client(String nom, String prenom, int age, int numero) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
		this.numero = numero;

	}

	@Override
	public String toString() {
		return this.getClass().getSimpleName() + " : " + this.nom + " " + this.prenom + " | numero client : "
				+ this.numero + " | Comptes :" + this.listComptes();
	}

	public String listComptes() {
		return Arrays.toString(this.comptes);
	}

	public void ajouterCompte(Compte unCompte) {
		if (unCompte == null) {
			return;
		}
		if (this.getCompteur() > 4) {
			System.out.println("Maximum de comptes atteints!");
			return;
		}
		for (int i = 0; i < this.comptes.length; i++) {
			if (this.comptes[i] == null) {
				this.comptes[i] = unCompte;
				this.compteur++;
				return;
			}
		}
	}

	public int getCompteur() {
		return this.compteur;
	}

	public Compte getCompte(int numeroCompte) {
		Compte compteTrouve = null;
		for (Compte compte : this.comptes) {
			if (compte.getNumero() == numeroCompte) {
				compteTrouve = compte;
			}
		}
		if (compteTrouve == null) {
			System.out.println("Aucun compte ne correspond à ce numero de compte");
		}
		return compteTrouve;
	}

	public String getNom() {
		return this.nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return this.prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public int getAge() {
		return this.age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getNumero() {
		return this.numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public Compte[] getComptes() {
		return this.comptes;
	}

	public void setComptes(Compte[] comptes) {
		this.comptes = comptes;
	}

	// verser les intérêts sur les comptes :

	// soit on filtre d'abord les comptes rémunérés
	public List<CompteRemunere> getComptesRemuneres() {
		List<CompteRemunere> comptesRemunereList = new ArrayList<>();
		for (Compte compte : this.getComptes()) {
			if (compte instanceof CompteRemunere) {
				comptesRemunereList.add((CompteRemunere) compte);
			}
		}
		return comptesRemunereList;
	}

	public void verserInteretsComptesRemuneres() {
		for (CompteRemunere compte : this.getComptesRemuneres()) {
			compte.verserInterets();
		}
	}

	// soit on boucle directement sur tous les comptes
	public void verserInteretsComptes() {
		for (Compte compte : this.comptes) {
			if (compte instanceof CompteRemunere) {
				((CompteRemunere) compte).verserInterets();
			}
		}
	}

	public void verserInteretsComptesUsingInterface() {
		for (Compte compte : this.comptes) {
			if (compte instanceof CompteASeuilRemunere) {
				((CompteASeuilRemunere) compte).verserInterets();
			}
		}
	}
}
