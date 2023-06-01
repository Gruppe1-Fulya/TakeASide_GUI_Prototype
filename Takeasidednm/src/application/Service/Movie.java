package application.Service;
import java.util.ArrayList;

public class Movie {
	
	private String movie_id;
	private String m_name;
	private int release_year;
	private String director;
	private ArrayList<String> scenarist = new ArrayList<>();
	private String producer;
	private float vote_rate;
	private ArrayList<String> genre = new ArrayList<>();
	private ArrayList<String> actor = new ArrayList<>();
	
	public Movie() {
		
	}
	
	public Movie(String movie_id, String m_name, int release_year, String director, String scenarist, String producer, String genre, String actor) {
		this.movie_id = movie_id;
		this.m_name = m_name;
		this.release_year = release_year;
		this.director = director;
		this.scenarist = splitString(scenarist);
		this.producer = producer;
		this.genre = splitString(genre);
		this.actor = splitString(actor);
	}
	
	public String getMovieId() {
		return movie_id;
	}
	
	public String getName() {
		return m_name;
	}
	
	public int getYear() {
		return release_year;
	}
	
	public String getDirector() {
		return director;
	}
	
	public String getScenarist() {
		return scenarist.toString();
	}
	
	public String getProducer() {
		return producer;
	}
	
	public float getVoteRate() {
		return vote_rate;
	}
	
	public String getGenre() {
		return genre.toString();
	}
	
	public String getType() {
		return actor.toString();
	}
	
	public void setName(String a) {
		m_name = a;
	}
	
	public void setYear(int a) {
		release_year = a;
	}
	
	
	public void setDirector(String a) {
		director = a;
	}
	
	public void setScenarist(String a) {
		scenarist.add(a);
	}
	
	public void setProducer(String a) {
		producer = a;
	}
	
	public void setVoteRate(float a) {
		vote_rate = a;
	}
	
	public void setGenre(String a) {
		genre.add(a);
	}
	
	public void setActor(String a) {
		actor.add(a);
	}
	
	@Override
	public boolean equals(Object anObject){
		if (anObject instanceof Movie){
			Movie y = (Movie) anObject;
			if (getMovieId().equals(y.getMovieId())){
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
