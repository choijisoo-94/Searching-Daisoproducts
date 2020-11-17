package step10_report;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class ProductSave {

	
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		File file = new File("C:\\Users\\Playdata\\Desktop\\ProductDB.txt");
		try {
			FileWriter filewritter = new FileWriter(file, true);
			if(file.isFile() && file.canWrite()) {
				System.out.println("상품의 이름과 위치를 입력하세요.");
				System.out.print("상품 이름 : ");
				filewritter.append(scan.nextLine());
				filewritter.append("\t");
				System.out.println("위치 : ");
				filewritter.append(scan.nextLine());
				filewritter.append("\r");
				System.out.println("상품이 등록되었습니다.");
			}
			filewritter.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}

}

