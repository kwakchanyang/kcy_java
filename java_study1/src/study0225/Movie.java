package study0225;

public class Movie {
	private String title;
	private String genre;
	private int year;
	
	public Movie() {};
	public Movie(String title,String genre,int year) {
		this.title=title;
		this.genre=genre;
		this.year=year;
	}
	// get은 가져오기 set은 저장하기
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	
	
}
