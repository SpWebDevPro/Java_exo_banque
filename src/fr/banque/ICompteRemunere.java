package fr.banque;

public interface ICompteRemunere extends ICompte {

	public default double calculerInterets() {
		return this.getSolde() * this.getTaux();
	}

	public default void verserInterets() {
		this.ajouter(this.calculerInterets());
	}

	public double getTaux();

	public void setTaux(double unTaux);
}
