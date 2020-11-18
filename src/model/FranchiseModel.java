package model;

import java.util.ArrayList;

import model.db.FranchiseDataBase;
import model.domain.Franchise;

public class FranchiseModel {
	private static ArrayList<Franchise> franchises = FranchiseDataBase.getFranchises();
	
	public ArrayList<Franchise> getFranchises() {
		return franchises;
	}
	
	public Franchise selectFranchises(String productName) {
		for(Franchise franchise : franchises) {
			if(franchise.getName().equals(productName)) {
					return franchise;
			}
		}
		return null;
	}
	
	public static Franchise getFranchise(String productName) {
		for(Franchise franchise : franchises) {
			if(franchise.getName().equals(productName)) {
				return franchise;
			}
		}
		return null;
	}
}
