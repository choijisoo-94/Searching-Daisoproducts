package customer.view;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import controller.FranchiseController;
import controller.OptionController;
import model.domain.Franchise;
import model.domain.Product;

public class EndView {
	static FranchiseController fcontroller = new FranchiseController();
	
	static OptionController controller = new OptionController();
	
	// Ư�� ��ǰ ���
		public static void productView(Product product) {
			if (product != null) {
				System.out.println(product);
			} else {
				System.out.println("�˻��ϴ� ��ǰ�� �������� �ʽ��ϴ�. \n");
			}
		}
		
		// ��� ��ǰ ���
		public static void productListView(ArrayList<Product> allProducts) {
			for (Product product : allProducts) {
				System.out.println("[��ǰ��] : " + product.getName());
			}
		}
		
		//Ư�� ������ ���
		public static void franchiseView(Franchise franchises) {
			if (franchises != null) {
				System.out.println(franchises);
			} else {
				System.out.println("��ǰ�� �ִ� �������� �������� �ʽ��ϴ�. +\n");
				EndView.serviceView();
			}
		}
		
		// ��� ������ ���
		public static void franchiseListView(ArrayList<Franchise> allFranchisess) {
			for (Franchise franchise : allFranchisess) {
				System.out.println("[��������] : " + franchise.getFranchisename() + "    [������ ��ȣ] : " + franchise.getFranchisenumber());
			}
		}
		
		// Ư�� ������ ���
		public static void selectFranchiseList(ArrayList<Franchise> allFranchisess) {
			for (Franchise franchise : allFranchisess) {
				System.out.println("[��������] : " + franchise.getFranchisename() + "    [������ ��ȣ] : " + franchise.getFranchisenumber()+ "    [��ǰ��] : " + franchise.getName());
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
			System.out.println("3. ��ǰ ���� ������ ���� �˻�");
			System.out.println("4. ������ ä��");
			System.out.println("5. �α׾ƿ�");

			System.out.print("��ȣ �Է� : ");
			Scanner option = new Scanner(System.in);
			
			try {
				int optionNumber = option.nextInt();
				controller.reqProcess(optionNumber);
			}catch(InputMismatchException e){
				 System.out.println("���Ͻô� ���� ��ȣ�� ���Է����ּ���^^");
				 System.out.println("1. ��� ��ǰ ���� �˻�");
				 System.out.println("2. �ϳ��� ��ǰ ��ġ �� ���� ���� �˻�");
				 System.out.println("3. ��ǰ ���� ������ ������ �˻�");
				 System.out.println("4. ������ ä��");
				 System.out.println("5. �α׾ƿ�");
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
			if(prod == null) {
				System.out.println("[�����͹̳��� ���̼� ê�� ] : �ش� ��ǰ�� ǰ���Ǿ��ų� ���� ��ǰ �Դϴ�.");
			}else {
				System.out.println("�˻��� ��ǰ ���� : " + prod);
			}
		}
		public static void viewProdAll(ArrayList<Product> all) {
			System.out.println("��� ��ǰ ����");
			for(Product p : all) {
				System.out.println(p);
			}
		}
}