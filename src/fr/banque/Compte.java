package fr.banque;

public class Compte implements ICompte {

	private int numero;
	private double solde;

	public Compte() {
		this(0, 0);
	}

	public Compte(int numero, double soldeInitial) {
		this.numero = numero;
		this.setSolde(soldeInitial);
	}

	@Override
	public String toString() {
		return "numero de compte : " + this.numero + ", solde : " + this.solde;
	}

	@Override
	public int getNumero() {
		return this.numero;
	}

	@Override
	public void setNumero(int numero) {
		this.numero = numero;
	}

	@Override
	public double getSolde() {
		return this.solde;
	}

	@Override
	public void setSolde(double solde) {
		this.solde = solde;
	}

}
