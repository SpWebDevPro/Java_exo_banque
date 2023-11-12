package fr.banque;

public class CompteASeuil extends Compte implements ICompteASeuil {

	private double seuil;

	public CompteASeuil() {
		super();
	}

	public CompteASeuil(int numero, double soldeInitial, double seuil) {
		super(numero, soldeInitial);
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
	public String toString() {
		return super.toString() + ", seuil : " + this.getSeuil();
	}

}
