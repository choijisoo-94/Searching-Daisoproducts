

package model.db;

import java.util.ArrayList;
import model.domain.Admin;

public class AdminDB {
	
	private static ArrayList<Admin> adminAll = new ArrayList<>();
		
		static {
			adminAll.add(new Admin("������","jjw0518","0022"));
			adminAll.add(new Admin("������","jsjs94","0011"));		
		}
		public static ArrayList<Admin> getAdmins(){
			return adminAll;
		}
	
}

