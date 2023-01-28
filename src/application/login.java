package application;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class login {
	@FXML
	Label Conlb;
	
	@FXML
	Label Check;
	@FXML
	TextField UserName;
	@FXML
	PasswordField Password;
	
//*************************Methode de verifier la connection avec le MYSQL**********************
	public void statusDB(ActionEvent e) {
		if (MyConnectionAdmin.getInstence() != null) {
			Conlb.setText("connected");
		}else {
			Conlb.setText("Faild to connect ");
		}
		
	}
//***********************************Methode de Login***************************************************

	public void enterCP(ActionEvent e) throws IOException {
		List<Admin> myList =AdminCrud.getAdmin();//from MySQL
		Map<String,String>map=new HashMap<String , String>();//crartion de Map(KeyWords,Value)
		//Map<UserName,Password>
		for (Admin a:myList) {
			map.put(a.getUserName(), a.getPassword());
		if (map.containsKey(UserName.getText())) {
			String val2=map.get(UserName.getText());//declarer UserName dans un variable VAL2
			
			if(val2.equals(Password.getText())) {
				Check.setText("Succes");
				MyConnectionAdmin.getInstence();
				
				
				//passage de la page Suivent 
				
				Stage primaryStage = new Stage();
				Parent root=FXMLLoader.load(getClass().getResource("ControlPanel.fxml"));

				Scene scene = new Scene(root,764,571);
				scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
				primaryStage.setScene(scene);
				primaryStage.show();
				
				
			}
			
			
			
		}else {
			Check.setText("Failed");
		}
			
		}
		
	}
	
	
	
	

}
