package controller;

import model.ProductModel;
import model.domain.Product;
import view.EndView;

public class ProductController {
	private static ProductModel pm = new ProductModel();
	
	public static void reqProcess(int reqNo) {
		if(reqNo == 1) {
			EndView.viewProdAll(pm.getProducts());
		}else if(reqNo == 2) {
			Product prod = pm.getProduct("일회용 마스크");
			if(prod != null) {
				EndView.viewProd(prod);
			}else {
				EndView.validateReq("해당 상품은 미 존재합니다.");
			}
		}else if(reqNo == 3) {
			boolean result = pm.update("왕꿈틀이", 10, "A3-2");
			if(result == true) {
				EndView.validateReq("상품 재고 수정 완료");
			}else {
				EndView.validateReq("취급하지 않는 상품 수정 불가");
			}
		}else if(reqNo == 4) {
			int result = pm.delete("왕꿈틀이");
			if(result == 1) {
				EndView.validateReq("상품 삭제 완료");
			}else {
				EndView.validateReq("삭제하려는 상품 정보가 없습니다.");
			}
		}else if (reqNo == 5) {
			try {
				pm.insert(new Product("Pocky", 16, "A3 - 1", 1500));
				EndView.validateReq("상품 등록 완료");
			}catch (Exception e) {
				e.printStackTrace();
				EndView.invalidateReq("이미 등록된 상품입니다. 다시 시도하세요.");
			}
		}else {
			EndView.invalidateReq("요청에 부합되는 서비스가 없습니다.");
		}
	}
}