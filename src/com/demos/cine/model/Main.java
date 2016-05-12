package com.demos.cine.model;

public class Main {

	public static void main(String args[]) {

		Panier pa = new Panier();
		Article art1 = new Article("12345", "La vie de Coppola", 12.5, 9);
		Article art2 = new Article("12346", "Le parrain", 8.5, 29);
		pa.ajouter(art1, 1);
		pa.ajouter(art2, 5);
		System.out.println(pa);
		System.out.println(pa.getPrixTotalHT());
	}
}
