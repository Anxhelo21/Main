package view;

import controller.CDcontroller;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class CDView extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		AddorRetrieve lv= new AddorRetrieve();
		primaryStage.setScene(lv.showView(primaryStage));
		primaryStage.show();
	}
	
	
	public static void main(String [] args){
		launch(args);
	}
}
