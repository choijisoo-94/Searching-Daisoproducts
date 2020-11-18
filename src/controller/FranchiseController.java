package controller;

import java.util.ArrayList;

import customer.view.EndView;
import model.FranchiseModel;
import model.domain.Franchise;
import model.domain.Product;

public class FranchiseController {
	private static FranchiseModel fmodel = new FranchiseModel();
	
	// 모든 가맹점 검색
	public void getFranchiseList() {
		ArrayList<Franchise> franchises = fmodel.getFranchises();	
		
		if(franchises.size() != 0) {
			EndView.franchiseListView(franchises);
		}else {
			EndView.messageView("가맹점이 존재하지 않습니다.");
		}
	}
	
	// 특정 가맹점 검색
	public static void getFranchiseMessage(String productname) {
		if(productname!=null) {
			Franchise franchise = fmodel.selectFranchises(productname);
			EndView.franchiseView(franchise);
		}else {
			view.FailView.failMessageView("상품이 존재하지 않습니다.");
		}
	
	}
}
