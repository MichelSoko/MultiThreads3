package metier;

public class Virement extends Thread {
	
	CompteEnBanque compte;
	Double montant;
	
	public Virement(CompteEnBanque compte, double montant) {
		this.compte = compte;
		this.montant = montant;
	}
	
	public void run() {
		for (int i=1; i<=1000; i++) {
			compte.crediter(montant);
			// System.out.println(compte.toString());
		}
	}
	
}