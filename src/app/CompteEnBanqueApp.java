package app;

import metier.*;

public class CompteEnBanqueApp {

	public static void main(String[] args) {
		
		CompteEnBanque compte = new CompteEnBanque(100);
		
		Thread cred1 = new Virement(compte, 150);
		Thread cred2 = new Virement(compte, 200);
		cred1.start();
		cred2.start();
		
		try {
			cred1.join();
			cred2.join();
		} catch (InterruptedException exc) {
		}
		
		System.out.println(compte.toString());;
	
	}

}