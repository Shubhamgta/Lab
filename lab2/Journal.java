package lab2;


public class Journal extends WrittenItem {
	// JournalPaper: added private data for year published
	private String date;
	

	public Journal (String id, String nm, String author, String Date) {
		// TODO Auto-generated constructor stub
		super(id, nm, author);
		this.date = Date;
		
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	

	
	

}
