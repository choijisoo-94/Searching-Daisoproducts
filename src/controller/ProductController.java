package controller;

import model.ProductModel;
import model.domain.Product;
import view.EndView;
import view.FailView;

public class ProductController {
	private static ProductModel pm = new ProductModel();
	
	public static void reqProcess(int reqNo) {
		if(reqNo == 1) {
			EndView.viewProdAll(pm.getProducts());
		}else if(reqNo == 2) {
			Product prod = pm.getProduct("��ȸ�� ����ũ");
			if(prod != null) {
				EndView.viewProd(prod);
			}else {
				EndView.validateReq("�ش� ��ǰ�� �� �����մϴ�.");
			}
		}else if(reqNo == 3) {
			boolean result = pm.update("�ղ�Ʋ��", 10, "A3-2");
			if(result == true) {
				EndView.validateReq("��ǰ ��� ���� �Ϸ�");
			}else {
				EndView.validateReq("������� �ʴ� ��ǰ ���� �Ұ�");
			}
		}else if(reqNo == 4) {
			int result = pm.delete("�ղ�Ʋ��");
			if(result == 1) {
				EndView.validateReq("��ǰ ���� �Ϸ�");
			}else {
				EndView.validateReq("�����Ϸ��� ��ǰ ������ �����ϴ�.");
			}
		}else if (reqNo == 5) {
			try {
				pm.insert(new Product("Pocky", 16, "A3 - 1", 1500));
				EndView.validateReq("��ǰ ��� �Ϸ�");
			}catch (Exception e) {
				e.printStackTrace();
				FailView.failMessageView(e.getMessage());
			}
		}else {
			EndView.invalidateReq("���� �����ϰ��� �ϴ� ��ǰ�� �Է� ������ �̹� �����մϴ�. Ȯ���� �ּ���.");
		}
	}
}