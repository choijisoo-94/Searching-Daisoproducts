package controller;

import java.util.ArrayList;

<<<<<<< HEAD
import customer.view.EndView;
=======
import admin.view.EndView;
>>>>>>> dc15594c554769f17def89a19438e85cc40a6c6d
import model.ProductModel;
import model.domain.Product;

import view.FailView;


public class ProductController {
	private static ProductModel pm = new ProductModel();
	
<<<<<<< HEAD
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
=======
	public static void getProductList() {
		ArrayList<Product> productList = pm.getProducts();
		
		if(productList.size() != 0) {
			EndView.viewProdAll(productList);
		}else {
			EndView.invalidateReq("어떠한 상품도 존재하지 않습니다.");
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
				EndView.validateReq("상품 등록 완료");
			}catch (Exception e) {
				//e.printStackTrace();
				FailView.failMessageView(e.getMessage());
			}
		}else {
		EndView.invalidateReq("새로 저장하고자 하는 상품의 입력 정보가 이미 존재합니다. 재확인 해주세요." );
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
			EndView.invalidateReq("수정하고자 하는 상품재고가 존재하지 않습니다. 재확인 해주세요.");
		}
	}
	public static void updateProduct2(String name, String location) {
		if (name != null && location != null) {
			EndView.validateReq("수정하고자 하는 상품 정보를 찾았습니다." );
			try {
				pm.productupdate2(name, location);
			}catch (Exception e) {
				FailView.failMessageView(e.getMessage());
			}
		}else {
			EndView.invalidateReq("수정하고자 하는 상품이 현재 매장내에 위치하지 않습니다. 재확인 해주세요.");
		}
	}
	public static void deletePruduct(String name) {
		if(name != null) {
			try {
				pm.productdelete(name);
				EndView.validateReq(name + "삭제 성공");
			}catch (Exception e) {
				FailView.failMessageView(e.getMessage());
			}
		}else {
			EndView.invalidateReq("삭제를 시도하려는 상품이 존재하지 않습니다.");
		}
	}
	
	}
>>>>>>> dc15594c554769f17def89a19438e85cc40a6c6d
