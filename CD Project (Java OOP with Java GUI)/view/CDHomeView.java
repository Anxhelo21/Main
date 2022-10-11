package view;

import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import model.CD;

public class CDHomeView {
	private CD currentCD;
	
	public CDHomeView(CD currentCD){
		this.currentCD= currentCD;
	}
	
	public Scene showView(Stage stage){
		StackPane root= new StackPane();
		
		Button getCD = new Button("Get CD information.");
		root.getChildren().add(getCD);
		
		
		getCD.setOnAction(e->{
			Alert alert= new Alert(AlertType.INFORMATION);
			alert.setContentText(this.currentCD.toString());
			alert.setHeaderText("The CD information: ");
			alert.showAndWait();
		});
		
		Scene sc= new Scene(root, 400, 300);
		stage.setTitle("Welcome home!");
		return sc;
	}

}
