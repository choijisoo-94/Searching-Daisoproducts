package model.db;

import java.util.ArrayList;
import model.domain.Product;

public class VirtualDataBase {
	
	private static ArrayList<Product> all = new ArrayList<>();
		
		static {
			all.add(new Product("물병", 5, "A1 - 1", 5000));
			all.add(new Product("일회용 마스크", 3, "A1 - 2", 3000));
			all.add(new Product("샴푸", 15, "A2 - 1", 2000));
			all.add(new Product("주방세제", 8, "A2 - 2", 2000));
			all.add(new Product("마대자루", 2, "A2 - 3", 5000));
			all.add(new Product("돌아온 썬!", 20, "A3 - 1", 1000));
			all.add(new Product("왕꿈틀이", 15, "A3 - 2", 1000));
			all.add(new Product("포카리 스웨트", 25, "A3 - 3", 2500));
			all.add(new Product("이젤", 2, "B1 - 1", 5000));
			all.add(new Product("signo 노크식 볼펜", 10, "B1 - 2", 3000));
			all.add(new Product("바인더", 14, "B1 - 3", 2000));
			all.add(new Product("풍선", 7, "B1 - 4", 2000));
			all.add(new Product("C-TYPE 충전기", 35, "B2 - 1", 5000));
			all.add(new Product("이어폰", 25, "B2 - 2", 5000));
			all.add(new Product("미키마우스 양말", 13, "C1 - 1", 1000));
			all.add(new Product("꽃 프린팅 에코백", 2, "C1 - 2", 3000));
			all.add(new Product("메모리 폼 배게", 6, "C1 - 3", 5000));
			all.add(new Product("파운데이션", 5, "C2 - 1", 4000));
			all.add(new Product("머리띠", 40, "C2 - 2", 2000));
		}
		public static ArrayList<Product> getProducts(){
			return all;
		}
	
}
