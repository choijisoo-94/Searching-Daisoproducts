

package model.db;

import java.util.ArrayList;
import model.domain.Admin;

public class AdminDB {
	
	private static ArrayList<Admin> adminAll = new ArrayList<>();
		
		static {
			adminAll.add(new Admin("장종욱","jjw0518","0022"));
			adminAll.add(new Admin("최지수","jsjs94","0011"));		
		}
		public static ArrayList<Admin> getAdmins(){
			return adminAll;
		}
	
}

