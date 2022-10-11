package view;

import controller.CDcontroller;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class AddCDView {
	
	public Scene showView(Stage stage){
		GridPane root = new GridPane();
		root.setHgap(10);
		root.setVgap(10);
		root.setPadding(new Insets(10, 10, 10, 10));
		
		Label fullNameLabel= new Label("Name: ");
		TextField fullNameField = new TextField();
		root.add(fullNameLabel, 1, 1);
		root.add(fullNameField, 2, 1);
		
		Label emailLabel= new Label("Email: ");
		TextField emailField = new TextField();
		root.add(emailLabel, 1, 2);
		root.add(emailField, 2, 2);
		
		Label CDnameLabel= new Label("CD Name: ");
		TextField CDnameField = new TextField();
		root.add(CDnameLabel, 1, 3);
		root.add(CDnameField, 2, 3);
		
		Label CDcodeLabel = new Label("CD Code(ID): ");
		PasswordField CDcodeField= new PasswordField();
		root.add(CDcodeLabel, 1, 4);
		root.add(CDcodeField, 2, 4);
		
		Label verifyCDcodeLabel = new Label("Verify CD Code(ID): ");
		PasswordField verifyCDcodeField= new PasswordField();
		root.add(verifyCDcodeLabel, 1, 5);
		root.add(verifyCDcodeField, 2, 5);
		
		Label type = new Label("Type: ");
		root.add(type, 1, 6);
		RadioButton Informative= new RadioButton("Informative");
		RadioButton Educational= new RadioButton("Educational");
		RadioButton Entertainment = new RadioButton("Entertainment");
		HBox h = new HBox();
		h.getChildren().addAll(Informative, Educational);
		VBox v= new VBox();
		v.getChildren().addAll(h, Entertainment);
		root.add(v, 2, 6);
		
		Label descriptionLabel= new Label("Description");
		root.add(descriptionLabel, 1, 7);
		TextArea  descriptionArea= new TextArea();
		root.add(descriptionArea, 2, 7);
		
		Button RegisterCDButton= new Button("Register CD");
		root.add(RegisterCDButton, 2, 10);
		
		RegisterCDButton.setOnAction(new EventHandler<ActionEvent>(){

			@Override
			public void handle(ActionEvent arg0) {
				String fullName= fullNameField.getText();
				String email= emailField.getText();
				String CDname= CDnameField.getText();
				String CDcode= CDcodeField.getText();
				String verifyCDcode= verifyCDcodeField.getText();
				String type= "";
				if(Informative.isSelected()){
					type=Informative.getText();
				}else{
					if(Educational.isSelected()){
						type=Educational.getText();
					}else{
						type=Entertainment.getText();
					}
				}
				String description=descriptionArea.getText();
				
				CDcontroller uc= new CDcontroller();
				boolean isRegistered = uc.AddCD(fullName, email, CDname, CDcode, verifyCDcode ,type, description);
				if(isRegistered){
					Alert successAlert= new Alert(AlertType.CONFIRMATION);
					successAlert.setHeaderText("The CD was registered successfully!");
					successAlert.showAndWait();
					AddorRetrieve lv= new AddorRetrieve();
					
					stage.setScene(lv.showView(stage));
					successAlert.close();
				}else{
					Alert errorAlert= new Alert(AlertType.ERROR);
					errorAlert.setHeaderText("The CD was not registered in the library!");
					errorAlert.show();
				}
				
			}
			
		});
		
		Scene scene = new Scene(root, 700, 750);
		stage.setTitle("Register CD");
		return scene;
	}

}
