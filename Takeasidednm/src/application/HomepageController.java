package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class HomepageController<T> implements Initializable{
	
	@FXML
	private ListView<T> homepageMoviesListView;	
	@FXML
	private ListView<T> homepageBooksListView;	
	@FXML
	private ListView<T> homepageGamesListView;	
	@FXML
	private TextField moviepageSearchBarTextField;	
	@FXML
	private TextField moviepageYearTextField;
	@FXML
	private TextField moviepageGenreTextField;
	@FXML
	private TextField moviepageDirectorTextField;
	@FXML
	private TextField moviepageScenaristTextField;
	@FXML
	private TextField moviepageProducerTextField;
	@FXML
	private ListView<T> moviepageMoviesListView;
	@FXML
	private Button moviepageFilterButton;
	@FXML
	private Button moviepageLikeButton;
	@FXML
	private Button moviepageDislikeButton;
	@FXML
	private TextArea moviepageDescriptionTextArea;
	
	
	@FXML
	private TextField bookpageSearchBarTextField;	
	@FXML
	private TextField bookpageYearTextField;
	@FXML
	private TextField bookpageGenreTextField;
	@FXML
	private TextField bookpageAutorTextField;
	@FXML
	private TextField bookpagePageNumberTextField;
	@FXML
	private ListView<T> bookpageBooksListView;
	@FXML
	private Button bookpageFilterButton;
	@FXML
	private Button bookpageLikeButton;
	@FXML
	private Button bookpageDislikeButton;
	@FXML
	private TextArea bookpageDescriptionTextArea;

	
	
	@FXML
	private TextField gamepageSearchBarTextField;	
	@FXML
	private TextField gamepageYearTextField;
	@FXML
	private TextField gamepageGenreTextField;
	@FXML
	private TextField gamepageDeveloperTextField;
	@FXML
	private TextField gamepageTypeTextField;
	@FXML
	private TextField gamepageDuraionTextField;
	@FXML
	private ListView<T> gamepageGamesListView;
	@FXML
	private Button gamepageFilterButton;
	@FXML
	private Button gamepageLikeButton;
	@FXML
	private Button gamepageDislikeButton;
	@FXML
	private TextArea gamepageDescriptionTextArea;
	
	
	
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
	}
	
	
	
}
