package lab2;

public class Book extends WrittenItem {

	public Book (String id, String nm, String author) {
		// TODO Auto-generated constructor stub
		super(id, nm, author);
		
	}
	
	@Override
	public boolean equals(Object obj) {
		if(this == obj)
			return true;
		
		if(obj == null || !(obj instanceof Item)) {
			return false;
		}
		Item i = (Item)obj;
		
		return this.getIdNum() == i.getIdNum();
	}

	
	

}
