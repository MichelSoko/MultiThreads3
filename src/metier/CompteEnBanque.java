package metier;

public class CompteEnBanque {

	private double solde;

	public CompteEnBanque(double solde) {
		this.solde = solde;
	}

	/*
	 * Lorsqu'une thread exécute du code synchronisé sur une instance, un verrou est
	 * posé sur l'instance : si une autre thread tente d'exécuter du code
	 * synchronisé sur la même instance, il est mis en attente.
	 */

	public synchronized void crediter(double montant) {
		solde = solde + montant;
	}

	public synchronized double consulter() {
		return solde;
	}

	public String toString() {
		return "Solde : " + this.consulter() + " €";
	}

}