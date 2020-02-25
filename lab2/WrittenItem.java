package lab2;

public abstract class WrittenItem extends Item {
	private String authorName;
	
	
	public WrittenItem (String id, String nm, String author) {
		// TODO Auto-generated constructor stub
		super(id, nm);
		this.authorName = author;
	}
	

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	
	public void updateId(String id) {
		this.setIdNum(id);
	}
	
	public void updateTitle(String nm) {
		this.setTitle(nm);
	}

	public String getAuthorName() {
		return authorName;
	}
	
	


}
