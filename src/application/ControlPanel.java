package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class ControlPanel {
	
//************************************passage de page 1 ********************************************
	public void ViewEmployer(ActionEvent e) throws IOException {
		
		Stage primaryStage = new Stage();
		Parent root=FXMLLoader.load(getClass().getResource("viewemployer.fxml"));

		Scene scene = new Scene(root,764,571);
		scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}
//************************************passage de page 2 ********************************************
		public void insertImployes(ActionEvent e) throws IOException {
			
			Stage primaryStage = new Stage();
			Parent root=FXMLLoader.load(getClass().getResource("insertImployes.fxml"));

			Scene scene = new Scene(root,1102.0,642.0);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
			
		}
		
		
		//************************************passage de page # ********************************************
				public void deleateUpdatemployes(ActionEvent e) throws IOException {
					
					Stage primaryStage = new Stage();
					Parent root=FXMLLoader.load(getClass().getResource("deleateUpdatemployes.fxml"));

					Scene scene = new Scene(root,1102.0,642.0);
					scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
					primaryStage.setScene(scene);
					primaryStage.show();
					
				}
}
