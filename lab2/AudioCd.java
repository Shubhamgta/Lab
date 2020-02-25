package lab2;

public class AudioCd extends MediaItem{
//	added private data for artist and genre. When needed, override/overload methods from the superclass.
	private String artist;
	private String genre;

	public AudioCd(String id, String nm, String gen, String art, int tm) {
		// TODO Auto-generated constructor stub
		super(id, nm, tm);
		this.genre = gen;
		this.artist = art;
	}

	protected String getArtist() {
		return artist;
	}

	protected void setArtist(String artist) {
		this.artist = artist;
	}

	protected String getGenre() {
		return genre;
	}

	protected void setGenre(String genre) {
		this.genre = genre;
	}

}
