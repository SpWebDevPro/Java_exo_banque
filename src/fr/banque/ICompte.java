package fr.banque;

public interface ICompte {

	public default void ajouter(double unMontant) {
		this.setSolde(this.getSolde() + unMontant);
	}

	public default void retirer(double unMontant) {
		this.setSolde(this.getSolde() - unMontant);
	}

	public int getNumero();

	public void setNumero(int numero);

	public double getSolde();

	public void setSolde(double solde);
}
