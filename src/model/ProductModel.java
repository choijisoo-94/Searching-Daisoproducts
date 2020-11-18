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

	public void productinsert(Product newProduct) throws Exception {
		Product Product = getProduct(newProduct.getName());

		if (Product == null) {
			VirtualDataBase.getProducts().add(newProduct);
		} else {
			throw new Exception("상품명이 이미 존재합니다.");
		}
	}

	public void productupdate(String newName, int newAmount) throws Exception {
		Product product = getProduct(newName);

		if (product == null) {
			throw new Exception("재고량 수정 불가 - 수정하고자 하는 상품명이  존재하지 않습니다. 재확인 해주세요.");
		} else {
			product.setName(newName);
			product.setAmount(newAmount);
		}
	}
	
	public void productupdate2(String newName, String newLocation) throws Exception {
		Product product = getProduct(newName);

		if (product == null) {
			throw new Exception("재고위치 수정 불가 - 수정하고자 하는 상품명이  존재하지 않습니다. 재확인 해주세요.");
		} else {
			product.setName(newName);
			product.setLocation(newLocation);
		}
	}

	public void productdelete(String name) throws Exception {
		Product product = getProduct(name);
		
		if (product != null) {
			VirtualDataBase.getProducts().remove(product);
			}else {
				throw new Exception("삭제하고자 하는 상품이 존재하지 않습니다.");
		}
	}
}

