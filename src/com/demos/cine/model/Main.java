package com.demos.cine.model;

public class Main {

	public static void main(String args[]) {

		Panier pa = new Panier();
		try {
		Article art1 = 
			new Article("12345", "La vie de Coppola", new Prix(12.5), 9);
		pa.ajouter(art1, 1);
		}
		catch(Exception e){
			System.out.println("article non créé car prix incorrect");
		}
		try {
		Article art2 =
			new Article("12346", "Le parrain", new Prix(8.5), 29);
		pa.ajouter(art2, 5);
		}
		catch(Exception e){
			System.out.println("article non créé car prix incorrect");
		}
		
		
		System.out.println(pa);
		System.out.println(pa.getPrixTotalHT());
	}
}
