package application;

import java.io.IOException;
import java.text.ParseException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.TextField;

public class delateUpdateEmployes {
	
	
	@FXML
	private TextField id;
	@FXML
	private TextField fname1;
	
	@FXML
	private TextField lname1;
	@FXML
	private TextField salary1;
	@FXML
	private TextField age1;
	@FXML
	private TextField departement;
	@FXML
	private TextField adress;
	@FXML
	private TextField gender;
	@FXML
	private TextField eduaction;
	@FXML
	private TextField experience;
	@FXML
	private TextField nationality;
	@FXML
	private TextField mather_language;
	@FXML
	private TextField other_language;
	@FXML
	private TextField date_of_birth;
	@FXML
	private TextField contract_start;
	@FXML
	private TextField contract_end;
 
	
	
	public void getEmployeeBYid(ActionEvent e) throws IOException{
		
		
		//cenvertir le id  de String en int 
		String employeeid=id.getText();
		int EmployeeID=Integer.parseInt(employeeid);
		
		//appel de la methode get employee par id
		employer emp =emplyerCrud.getemployer(EmployeeID);
		
		
		//remplir le case dans interface avec le donner dans la classe employe.java
		fname1.setText(emp.getFname());
		lname1.setText(emp.getName());
		
		//convertir le type de int ou flout en type String
		
		salary1.setText(String.valueOf(emp.getSalary()));;
		age1.setText(String.valueOf(emp.getAge()));
		//remplir le case dans interface avec le donner dans la classe employe.java
		departement.setText(emp.getDepartement());
		adress.setText(emp.getAdress());
		gender.setText(emp.getGebdes());
		eduaction.setText(emp.getEducation());
		experience.setText(emp.getExperence());
		nationality.setText(emp.getNationality());
		mather_language.setText(emp.getMather_langage());
		other_language.setText(emp.getOther_langage());
		date_of_birth.setText(emp.getDate_of_birth());
		contract_start.setText(emp.getContrat_started());
		contract_end.setText(emp.getContrat_end());
		
		
		
		
}
	
	
	public void updateEmployee(ActionEvent e ) throws IOException,ParseException{
		//cenvertir l'id de String vers int 
		String idEmployee=id.getText();
		int IDEmployee=Integer.parseInt(idEmployee);
		
		
		 
		//declaration de la variable de interface en des variable String 
		
		String FirstName= fname1.getText();
		String LastName= lname1.getText();
		
		
		//cenvetir de donner  sous la forme String en int 
		float Salaryf=Float.parseFloat(salary1.getText());
		//cenvetir de donner  sous la forme String en flout
		int   Agei=Integer.parseInt(age1.getText());
		
		
		
		String Departement= departement.getText();
		String Adress= adress.getText();
		String Gender= gender.getText();
		String Eduaction= eduaction.getText();
		String Experience= experience.getText();
		String Nationality= nationality.getText();
		String Mather_language= mather_language.getText();
		String Other_language= other_language.getText();
		String Date_of_birth= date_of_birth.getText();
		String Contract_start= contract_start.getText();
		String Contract_end= contract_end.getText();
		
		
		
		
		
		
		//cration de lobject employer de la classe employee.java
				employer emp = new employer();
		//trensef le donner dans  employee.java
	    emp.setId(IDEmployee);
		emp.setFname(FirstName);
		emp.setName(LastName);
		emp.setSalary(Salaryf); 
		emp.setAge(Agei);
		emp.setDepartement(Departement);
		emp.setAdress(Adress);
		emp.setGebdes(Gender);
		emp.setEducation(Eduaction);
		emp.setExperence(Experience);
		emp.setNationality(Nationality);
		emp.setMather_langage(Mather_language);
		emp.setOther_langage(Other_language);
		emp.setDate_of_birth(Date_of_birth);
		emp.setContrat_started(Contract_start);
		emp.setContrat_end(Contract_end);
		
		
		//trensef le donner dans  employeeCrud.java
		int state = emplyerCrud.UpdateEmployer(emp);
		
		if (state>0) {
			Alert alert = new Alert(AlertType.INFORMATION);
		 	 alert.setTitle("Data insert");
        	 alert.setHeaderText("Information Dialog");
        	 alert.setContentText("Record Saved Successfully");
        	 
             alert.showAndWait();
			
		}else {
			 //cration d'allert d'erreur 
			
            Alert alert= new Alert(AlertType.ERROR);
        	 
        	 alert.setTitle("Data insert");
        	 alert.setHeaderText("ERROR Dialog");
        	 alert.setContentText("Sorry!unable to save record");
        	 
             alert.showAndWait();
			
		}
	
			
		}
	
	public void deleteEmployee(ActionEvent e ) throws IOException {
		
		
		String ID=id.getText();
		int id = Integer.parseInt(ID);
		
		int state = emplyerCrud.DelateEmployer(id);
		
		if (state>0) {
			Alert alert = new Alert(AlertType.INFORMATION);
		 	 alert.setTitle("Data delate");
        	 alert.setHeaderText("Information Dialog");
        	 alert.setContentText("Record Saved Successfully");
        	 
             alert.showAndWait();
			
		}else {
			 //cration d'allert d'erreur 
			
            Alert alert= new Alert(AlertType.ERROR);
        	 
        	 alert.setTitle("Data delate");
        	 alert.setHeaderText("ERROR Dialog");
        	 alert.setContentText("Sorry!unable to save record");
        	 
             alert.showAndWait();
			
		}
		
		
	}
		
		
		
	}


