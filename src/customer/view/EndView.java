package customer.view;

import java.util.ArrayList;

import model.domain.Product;

public class EndView {
		public static void invalidateReq(String message) {
			System.out.println("발생된 문제 : " + message);
		}
		public static void validateReq(String message) {
			System.out.println("정상 실행 : " + message);
		}
		public static void viewProd(Product prod) {
			System.out.println("검색된 상품 정보 : " + prod);
		}
		public static void viewProdAll(ArrayList<Product> all) {
			System.out.println("모든 상품 정보");
			for(Product p : all) {
				System.out.println(p);
			}
		}
}