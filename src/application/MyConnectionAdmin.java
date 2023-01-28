package application;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class MyConnectionAdmin {
	
	
	    public String url="jdbc:mysql://localhost:3306/ javafx_mysql_project";
	    public String login="root";
	    public String pwd="";
	    Connection cnx;
	    
	    
	    public static MyConnectionAdmin instence;
	    private MyConnectionAdmin(){
	        try {
	         cnx= DriverManager.getConnection(url, login, pwd);
	            System.out.println("Connexion etablie");
	                    } catch (SQLException ex) {
	                        System.err.println(ex.getMessage());
	        }
	    }
	    
	    public Connection getCnx() {
			return cnx;
	    }
	    
	    
	    
	    
	    
	    
			
		public static MyConnectionAdmin getInstence() {
			if(instence == null) {
				instence=new MyConnectionAdmin();
			}
			return instence;
			
		}
		
		
		
		
		
		
		
	}


	
	
	
	

