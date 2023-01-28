package application;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;





public class emplyerCrud {
	
	
static java.sql.Connection cnx2;
	
	public emplyerCrud() {
		cnx2 = MyConnectionAdmin.getInstence().getCnx();
		}
//*******************************Methode d'affichage de MYSQL*********************************
	public static  List<employer>getemployer(){
    	List<employer> myList = new ArrayList<employer>();
    	try {
			String requete3 = "SELECT * FROM `employee` WHERE 1";
			Statement st = (Statement) MyConnectionAdmin.getInstence().getCnx().createStatement();
		ResultSet rs =st.executeQuery(requete3);
		while(rs.next()) {
			employer p = new employer();
			
			p.setId(rs.getInt(1));
			p.setFname(rs.getString(2));
			p.setName(rs.getString(3));
			p.setSalary(rs.getFloat(4));
			p.setAge(rs.getInt(5));
			p.setDepartement(rs.getString(6));
			p.setAdress(rs.getString(7));
			p.setDate_of_birth(rs.getString(8));
			p.setGebdes(rs.getString(9));
			p.setEducation(rs.getString(10));
			p.setExperence(rs.getString(11));
			p.setContrat_started(rs.getString(12));
			p.setContrat_end(rs.getString(13));
			p.setNationality(rs.getString(14));
			p.setMather_langage(rs.getString(15));
			p.setOther_langage(rs.getString(16));
			
			
			myList.add(p);
		}
		} catch (SQLException e) {
			System.err.println(e.getMessage());
		}
    	
		return myList;
		
    	
    }
	
//*******************************Methode d'insertion *********************************

	
	public static int CreatEmployer(employer emp){
		int st=0;
    	try {
    		
    		String requete="INSERT INTO `javafx_mysql_project`.`employee` (`fname`, `name`, `salary`, `age`, `departement`, `adress`, `date_of_birth`, `gebdes`, `education`, `experence`, `Contrat_started`, `Contrat_end`, `nationality`, `mather_langage`, `other_langage`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?);";
    		PreparedStatement pr = (PreparedStatement) MyConnectionAdmin.getInstence().getCnx().prepareStatement(requete);
    		
    		pr.setString(1,emp.getFname());
    		pr.setString(2,emp.getName());
    		pr.setFloat(3,emp.getSalary());
    		pr.setInt(4,emp.getAge());
    		pr.setString(5, emp.getDepartement());
    		pr.setString(6,emp.getAdress());
    		pr.setString(7, emp.getDate_of_birth());
    		pr.setString(8, emp.getGebdes());
    		pr.setString(9,emp.getEducation());
    		pr.setString(10, emp.getExperence());
    		pr.setString(11, emp.getContrat_started());
    		pr.setString(12, emp.getContrat_end());
    		pr.setString(13, emp.getNationality());
    		pr.setString(14, emp.getMather_langage());
    		pr.setString(15, emp.getOther_langage());
    		   st=pr.executeUpdate();
    		
    		System.out.println("Data added");
			
	    
		} catch (SQLException e) {
			System.err.println(e.getMessage());
		}
    	return st;
    	
   } 	
	
	
	
//*******************************Methode Update*********************************

	
	
	public static int UpdateEmployer(employer emp) {
		int st = 0;
    	try {
        	String requete="UPDATE `employee` SET `fname`=?,`name`=?,`salary`=?,`age`=?,`departement`=?,`adress`=?,`date_of_birth`=?,`gebdes`=?,`education`=?,`experence`=?,`Contrat_started`=?,`Contrat_end`=?,`nationality`=?,`mather_langage`=?,`other_langage`=? WHERE id=?";

			PreparedStatement pr = (PreparedStatement) MyConnectionAdmin.getInstence().getCnx().prepareStatement(requete);
			pr.setString(1,emp.getFname());
    		pr.setString(2,emp.getName());
    		pr.setFloat(3,emp.getSalary());
    		pr.setInt(4,emp.getAge());
    		pr.setString(5, emp.getDepartement());
    		pr.setString(6,emp.getAdress());
    		pr.setString(7, emp.getDate_of_birth());
    		pr.setString(8, emp.getGebdes());
    		pr.setString(9,emp.getEducation());
    		pr.setString(10, emp.getExperence());
    		pr.setString(11, emp.getContrat_started());
    		pr.setString(12, emp.getContrat_end());
    		pr.setString(13, emp.getNationality());
    		pr.setString(14, emp.getMather_langage());
    		pr.setString(15, emp.getOther_langage());
			pr.setInt(16, emp.getId());
    		
    		
    		
			st=pr.executeUpdate();
			
			System.out.println(st);
			
		} catch (SQLException e) {
			System.err.println(e.getMessage());
		}
    	return st;
    	
    }	
	
	
//*******************************Methode suuprimer*********************************

	
	
	 public static int  DelateEmployer(int id) {
		 int st = 0;
	    	try {
		    	String requete="DELETE FROM `employee` WHERE `id`=?";

				PreparedStatement pr = (PreparedStatement) MyConnectionAdmin.getInstence().getCnx().prepareStatement(requete);
				pr.setInt(1,id);
				st=pr.executeUpdate();
				System.out.println("Data deleted");
				
				
			} catch (SQLException e) {
				System.err.println(e.getMessage());
			}
	    	return st ;
	    }
	 
//*******************************Recherche a traver le id*********************************

	
	public static employer getemployer(int id) {
		
		employer p = new employer();
		
		
		try {
			String requete3 = "SELECT * FROM `employee` WHERE id=?";
			PreparedStatement pr = (PreparedStatement) MyConnectionAdmin.getInstence().getCnx().prepareStatement(requete3);
			pr.setInt(1, id);
			ResultSet rs = pr.executeQuery();
			if(rs.next()) {
				p.setId(rs.getInt(1));
				p.setFname(rs.getString(2));
				p.setName(rs.getString(3));
				p.setSalary(rs.getFloat(4));
				p.setAge(rs.getInt(5));
				p.setDepartement(rs.getString(6));
				p.setAdress(rs.getString(7));
				p.setDate_of_birth(rs.getString(8));
				p.setGebdes(rs.getString(9));
				p.setEducation(rs.getString(10));
				p.setExperence(rs.getString(11));
				p.setContrat_started(rs.getString(12));
				p.setContrat_end(rs.getString(13));
				p.setNationality(rs.getString(14));
				p.setMather_langage(rs.getString(15));
				p.setOther_langage(rs.getString(16));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.err.println(e.getMessage());
		}
		
		
		
		return p;
		
	}
	
	

}
