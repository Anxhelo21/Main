package view;

import controller.CDcontroller;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import model.CD;

public class AddorRetrieve {
	
	public Scene showView(Stage primaryStage){
		GridPane root= new GridPane();
		root.setHgap(10);
		root.setVgap(10);
		root.setPadding(new Insets(10,10,10,10));
		root.setAlignment(Pos.CENTER);
		
		
		Label CDcodeLabel= new Label("CD Code(ID): ");
		PasswordField CDcodeField= new PasswordField();
		root.add(CDcodeLabel, 1, 2);
		root.add(CDcodeField, 2, 2);
		
		Button Retrieve= new Button("Retrieve");
		Button AddCD= new Button("Add CD");
		HBox h = new HBox();
		h.getChildren().addAll(Retrieve, AddCD);
		root.add(h, 2, 3);
		
		Retrieve.setOnAction(e->{
			CDcontroller uc= new CDcontroller();
			
			CD CD= uc.search(CDcodeField.getText());
			
			if(CD!=null){
				Alert successAlert= new Alert(AlertType.CONFIRMATION);
				successAlert.setHeaderText("The CD has been located!");
				successAlert.showAndWait();
				CDHomeView hv= new CDHomeView(CD);
				primaryStage.setScene(hv.showView(primaryStage));
			}else{
				Alert errorAlert= new Alert(AlertType.ERROR);
				errorAlert.setHeaderText("This CD is not regisetered!");
				errorAlert.show();
			}
		});
		
		
		AddCD.setOnAction(e->{
			AddCDView sv= new AddCDView();
			primaryStage.setScene(sv.showView(primaryStage));
		});
		
		Scene sc= new Scene(root, 400, 300);
		primaryStage.setTitle("Add or Retrieve CD Information");
		return sc;
		
	}

}
