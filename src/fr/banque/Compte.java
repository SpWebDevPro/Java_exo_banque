package fr.banque;

public class Compte {

	private int numero;
	private double solde;

	public Compte() {
		this(0, 0);
	}

	public Compte(int numero, double soldeInitial) {
		this.numero = numero;
		this.solde = soldeInitial;
	}

	@Override
	public String toString() {
		return "numero de compte : " + this.numero + ", solde : " + this.solde;
	}

	public void ajouter(double unMontant) {
		this.solde = this.solde + unMontant;
	}

	public void retirer(double unMontant) {
		this.solde = this.solde - unMontant;
	}

	public int getNumero() {
		return this.numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public double getSolde() {
		return this.solde;
	}

	public void setSolde(double solde) {
		this.solde = solde;
	}

}
