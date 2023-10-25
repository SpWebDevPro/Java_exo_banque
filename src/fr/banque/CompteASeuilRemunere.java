package fr.banque;

public class CompteASeuilRemunere extends CompteRemunere implements ICompteASeuil {

	private double seuil;

	public CompteASeuilRemunere() {
		this(000000, 0, 0, 0);
	}

	public CompteASeuilRemunere(int numero, double soldeInitial, double taux, double seuil) {
		super(numero, soldeInitial, taux);
		this.seuil = seuil;
	}

	@Override
	public double getSeuil() {
		return this.seuil;
	}

	@Override
	public void setSeuil(double seuil) {
		this.seuil = seuil;
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
