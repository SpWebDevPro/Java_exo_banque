package fr.banque;

public class CompteASeuil extends Compte {

	private double seuil;

	public CompteASeuil() {
		super();
	}

	public CompteASeuil(int numero, double soldeInitial, double seuil) {
		super(numero, soldeInitial);
		this.seuil = seuil;
	}

	public double getSeuil() {
		return this.seuil;
	}

	public void setSeuil(double seuil) {
		this.seuil = seuil;
	}

	@Override
	public String toString() {
		return super.toString() + ", seuil : " + this.getSeuil();
	}

	@Override
	public void retirer(double valeur) {
		if (this.getSolde() - valeur > this.seuil) {
			super.retirer(valeur);
		} else {
			System.out.println("Vous n'avez pas le droit de retirer cette somme");
		}
	}

}
