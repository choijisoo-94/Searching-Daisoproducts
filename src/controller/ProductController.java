package controller;

import java.util.ArrayList;

import customer.view.EndView;
import model.ProductModel;
import model.domain.Product;

public class ProductController {
	private static ProductModel pm = new ProductModel();
	
	// 모든 상품 검색
	public void getProductList() {
		ArrayList<Product> products = pm.getProducts();	
		
		if(products.size() != 0) {
			EndView.projectListView(products);	
		}else {
			EndView.messageView("현재 상품 재고가 존재하지 않습니다.");
		}
	}
	
	// 특정 상품 검색
	public static void getProjectMessage(Product product) {
		EndView.productView(product);
	}
	
	/*
	 * 특정상품 검색 후 해당 상품이 없으면, 다른 매장을 추천해드리겠습니다.
	 * 홍대, 신촌, 건대 어디가 가까우신가요 ? 현 위치에서는 건대가 가장 가깝습니다.
	 * 건대점에서는 해당 물품이 존재합니다.
	 */
	
	// 구매 못하면 구매 가능한 매장 검색

}
