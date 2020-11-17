package model;

import java.util.ArrayList;

import model.db.VirtualDataBase;
import model.domain.Product;

public class ProductModel {
	private static ArrayList<Product> datas = VirtualDataBase.getProducts();
	
		public ArrayList<Product> getProducts() {
			return datas;
		}
	
		public static Product getProduct(String productName) {
			for(Product product : datas) {
				if(product.getName().equals(productName)) {
					return product;
				}
			}
			return null;
		}


//import probono.exception.DuplicateException;
//import probono.exception.NotExistException;
//import probono.model.DonationModelVirtualDB;
//import probono.model.dto.Beneficiary;
//import probono.model.dto.Donator;
//import probono.model.dto.TalentDonationProject;
//import probono.view.FailView;


}

