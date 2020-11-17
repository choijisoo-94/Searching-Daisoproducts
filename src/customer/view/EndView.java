package customer.view;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import controller.OptionController;
import model.ProductModel;
import model.domain.Product;

public class EndView {
	
	static OptionController controller = new OptionController();
	
	// Ư�� ��ǰ ���
		public static void productView(Product product) {
			if (product != null) {
				System.out.println(product);
			} else {
				System.out.println("�˻��ϴ� ��ǰ�� �������� �ʽ��ϴ�.");
			}
		}
		
		// ��� ��ǰ ���
		public static void projectListView(ArrayList<Product> allProducts) {
			for (Product product : allProducts) {
				System.out.println("[��ǰ��] : " + product.getName());
			}
		}

		// ���ܰ� �ƴ� �ܼ� �޼��� ���
		public static void messageView(String message) {
			System.out.println(message);
		}
		
		// ���ܰ� �ƴ� �ܼ� �޼��� ���
		public static void serviceView() {
			System.out.println("\n � ���񽺸� ���Ͻó���? ���Ͻô� ���� ��ȣ�� �Է����ּ���^^");
			System.out.println("1. ��� ��ǰ ���� �˻�");
			System.out.println("2. �ϳ��� ��ǰ ��ġ �� ���� ���� �˻�");
			
			System.out.print("��ȣ �Է� : ");
			Scanner option = new Scanner(System.in);
			
			try {
				int optionNumber = option.nextInt();
				controller.reqProcess(optionNumber);
			}catch(InputMismatchException e){
				 System.out.println("���Ͻô� ���� ��ȣ�� ���Է����ּ���^^");
				 System.out.println("1. ��� ��ǰ ���� �˻�");
				 System.out.println("2. �ϳ��� ��ǰ ��ġ �� ���� ���� �˻�");
				 option = new Scanner(System.in);
				 int optionNumber = option.nextInt();
		         controller.reqProcess(optionNumber);
			}		
		}

		 

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