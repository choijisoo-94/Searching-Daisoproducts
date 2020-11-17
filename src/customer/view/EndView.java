package customer.view;

import java.util.ArrayList;

import model.domain.Product;

public class EndView {
		public static void invalidateReq(String message) {
			System.out.println("�߻��� ���� : " + message);
		}
		public static void validateReq(String message) {
			System.out.println("���� ���� : " + message);
		}
		public static void viewProd(Product prod) {
			System.out.println("�˻��� ��ǰ ���� : " + prod);
		}
		public static void viewProdAll(ArrayList<Product> all) {
			System.out.println("��� ��ǰ ����");
			for(Product p : all) {
				System.out.println(p);
			}
		}
}