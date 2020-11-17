package controller;

import java.util.ArrayList;

import customer.view.EndView;
import model.ProductModel;
import model.domain.Product;

public class ProductController {
	private static ProductModel pm = new ProductModel();
	
	// ��� ��ǰ �˻�
	public void getProductList() {
		ArrayList<Product> products = pm.getProducts();	
		
		if(products.size() != 0) {
			EndView.projectListView(products);	
		}else {
			EndView.messageView("���� ��ǰ ��� �������� �ʽ��ϴ�.");
		}
	}
	
	// Ư�� ��ǰ �˻�
	public static void getProjectMessage(Product product) {
		EndView.productView(product);
	}
	
	/*
	 * Ư����ǰ �˻� �� �ش� ��ǰ�� ������, �ٸ� ������ ��õ�ص帮�ڽ��ϴ�.
	 * ȫ��, ����, �Ǵ� ��� �����Ű��� ? �� ��ġ������ �Ǵ밡 ���� �������ϴ�.
	 * �Ǵ��������� �ش� ��ǰ�� �����մϴ�.
	 */
	
	// ���� ���ϸ� ���� ������ ���� �˻�

}
