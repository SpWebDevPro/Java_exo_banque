package fr.banque;

public class CompteASeuil extends Compte implements ICompteASeuil {

	private double seuil;

	public CompteASeuil() {
		super();
	}

	public CompteASeuil(int numero, double soldeInitial, double seuil) {
		super(numero, soldeInitial);
		this.setSeuil(seuil);
	}

	@Override
	public String toString() {
		return super.toString() + ", seuil : " + this.getSeuil();
	}

	@Override
	public void retirer(double valeur) {
		if (this.getSolde() - valeur > this.getSeuil()) {
			super.retirer(valeur);
		} else {
			System.out.println("Vous n'avez pas le droit de retirer cette somme");
		}
	}

	@Override
	public double getSeuil() {
		return this.seuil;
	}

	@Override
	public void setSeuil(double seuil) {
		this.seuil = seuil;
	}

}
