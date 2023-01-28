package application;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;





public  class AdminCrud {
	java.sql.Connection cnx2;
	
	public AdminCrud() {
		cnx2 = MyConnectionAdmin.getInstence().getCnx();
		}
//*******************************Methode d'affichage de MYSQL*********************************
	public static  List<Admin>getAdmin(){
    	List<Admin> myList = new ArrayList<Admin>();
    	try {
			String requete3 = "SELECT * FROM `users`";
			Statement st = (Statement) MyConnectionAdmin.getInstence().getCnx().createStatement();
		ResultSet rs =st.executeQuery(requete3);
		while(rs.next()) {
			Admin p = new Admin();
			p.setId(rs.getInt(1));//numero du colone id 
			p.setUserName(rs.getString(2));
			p.setPassword(rs.getString(3));
			myList.add(p);
		}
		} catch (SQLException e) {
			System.err.println(e.getMessage());
		}
    	
		return myList;
		
    	
    }
	
	
	
	
	
	
	
}
