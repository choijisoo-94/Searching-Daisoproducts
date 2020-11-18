package model.db;

import java.util.ArrayList;

import model.domain.Franchise;

public class FranchiseDataBase {

	private static ArrayList<Franchise> total = new ArrayList<>();
	
	static {
		total.add(new Franchise("홍대점", "02-789-3423", "여행용 파우치", 3, "A1 - 1", 5000));
		total.add(new Franchise("건대점", "02-768-3564", "면도기", 2,"A1 - 2", 3000));
		total.add(new Franchise("신촌점", "02-725-3364", "헤어드라이기", 1,"A2 - 1", 50000));
		total.add(new Franchise("강남대로점", "02-723-3757", "여행용 파우치", 4, "A2 - 2", 5000));
		total.add(new Franchise("강남본점","02-736-3473",  "드라이버", 5, "A2 - 3", 20000));
		total.add(new Franchise("영동프라자점", "02-7124-3757", "드라이버", 3, "A3 - 1", 20000));
		total.add(new Franchise("신논현역점", "02-767-3768", "낚시대", 2,"A3 - 3", 100000));
		total.add(new Franchise("신사역점", "02-712-3253", "낚시대", 5,"B1 - 1", 100000));
		total.add(new Franchise("남부터미널점", "02-763-3895", "본드", 4, "B1 - 2", 2000));
		total.add(new Franchise("교대역점", "02-773-3478", "헤어드라이기", 2, "B1 - 3", 50000));
		total.add(new Franchise("강남본점", "02-795-3374", "본드", 1,"B1 - 4", 2000));
		total.add(new Franchise("롯데마트서초점", "02-752-3783", "헤어드라이기", 3,"B2 - 1", 50000));
		total.add(new Franchise("양재2호점", "02-784-3893", "본드", 5,"B2 - 2", 2000));
		total.add(new Franchise("도곡점", "02-789-3273", "헤어드라이기", 3, "C1 - 1", 50000));
		total.add(new Franchise("방배역점", "02-753-3635", "여행용 파우치", 4, "C1 - 2", 5000));
		total.add(new Franchise("매봉역점", "02-743-3834", "면도기", 3, "C1 - 3", 3000));
		total.add(new Franchise("회기역점", "02-773-3899", "면도기", 2, "C2 - 1", 3000));
		total.add(new Franchise("청량리역점", "02-767-3316", "여행용 파우치", 1, "C2 - 2", 5000));
	}
	public static ArrayList<Franchise> getFranchises(){
		return total;
	}
}
