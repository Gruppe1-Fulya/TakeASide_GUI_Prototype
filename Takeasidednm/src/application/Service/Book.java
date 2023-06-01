package application.Service;
import java.util.ArrayList;

public class Book {
	
	private String book_id;
	private String b_name;
	private int release_year;
	private String autor;
	private int page_number;
	private String publisher;
	private float vote_rate;
	private ArrayList<String> genre = new ArrayList<>();
	
	public Book() {
		
	}
	
	public Book(String book_id, String b_name, int release_year ,String autor ,int page_number, String publisher, String genre) {
		this.book_id = book_id;
		this.b_name = b_name;
		this.release_year = release_year;
		this.autor = autor;
		this.page_number = page_number;
		this.publisher = publisher;
		this.genre = splitString(genre);
	}
	
	public String getBookId() {
		return book_id;
	}
	
	public String getName() {
		return b_name;
	}
	
	public int getYear() {
		return release_year;
	}
	
	public String getAutor() {
		return autor;
	}
	
	public int getPageNumber() {
		return page_number;
	}
	
	public String getPublisher() {
		return publisher;
	}
	
	public float getVoteRate() {
		return vote_rate;
	}
	
	public String getGenre() {
		return genre.toString();
	}

	
	public void setName(String a) {
		b_name = a;
	}
	
	public void setYear(int a) {
		release_year = a;
	}
	
	public void setAutor(String a) {
		autor = a;
	}
	
	public void setPageNumber(int a) {
		page_number = a;
	}
	
	public void setPubliher(String a) {
		publisher = a;
	}
	
	public void setVoteRate(float a) {
		vote_rate = a;
	}
	
	public void setGenre(String a) {
		genre.add(a);
	}
	
	@Override
	public boolean equals(Object anObject){
		if (anObject instanceof Book){
			Book y = (Book) anObject;
			if (getBookId().equals(y.getBookId())){
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
