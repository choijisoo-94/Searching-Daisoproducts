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
				EndView.validateReq(name + " 삭제 성공");
			}catch (Exception e) {
				FailView.failMessageView(e.getMessage());
			}
		}else {
			EndView.invalidateReq("삭제를 시도하려는 상품이 존재하지 않습니다.");
		}
	}
	
		public static void getProductMessage(Product product, String productName) {
		switch(productName) {
			case "여행용 파우치":
			case "드라이버":
			case "낚시대":
			case "본드":
			case "헤어드라이기":
			case "면도기":
				fcontroller.getFranchiseMessage(productName);
				break;
				
			default:
				EndView.productView(product);	
		}
	}
	}

