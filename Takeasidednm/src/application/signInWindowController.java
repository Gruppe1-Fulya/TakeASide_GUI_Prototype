package application;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Hyperlink;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class signInWindowController implements Initializable{

    @FXML
    private ComboBox<String> genderComboBox;
    @FXML
    private Hyperlink returnLink;

    @FXML
    void Select(ActionEvent event) {
    }
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		ObservableList<String> gendersList = FXCollections.observableArrayList("male","female","other");
    	genderComboBox.setItems(gendersList);
	}
	
	@FXML
	public void handleGoBackLinkClick(ActionEvent event) {
	    try {
	        // Load the FXML file for the first window
	        FXMLLoader loader = new FXMLLoader(getClass().getResource("/application/Sample.fxml"));
	        Parent root = loader.load();

	        // Create a new stage/window
	        Stage newStage = new Stage();
	        newStage.setScene(new Scene(root));
	        newStage.setTitle("First Window");

	        // Show the first window
	        newStage.show();

	        // Close the current window
	        Stage currentStage = (Stage) returnLink.getScene().getWindow();
	        currentStage.close();
	    } catch (IOException e) {
	        e.printStackTrace();
	    }
	}


}