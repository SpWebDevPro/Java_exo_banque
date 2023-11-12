package fr.banque;

public class CompteRemunere extends Compte implements ICompteRemunere {

	private double taux;
	// valeur sera comprise entre 0 et 1

	public CompteRemunere() {
		super();
	}

	public CompteRemunere(int numero, double soldeInitial, double taux) {
		super(numero, soldeInitial);
		this.taux = taux;
	}

	@Override
	public double getTaux() {
		return this.taux;
	}

	@Override
	public void setTaux(double taux) {
		this.taux = taux;
	}

	@Override
	public String toString() {
		return super.toString() + ", taux : " + this.getTaux() + ", interêts : " + this.calculerInterets();
	}

}
