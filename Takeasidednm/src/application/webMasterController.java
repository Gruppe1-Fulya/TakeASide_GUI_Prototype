package application;

import javafx.scene.control.Button;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.stage.Stage;

public class webMasterController implements Initializable{

	@FXML
    private ComboBox<String> genderComboBox;
	@FXML
	private Button loginButton;
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		ObservableList<String> gendersList = FXCollections.observableArrayList("male","female","other");
    	genderComboBox.setItems(gendersList);
		
	}
	
	@FXML
    public void handleLoginLinkClick(ActionEvent event) {
        try {
            // Load the FXML file for the new window
        	FXMLLoader loader = new FXMLLoader(getClass().getResource("/application/webmasterHomepage.fxml"));
            Parent root = loader.load();

            // Create a new stage/window
            Stage newStage = new Stage();
            newStage.setScene(new Scene(root));
            newStage.setTitle("Webmaster Homepage");

            // Show the new window
            newStage.show();

            // Close the current window
            Stage currentStage = (Stage) loginButton.getScene().getWindow();
            currentStage.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
	
}