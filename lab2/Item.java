package lab2;

public abstract class Item {
	// private data for: identification number, title, and number of copies
	private String idNum;
	private String title;
	private static int noOfCopy;
	
	public static int getNOOfCopy() {
		return noOfCopy;
	}
	
	    // constructors, getters, setters, equals, toString, print, checkIn, checkOut, addItem

	public Item(String id, String nm) {
		// TODO Auto-generated constructor stub
		// this(-1, "", -1);
		this.idNum = id;
		this.title = nm;
		this.noOfCopy++;

	}
	
//    protected abstract void setDetailsItem(String id, String nm, int noOfCopy);

	protected void setIdNum(String idNum) {
		this.idNum = idNum;
	}

	protected void setTitle(String title) {
		this.title = title;
	}

	public  String getIdNum() {
		return this.idNum;
	}

	public  String getTitle() {
		return this.title;
	}

	
	

}
