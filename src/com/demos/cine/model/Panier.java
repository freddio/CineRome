package com.demos.cine.model;

import java.util.ArrayList;

public class Panier {
	private ArrayList<LignePanier> contenu = new ArrayList<>();

	public void ajouter(Article a,int qte){
		LignePanier lp = new LignePanier(a,qte);
		contenu.add(lp);
	}
	
	public String toString(){
		String description="";
		for(LignePanier lp:contenu){
			description+=
	lp.getArt().getReference() +" "+lp.getQte()+"\n";		
		}
		return description;
	}
	
	public double getPrixTotalHT(){
		double prix=0;
		for(LignePanier lp:contenu){
			prix+=lp.getArt().getPrixHT()*lp.getQte();
		}
		return prix;
	}
	
	
	
	
}