package application;
	



import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;



public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			Parent root=FXMLLoader.load(getClass().getResource("Main2.fxml"));

			Scene scene = new Scene(root,600,400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
		//MyConnection mc =MyConnection.getInstence();
		 
		//AdminCrud ab = new AdminCrud();
		//System.out.println(ab.getAdmin());
		
		//emplyerCrud ab = new emplyerCrud();
		//System.out.println(ab.getemployer());
	}
}
