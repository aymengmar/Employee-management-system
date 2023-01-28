package application;

import java.net.URL;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Observable;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class viewemployer implements Initializable {
@FXML
private TableView<employer>table;
@FXML
private TableColumn<employer,Integer>id;
@FXML
private TableColumn<employer,String>FirstName;
@FXML
private TableColumn<employer,String>lastName;
@FXML
private TableColumn<employer,Float>salary;
@FXML
private TableColumn<employer,Integer>Age;
@FXML
private TableColumn<employer,String>departement;
@FXML
private TableColumn<employer,String>adress;
@FXML
private TableColumn<employer,String>DateOfBi;


public ObservableList<employer>data=FXCollections.observableArrayList();



	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		
		
		try {
			String requete3 = "SELECT * FROM `employee` WHERE 1";
			Statement st = (Statement) MyConnectionAdmin.getInstence().getCnx().createStatement();
		ResultSet rs =st.executeQuery(requete3);
		while(rs.next()) {
			data.add(new employer(rs.getInt(1),rs.getString(2),rs.getString(3),
					rs.getFloat(4),rs.getInt(5),rs.getString(6),rs.getString(7),
					rs.getString(8)));
		}
		} catch (SQLException e) {
			System.err.println(e.getMessage());
		}
    	
		 id.setCellValueFactory(new PropertyValueFactory<employer,Integer>("id"));
		 FirstName.setCellValueFactory(new PropertyValueFactory<employer,String>("fname"));
		 lastName.setCellValueFactory(new PropertyValueFactory<employer,String>("name"));
		 salary.setCellValueFactory(new PropertyValueFactory<employer,Float>("salary"));
		 Age.setCellValueFactory(new PropertyValueFactory<employer,Integer>("age"));
		 departement.setCellValueFactory(new PropertyValueFactory<employer,String>("departement"));
		 adress.setCellValueFactory(new PropertyValueFactory<employer,String>("adress"));
		 DateOfBi.setCellValueFactory(new PropertyValueFactory<employer,String>("date_of_birth"));
		 
		table.setItems(data);
	}

}
