package fr.banque;

public interface ICompteASeuil extends ICompte {

	@Override
	public default void retirer(double uneValeur) {
		if (this.getSolde() - uneValeur > this.getSeuil()) {
			// devant super, on doit écrire le nom de l'interface pour lever les pb de
			// compilateurs
			ICompte.super.retirer(uneValeur);
		} else {
			System.out.println("impossible de retirer");
		}
	}

	public double getSeuil();

	public void setSeuil(double unSeuil);
}
