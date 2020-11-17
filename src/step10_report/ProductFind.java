package step10_report;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ProductFind {
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		int pass = 0;
		System.out.println("찾으시려는 상품명을 입력하세요.");
		System.out.println("상품명 : ");
		String Product = scan.nextLine();
		File file = new File("C:\\Users\\Playdata\\Desktop\\ProductDB.txt");
		try {
			FileReader filereader = new FileReader(file);
			BufferedReader bufReader = new BufferedReader(filereader);
			String line = "";
			try {
				while((line = bufReader.readLine()) != null) {
					System.out.println(line.indexOf(Product));
					int passProduct = line.indexOf(Product);
					if(passProduct != -1) {
						System.out.print("상품찾기 성공! 재고가 있습니다.");
						pass = 1;}	}
				if(pass == 0) {
					System.out.println("상품찾기 실패입니다. 현재 재고가 없거나 상품명이 잘못되었습니다.");}
				bufReader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}	
	} catch (FileNotFoundException e) {
		e.printStackTrace();
		}
	}
}


