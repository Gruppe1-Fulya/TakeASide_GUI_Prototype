package application;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.TextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;

public class SampleController {

    @FXML
    private TextField emailField;
    @FXML
    private TextField passwordField;
    @FXML
    private Hyperlink signInLink;
    @FXML
    private Button loginButton;
    @FXML
    private Hyperlink webmasterLink;
   
    
    @FXML
    public void handleSignInLinkClick(ActionEvent event) {
        try {
            // Load the FXML file for the new window
        	FXMLLoader loader = new FXMLLoader(getClass().getResource("/application/signInWindow.fxml"));
            Parent root = loader.load();

            // Create a new stage/window
            Stage newStage = new Stage();
            newStage.setScene(new Scene(root));
            newStage.setTitle("Sign in!");

            // Show the new window
            newStage.show();

            // Close the current window
            Stage currentStage = (Stage) signInLink.getScene().getWindow();
            currentStage.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
        
     @FXML
     public void handleWebmasterLinkClick(ActionEvent event) {
    	try {
            // Load the FXML file for the new window
        	FXMLLoader loader = new FXMLLoader(getClass().getResource("/application/webMaster.fxml"));
            Parent root = loader.load();

            // Create a new stage/window
            Stage newStage = new Stage();
            newStage.setScene(new Scene(root));
            newStage.setTitle("Webmaster");

            // Show the new window
            newStage.show();

            // Close the current window
            Stage currentStage = (Stage) webmasterLink.getScene().getWindow();
            currentStage.close();
        } catch (IOException e) {
            e.printStackTrace();
        } 
     }

    @FXML
    public void initialize() {
        Platform.runLater(() -> loginButton.requestFocus()); // Set focus to the submit button using Platform.runLater()
    }

    // Add any additional methods or event handlers as needed

}
