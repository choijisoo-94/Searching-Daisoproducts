package model;

import java.util.ArrayList;

import model.db.VirtualDataBase;
import model.domain.Product;

public class ProductModel {
<<<<<<< HEAD
	private static ArrayList<Product> datas = VirtualDataBase.getProducts();
	
		public ArrayList<Product> getProducts() {
			return datas;
		}
	
		public static Product getProduct(String productName) {
			for(Product product : datas) {
				if(product.getName().equals(productName)) {
					return product;
				}
=======
	private ArrayList<Product> datas = VirtualDataBase.getProducts();

	public ArrayList<Product> getProducts() {
		return datas;
	}

	public Product getProduct(String name) {
		for (Product product : datas) {
			if (product.getName().equals(name)) {
				return product;
>>>>>>> dc15594c554769f17def89a19438e85cc40a6c6d
			}
		}
<<<<<<< HEAD


//import probono.exception.DuplicateException;
//import probono.exception.NotExistException;
//import probono.model.DonationModelVirtualDB;
//import probono.model.dto.Beneficiary;
//import probono.model.dto.Donator;
//import probono.model.dto.TalentDonationProject;
//import probono.view.FailView;


=======
		return null;
	}

	public void productinsert(Product newProduct) throws Exception {
		Product Product = getProduct(newProduct.getName());

		if (Product == null) {
			VirtualDataBase.getProducts().add(newProduct);
		} else {
			throw new Exception("��ǰ���� �̹� �����մϴ�.");
		}
	}

	public void productupdate(String newName, int newAmount) throws Exception {
		Product product = getProduct(newName);

		if (product == null) {
			throw new Exception("��ǰ�̸��� ������Ʈ �ϰ��� �ϴ� ��ǰ��  �������� �ʽ��ϴ�.");
		} else {
			product.setName(newName);
			product.setAmount(newAmount);
		}
	}
	
	public void productupdate2(String newName, String newLocation) throws Exception {
		Product product = getProduct(newName);

		if (product == null) {
			throw new Exception("��ǰ�̸��� ������Ʈ �ϰ��� �ϴ� ��ǰ��  �������� �ʽ��ϴ�.");
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
				throw new Exception("�����ϰ��� �ϴ� ��ǰ�� �������� �ʽ��ϴ�.");
		}
	}
>>>>>>> dc15594c554769f17def89a19438e85cc40a6c6d
}

