package controller;

import java.util.Scanner;

import customer.view.EndView;
import model.ProductModel;

public class OptionController {
	
	static String daisoproduct="";
	
	public static void reqProcess(int reqNo) {
		
		ProductController controller = new ProductController();
		
		if(reqNo == 1) {
			//*** 01. ��� ��ǰ �˻� ***
			System.out.println("��� ��ǰ ���� �˻�");
			controller.getProductList();
			EndView.serviceView();
		}else if(reqNo == 2) {
			//*** 02. '�ղ�Ʋ��'��� �̸��� ��ǰ �˻� ***
			System.out.println("���Ͻô� ��ǰ���� �Է����ֽø� �ش� ��ǰ�� ��� ��ġ�� ������ �˷��帳�ϴ�. ^^ " + "\n\r");
			System.out.println("\n2. �ϳ��� ��ǰ ��ġ �� ���� ���� �˻� ");
			Scanner product = new Scanner(System.in);
			daisoproduct=product.nextLine();
			controller.getProjectMessage(ProductModel.getProduct(daisoproduct));
			EndView.serviceView();
//		}else if(reqNo == 3) {
//			boolean result = pm.update("�ղ�Ʋ��", 10, "A3-2");
//			if(result == true) {
//				EndView.validateReq("��ǰ ��� ���� �Ϸ�");
//			}else {
//				EndView.validateReq("������� �ʴ� ��ǰ ���� �Ұ�");
//			}
//		}else if(reqNo == 4) {
//			int result = pm.delete("�ղ�Ʋ��");
//			if(result == 1) {
//				EndView.validateReq("��ǰ ���� �Ϸ�");
//			}else {
//				EndView.validateReq("�����Ϸ��� ��ǰ ������ �����ϴ�.");
//			}
//		}else if (reqNo == 5) {
//			try {
//				pm.insert(new Product("Pocky", 16, "A3 - 1", 1500));
//				EndView.validateReq("��ǰ ��� �Ϸ�");
//			}catch (Exception e) {
//				e.printStackTrace();
//				EndView.invalidateReq("�̹� ��ϵ� ��ǰ�Դϴ�. �ٽ� �õ��ϼ���.");
//			}
//		}else {
//			EndView.invalidateReq("��û�� ���յǴ� ���񽺰� �����ϴ�.");
//		}
	}
	}
}
