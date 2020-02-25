package lab2;

public class VideoCd extends MediaItem {
	// added private data for director, genre and year released. When needed, override/overload methods from the superclass
	private String director;
	private String genre; 
	private String date; 
	
	public VideoCd(String id, String nm, String dir, String gen, String date, int tm) {
		// TODO Auto-generated constructor stub
		super(id, nm, tm);
		this.director = dir;
        this.genre = gen;
        this.date = date;
	}
	
	protected String getDate() {
		return date;
	}

	protected void setDate(String date) {
		this.date = date;
	}

	protected String getDir() {
		return director;
	}

	protected void setDir(String str) {
		this.director = str;
	}

	protected String getGenre() {
		return genre;
	}

	protected void setGenre(String genre) {
		this.genre = genre;
	}

}
