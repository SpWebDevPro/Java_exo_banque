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
		return this.getClass().getSimpleName() + ": " + this.getNumero() + ", solde : " + this.getSolde();
	}

	public void ajouter(double unMontant) {
		this.setSolde(this.getSolde() + unMontant);
	}

	public void retirer(double unMontant) {
		this.setSolde(this.getSolde() - unMontant);
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
