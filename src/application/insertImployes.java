package application;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.time.LocalDate;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;


public class insertImployes {
	
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
	private DatePicker date_of_birth;
	@FXML
	private DatePicker contract_start;
	@FXML
	private DatePicker contract_end;

	
	
	
	public void insertData(ActionEvent e)throws IOException {
		
		
		
		//prendre le date a partir de calendrier de l'interface
		LocalDate dateofbirth =  date_of_birth.getValue();
		LocalDate contractStarted =  contract_start.getValue();
		LocalDate contractend=  contract_end.getValue();
		
		
		
		     //prendre le String a partir case de l'interface

               String firstName=fname1.getText();
               String lastName = lname1.getText();
               String salary = salary1.getText();
               String Age= age1.getText();
               String Departement = departement.getText();
               String Adress = adress.getText();
               String Gender = gender.getText();
               String Eduaction = eduaction.getText();
               String Experience = experience.getText();
               String Nationality = nationality.getText();
               String Mather_language = mather_language.getText();
               String Other_language = other_language.getText();
               
               
               //cenvertir la date saisi en String 
               String Date_of_birth = dateofbirth.toString();
               String Contract_start = contractStarted.toString();
               String Contract_end = contractend.toString();
               
               
             //cenvertir le String(salaire)en type float
               float fSalary = Float.parseFloat(salary);
               
             //cenvertir le String(Age)en type int
             int iAge=Integer.parseInt(Age);
             
             
             
             //cration de l'object employer de la classe employee.java
             employer emp = new employer();
             
             
             //envoyer les donner dans la classe employer.java
             emp.setFname(firstName);
             emp.setName(lastName);
             
             emp.setSalary(fSalary);
             emp.setAge(iAge);
             
             emp.setDepartement(Departement);
             emp.setAdress(Adress);
             emp.setDate_of_birth(Date_of_birth);
             emp.setGebdes(Gender);
             emp.setEducation(Eduaction);
             emp.setExperence(Experience);
             emp.setContrat_started(Contract_start);
             emp.setContrat_end(Contract_end);
             emp.setNationality(Nationality);
             emp.setMather_langage(Mather_language);
             emp.setOther_langage(Other_language);
             
             // appel de la methode de CRUD dans la classe employerCrud.java
             int status = emplyerCrud.CreatEmployer(emp);
             
             
             
             if (status>0) {
            	 
            	 //cration d'allert de confirmation 
            	 Alert alert= new Alert(AlertType.INFORMATION);
            	 
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
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
