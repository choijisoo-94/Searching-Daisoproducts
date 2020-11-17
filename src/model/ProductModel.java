package model;

import java.util.ArrayList;

import model.db.VirtualDataBase;
import model.domain.Product;

public class ProductModel {
	private ArrayList<Product> datas = VirtualDataBase.getProducts();
	
		public ArrayList<Product> getProducts() {
			return datas;
		}
		public Product getProduct(String name) {
			for(Product a : datas) {
				if(a.getName().equals(name)) {
					return a;
				}
			}
			return null;
		}
		public void insert(Product a) throws Exception {
			Product p = getProduct(a.getName());
			if(p == null) {
				datas.add(a);
			}else {
				throw new Exception("상품명이 중복됩니다. 등록 불가!");
			}
		}
		public boolean update(String name, int newAmount, String newLocation) {
			boolean result = false;
			Product p = getProduct(name);
			if(p != null) {
				p.setAmount(newAmount);
				result = true;
			}else if (p != null) {
				p.setLocation(newLocation);
			result = true;
		}
		return result;
	}
		public int delete (String name) {
			int result = 0;
			Product p = getProduct(name);
			if(p != null) {
				if(datas.remove(p) == true) {
					result = 1;
				}
			}
			return result;
		}
}
