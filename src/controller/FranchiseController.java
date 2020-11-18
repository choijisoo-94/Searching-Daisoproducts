package controller;

import java.util.ArrayList;

import customer.view.EndView;
import model.FranchiseModel;
import model.domain.Franchise;
import model.domain.Product;

public class FranchiseController {
	private static FranchiseModel fmodel = new FranchiseModel();
	
	// ��� ������ �˻�
	public void getFranchiseList() {
		ArrayList<Franchise> franchises = fmodel.getFranchises();	
		
		if(franchises.size() != 0) {
			EndView.franchiseListView(franchises);
		}else {
			EndView.messageView("�������� �������� �ʽ��ϴ�.");
		}
	}
	
	// Ư�� ������ �˻�
	public static void getFranchiseMessage(String productname) {
		if(productname!=null) {
			Franchise franchise = fmodel.selectFranchises(productname);
			EndView.franchiseView(franchise);
		}else {
			view.FailView.failMessageView("��ǰ�� �������� �ʽ��ϴ�.");
		}
	
	}
}
