package application.Service;
import java.util.ArrayList;

public class Game {
	
	private String game_id;
	private String g_name;
	private int release_year;
	private int duration;
	private String developer;
	private float vote_rate;
	private ArrayList<String> genre = new ArrayList<>();
	private ArrayList<String> ex_type = new ArrayList<>();
	
	public Game() {
		
	}
	
	public Game(String game_id, String g_name, int release_year, int duration, String developer, String genre, String ex_type) {
		this.game_id = game_id;
		this.g_name = g_name;
		this.release_year = release_year;
		this.duration = duration;
		this.developer = developer;
		this.genre = splitString(genre);
		this.ex_type = splitString(ex_type);
	}
	
	public String getGameId() {
		return game_id;
	}
	
	public String getName() {
		return g_name;
	}
	
	public int getYear() {
		return release_year;
	}
	
	public int getDuration() {
		return duration;
	}
	
	public String getDeveloper() {
		return developer;
	}
	
	public float getVoteRate() {
		return vote_rate;
	}
	
	public String getGenre() {
		return genre.toString();
	}
	
	public String getType() {
		return ex_type.toString();
	}
	
	
	public void setName(String a) {
		g_name = a;
	}
	
	public void setYear(int a) {
		release_year = a;
	}
	
	
	public void setDuration(int a) {
		duration = a;
	}
	
	public void setDeveloper(String a) {
		developer = a;
	}
	
	public void setVoteRate(float a) {
		vote_rate = a;
	}
	
	public void setGenre(String a) {
		genre.add(a);
	}
	
	public void setType(String a) {
		ex_type.add(a);
	}
	
	@Override
	public boolean equals(Object anObject){
		if (anObject instanceof Game){
			Game y = (Game) anObject;
			if (getGameId().equals(y.getGameId())){
				return true;
			}
			return false;
	    }
	    return false;
	}
	
	public static ArrayList<String> splitString(String input) {
        ArrayList<String> substrings = new ArrayList<>();
        
        // Split the input string by commas and add to the ArrayList
        String[] splitArray = input.split(",");
        for (String substring : splitArray) {
            substrings.add(substring);
        }
        
        return substrings;
    }

}
