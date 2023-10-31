package fr.banque;

public class CompteRemunere extends Compte {

	private double taux;

	public CompteRemunere() {
		super();
	}

	public CompteRemunere(int numero, double soldeInitial, double taux) {
		super(numero, soldeInitial);
		this.setTaux(taux);
	}

	@Override
	public String toString() {
		return super.toString() + ", taux : " + this.getTaux() + ", interêts : " + this.calculerInterets();
	}

	public double calculerInterets() {
		return this.getTaux() * super.getSolde();
	}

	public void verserInterets() {
		this.setSolde(this.getSolde() + this.calculerInterets());
	}

	public double getTaux() {
		return this.taux;
	}

	public void setTaux(double taux) {
		if (taux >= 0 && taux < 1) {
			this.taux = taux;
		} else {
			this.taux = 0;
		}
	}

}
