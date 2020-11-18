package controller;

import java.util.ArrayList;
import customer.view.EndView;
import model.ProductModel;
import model.domain.Product;

import view.FailView;


public class ProductController {
	private static ProductModel pm = new ProductModel();
	static FranchiseController fcontroller = new FranchiseController();
	
	public static void getProductList() {
		ArrayList<Product> productList = pm.getProducts();
		
		if(productList.size() != 0) {
			EndView.viewProdAll(productList);
		}else {
			EndView.invalidateReq("��� ��ǰ�� �������� �ʽ��ϴ�.");
		}
	}
	public static void getProduct(String name) {
		if(name != null) {
			Product product = pm.getProduct(name);
			EndView.viewProd(product);
		}
	}
	public static void insertProductList(Product newProduct) {
		if(newProduct != null) {
			try {
				pm.productinsert(newProduct);
				EndView.validateReq("��ǰ ��� �Ϸ�");
			}catch (Exception e) {
				//e.printStackTrace();
				FailView.failMessageView(e.getMessage());
			}
		}else {
		EndView.invalidateReq("���� �����ϰ��� �ϴ� ��ǰ�� �Է� ������ �̹� �����մϴ�. ��Ȯ�� ���ּ���." );
	}
	}
	public static void updateProduct(String name, int amount) {
		if(name != null && amount != 0) {
			try {
				pm.productupdate(name, amount);
			}catch (Exception e) {
				FailView.failMessageView(e.getMessage());
			}
		}else {
			EndView.invalidateReq("�����ϰ��� �ϴ� ��ǰ��� �������� �ʽ��ϴ�. ��Ȯ�� ���ּ���.");
		}
	}
	public static void updateProduct2(String name, String location) {
		if (name != null && location != null) {
			try {
				pm.productupdate2(name, location);
			}catch (Exception e) {
				FailView.failMessageView(e.getMessage());
			}
		}else {
			EndView.invalidateReq("�����ϰ��� �ϴ� ��ǰ�� ���� ���峻�� ��ġ���� �ʽ��ϴ�. ��Ȯ�� ���ּ���.");
		}
	}
	public static void deletePruduct(String name) {
		if(name != null) {
			try {
				pm.productdelete(name);
				EndView.validateReq(name + " ���� ����");
			}catch (Exception e) {
				FailView.failMessageView(e.getMessage());
			}
		}else {
			EndView.invalidateReq("������ �õ��Ϸ��� ��ǰ�� �������� �ʽ��ϴ�.");
		}
	}
	
		public static void getProductMessage(Product product, String productName) {
		switch(productName) {
			case "����� �Ŀ�ġ":
			case "����̹�":
			case "���ô�":
			case "����":
			case "������̱�":
			case "�鵵��":
				fcontroller.getFranchiseMessage(productName);
				break;
				
			default:
				EndView.productView(product);	
		}
	}
	}

